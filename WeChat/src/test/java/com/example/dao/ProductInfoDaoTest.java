package com.example.dao;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.bean.ProductInfo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoDaoTest {
	
	@Autowired
	private ProductInfoDao productIndoDao;
	
	@Test
	public void saveTest() {
		ProductInfo productInfo = new ProductInfo();
		productInfo.setProductId("123456");
		productInfo.setProductName("红烧肉");
		productInfo.setProductPrice(new BigDecimal(12.5));
		productInfo.setProductStock(100);
		productInfo.setProductDescription("VeryNice");
		productInfo.setProductIcon("http://xxxx.jpg");
		productInfo.setProductStatus(0);
		productInfo.setCategoryType(2);
		
		ProductInfo result = productIndoDao.save(productInfo);
		Assert.assertNotNull(result);
		
	}
	
	@Test
	public void findByProductStatus(){
		List<ProductInfo> productInfoList = productIndoDao.findByProductStatus(0);
		Assert.assertNotEquals(0, productInfoList.size());
	}

}
