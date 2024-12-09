package com.proyectos.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyectos.spring.model.Juego;

@RestController
public class JuegoController {

	
	@GetMapping("/juego")
	public List<Juego> getJuegos() {
		List<Juego> juegos = new ArrayList<Juego>();
		
		juegos.add(new Juego("asjdfkl", 1999));
		juegos.add(new Juego("eqrwerqwer", 2001));
		juegos.add(new Juego("xcvbxcvbc", 5002));
		
		return juegos;
	}
	
}
