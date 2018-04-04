package com.example.service;

import java.util.List;

import com.example.bean.ProductCategory;

public interface CategoryService {
	
	ProductCategory findOne(Integer categoryId);
	
	List<ProductCategory> findAll();
	
	List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeId);
	
	ProductCategory save(ProductCategory productCategory);
	
}
