package com.example.dao;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.bean.OrderMaster;
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterDaoTest {
	@Autowired
	private OrderMasterDao masterDao;
	
	private final String OPENID = "dongdong";
	@Test
	public void saveTest(){
		OrderMaster orderMaster = new OrderMaster();
		orderMaster.setOrderId("123457");
		orderMaster.setBuyerName("浩浩");
		orderMaster.setBuyerPhone("15641689666");
		orderMaster.setBuyerAddress("君临");
		orderMaster.setBuyerOpenid(OPENID);
		orderMaster.setOrderAmount(new BigDecimal(8.5));
		OrderMaster result =  masterDao.save(orderMaster);
		Assert.assertNotNull(result);
	}
	@Test
	public void testFindByBuyerOpenid() {
		PageRequest page = new PageRequest(0, 1);
		Page<OrderMaster> result = masterDao.findAll(page);
		System.out.println(result.getTotalElements());
		Assert.assertNotEquals(0, result.getTotalElements());	 
		
		
	}

}
