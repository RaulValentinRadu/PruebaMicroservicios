package com.proyectos.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyectos.spring.response.JuegoResponse;
import com.proyectos.spring.service.BibliotecaService;

@RestController
public class BibliotecaController {
	@Autowired
	BibliotecaService biblioService;
	
	@GetMapping("/getJuegos")
	public List<JuegoResponse> getAllJuegos(){
		return biblioService.getAllJuegos();
	}
}
