package com.emora.az.backend.java.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emora.az.backend.java.springboot.model.Product;

public interface IProductRepository extends JpaRepository<Product, String>{

}
