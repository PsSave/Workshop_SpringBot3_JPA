package com.projetojava.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetojava.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
