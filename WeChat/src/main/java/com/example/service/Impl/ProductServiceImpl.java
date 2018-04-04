package com.example.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.bean.ProductInfo;
import com.example.dao.ProductInfoDao;
import com.example.service.ProductService;

import emums.ProductStatusEmum;
@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductInfoDao productInfoDao;
	
	@Override
	public ProductInfo findOne(String ProductId) {
		return productInfoDao.findOne(ProductId);
	}

	@Override
	public List<ProductInfo> findAll() {
		return productInfoDao.findByProductStatus(ProductStatusEmum.UP.getCode());
	}

	@Override
	public Page<ProductInfo> findAll(Pageable pageable) {
		return productInfoDao.findAll(pageable);
	}

	@Override
	public ProductInfo save(ProductInfo productInfo) {
		return productInfoDao.save(productInfo);
	}
	
}
