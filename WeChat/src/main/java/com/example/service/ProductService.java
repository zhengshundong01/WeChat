package com.example.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.bean.ProductInfo;

public interface ProductService {
	
	ProductInfo findOne(String ProductId);
	
	List<ProductInfo> findAll();
	
	Page<ProductInfo> findAll(Pageable pageable);

	ProductInfo save(ProductInfo productInfo);
	
	//加库存
	
	//减库存

}
