package com.example.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.ProductCategory;
import com.example.dao.ProductCategoryDao;
import com.example.service.CategoryService;
@Service
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	private ProductCategoryDao categoryDao;
	
	@Override
	public ProductCategory findOne(Integer categoryId) {
		return categoryDao.findOne(categoryId);
	}

	@Override
	public List<ProductCategory> findAll() {
		// TODO Auto-generated method stub
		return categoryDao.findAll();
	}

	@Override
	public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeId) {
		// TODO Auto-generated method stub
		return categoryDao.findByCategoryTypeIn(categoryTypeId);
	}

	@Override
	public ProductCategory save(ProductCategory productCategory) {
		// TODO Auto-generated method stub
		return categoryDao.save(productCategory);
	}

}
