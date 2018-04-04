package com.example.bean;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicUpdate;

import lombok.Data;
@Entity
@DynamicUpdate
@Data
public class ProductCategory {
	/**	类目id	*/
	@Id
	@GeneratedValue
	private Integer categoryId;
	/**	类目名字	*/
	private String categoryName;
	/**	类目编号	*/
	private Integer categoryType;
	
	public ProductCategory(String categoryName, Integer categoryType) {
		super();
		this.categoryName = categoryName;
		this.categoryType = categoryType;
	}

	public ProductCategory() {
		super();
	}
	
	
	
}
