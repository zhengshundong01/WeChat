 package com.example.dao;

import java.util.Arrays;
import java.util.List;

import javax.transaction.Transactional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.bean.ProductCategory;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryDaoTest {
	
	@Autowired
	private ProductCategoryDao productCategoryDao;
	
	@Test
	public void findOneTest(){
		ProductCategory productCategory = productCategoryDao.findOne(1);
		System.out.println(productCategory.toString());
		
	}
	
	@Test
	@Transactional		/**对数据库做的操作回滚，比如增加之后把记录删除，数据库不会留有数据**/
	public void saveTest(){
		ProductCategory productCategory = new ProductCategory("电影榜",4);
		ProductCategory result = productCategoryDao.save(productCategory);
		Assert.assertNotNull(result);
	}
	
	@Test
	public void findByCategoryTypeIn() {
		List<Integer> list = Arrays.asList(2,3,4);
		List<ProductCategory> reslut = productCategoryDao.findByCategoryTypeIn(list);
		Assert.assertNotEquals(0, reslut.size());
	}
	


}
