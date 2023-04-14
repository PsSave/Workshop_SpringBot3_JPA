package com.projetojava.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetojava.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
