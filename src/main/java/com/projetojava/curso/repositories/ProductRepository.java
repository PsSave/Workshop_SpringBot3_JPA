package com.projetojava.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetojava.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
