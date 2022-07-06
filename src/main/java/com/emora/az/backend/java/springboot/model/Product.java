package com.emora.az.backend.java.springboot.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "products")
@Data
public class Product {
	
	@Id
	private String productCode;
	
	private String productName;
	
	private String productLine;
	
	private String productScale;
	
	private String productVendor;
	
	@Lob
	private String productDescription;
	
	private int quantityInStock;
	
	private double buyPrice;
	
	private double MSRP;

}
