package com.emora.az.backend.java.springboot.service;

import java.util.List;

import com.emora.az.backend.java.springboot.model.Product;

public interface IProductService {
	
	public List<Product> listAllProducts();

}
