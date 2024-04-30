package com.shiva.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shiva.jpa.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
