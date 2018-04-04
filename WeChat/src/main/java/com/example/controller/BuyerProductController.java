package com.example.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.VO.ProductInfoVO;
import com.example.VO.ProductVO;
import com.example.VO.ResultVO;
import com.example.bean.ProductCategory;
import com.example.bean.ProductInfo;
import com.example.service.CategoryService;
import com.example.service.ProductService;

@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {
	@Autowired
	private ProductService productService;
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/list")
	public ResultVO list(){
		//1.查询所有上架商品
		List<ProductInfo> productInfoList = productService.findAll();
		//2.查询类目(一次性查询)
//		List<Integer> categoryTypeList = new ArrayList<Integer>();
		//传统方法
//		for (ProductInfo productInfo : productInfoList) {
//			categoryTypeList.add(productInfo.getCategoryType())
//		}
		//精简方法(java8, lambda)
		List<Integer> categoryTypeList = productInfoList.stream()
				.map(e -> e.getCategoryType())
				.collect(Collectors.toList());
		
		List<ProductCategory> productCategorieList = categoryService.findByCategoryTypeIn(categoryTypeList);
		//3.数据拼装
		
		
		ResultVO resultVO = new ResultVO();
		ProductVO productVO = new ProductVO();
		ProductInfoVO productInfoVO = new ProductInfoVO();
		
		productVO.setProductInfoVOList(Arrays.asList(productInfoVO));
		resultVO.setData(Arrays.asList(productVO));
		resultVO.setCode(0);
		resultVO.setMsg("success");
		
		return resultVO;
		
	}
}
