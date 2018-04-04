package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bean.ProductCategory;

public interface ProductCategoryDao extends JpaRepository<ProductCategory, Integer>{
	
	List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
	
}
