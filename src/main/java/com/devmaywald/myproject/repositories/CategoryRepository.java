package com.devmaywald.myproject.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.devmaywald.myproject.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	
}