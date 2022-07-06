package com.emora.az.backend.java.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emora.az.backend.java.springboot.model.Product;
import com.emora.az.backend.java.springboot.service.IProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private IProductService productService;
	
	@GetMapping
	public ResponseEntity<List<Product>> listAll() {
		return  ResponseEntity.ok(productService.listAllProducts());
	}

}
