package com.example.service.Impl;


import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.bean.ProductCategory;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {
	
	@Autowired
	private CategoryServiceImpl categoryService;
	
	@Test
	public void findOne() throws Exception{
		ProductCategory category = categoryService.findOne(1);
		Assert.assertEquals(new Integer(1), category.getCategoryId());
	}

	@Test
	public void findAll() throws Exception{
		List<ProductCategory> productCategorieList = categoryService.findAll();
		Assert.assertNotEquals(0, productCategorieList.size());
		
	}

	@Test
	public void findByCategoryTypeIn() throws Exception{
		List<ProductCategory> productCategorieList = categoryService.findByCategoryTypeIn(Arrays.asList(2,3));
		Assert.assertNotEquals(0, productCategorieList.size());
	}

	@Test
	public void save() throws Exception{
		ProductCategory productCategory = new ProductCategory("漫威最强榜", 5);
		ProductCategory result = categoryService.save(productCategory);
		Assert.assertNotNull(result);
		
	}

}
