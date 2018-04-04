package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bean.OrderDetail;

public interface OrderDetailDao extends JpaRepository<OrderDetail, String>{
	List<OrderDetail> findByOrderId(String orderId);
}
