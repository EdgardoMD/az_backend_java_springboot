package com.emora.az.backend.java.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.emora.az.backend.java.springboot.model.Product;
import com.emora.az.backend.java.springboot.repository.IProductRepository;

public class ProductServiceImpl implements IProductService{
	
	@Autowired
	private IProductRepository productRepository;

	@Override
	public List<Product> listAllProducts() {
		
		return productRepository.findAll();
	}

}
