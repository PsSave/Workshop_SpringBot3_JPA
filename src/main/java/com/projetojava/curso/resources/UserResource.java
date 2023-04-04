package com.projetojava.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetojava.curso.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping //Utilizada para mapear solicitações HTTP GET (Leitura de dados)
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Pedro", "pedro@gmail.com", "99999999", "12345");
		return ResponseEntity.ok().body(u);
	}
}
