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

import com.example.bean.OrderDetail;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailDaoTest {
	@Autowired
	private OrderDetailDao orderDetailDao;
	
	@Test
	public void saveTest() {
		OrderDetail orderDetail = new OrderDetail();
		orderDetail.setDetailId("125555589");
		orderDetail.setOrderId("115551");
		orderDetail.setProductIcon("http://6556.jpg");
		orderDetail.setProductId("15552");
		orderDetail.setProductName("皮555蛋");
		orderDetail.setProductPrice(new BigDecimal(15.5));
		orderDetail.setProductQuantity(2);
		OrderDetail result = orderDetailDao.save(orderDetail);
		Assert.assertNotNull(result);
		
	}
	
	
	@Test
	public void testFindByOrderId() {
		List<OrderDetail> orderDetailList = orderDetailDao.findByOrderId("11111");
		Assert.assertNotEquals(0, orderDetailList.size());
		System.out.println(orderDetailList.size());
	}

}
