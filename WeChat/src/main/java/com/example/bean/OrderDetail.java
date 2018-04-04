package com.example.bean;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class OrderDetail {
	@Id
	private String detailId;
	
	private String orderId;
	
	private String productId;
	
	private String productName;
	
	private BigDecimal productPrice;
	
	private Integer productQuantity;
	
	private String productIcon;
	
	
}
