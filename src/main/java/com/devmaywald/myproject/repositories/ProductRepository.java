package com.devmaywald.myproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devmaywald.myproject.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	
	
}