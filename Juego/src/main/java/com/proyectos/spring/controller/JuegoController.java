package com.proyectos.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyectos.spring.model.Juego;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class JuegoController {

	@CircuitBreaker(name = "Juego Circuit Breaker", fallbackMethod = "fallBackListJuegos")
	@GetMapping("/juego")
	public List<Juego> getJuegos() throws Exception {
		List<Juego> juegos = new ArrayList<Juego>();

		juegos.add(new Juego("asjdfkl", 1999));
		juegos.add(new Juego("eqrwerqwer", 2001));
		juegos.add(new Juego("xcvbxcvbc", 5002));

		throw new Exception();
		return juegos;
	}

	private ResponseEntity<List<Juego>> fallBackListJuegos() {
		return new ResponseEntity<List<Juego>>(new ArrayList<Juego>(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
