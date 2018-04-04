package com.example.service.Impl;


import java.math.BigDecimal;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.bean.ProductInfo;

import emums.ProductStatusEmum;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

	@Autowired
	private ProductServiceImpl productServiceImpl;
	
	@Test
	public void testFindOne() {
		ProductInfo productInfo = productServiceImpl.findOne("123456");
		Assert.assertEquals("123456", productInfo.getProductId());
	
	}

	@Test
	public void testFindAll() {
		List<ProductInfo> productInfoList = productServiceImpl.findAll();
		Assert.assertNotEquals(0, productInfoList.size());
	}

	@Test
	public void testFindAllPageable() {
		PageRequest request = new PageRequest(0,5);
		Page<ProductInfo> productInfoList = productServiceImpl.findAll(request); 
		System.out.println(productInfoList.getTotalElements());
		Assert.assertNotEquals(0, productInfoList.getTotalElements());
	}

	@Test
	public void testSave() {
		ProductInfo productInfo = new ProductInfo();
		productInfo.setProductId("123457");
		productInfo.setProductName("皮皮虾");
		productInfo.setProductPrice(new BigDecimal(8.5));
		productInfo.setProductStock(100);
		productInfo.setProductDescription("VeryGood");
		productInfo.setProductIcon("http://xxxx0.jpg");
		productInfo.setProductStatus(ProductStatusEmum.DOWN.getCode());
		productInfo.setCategoryType(3);
		
		ProductInfo result = productServiceImpl.save(productInfo);
		Assert.assertNotNull(result);
	
	}

}
