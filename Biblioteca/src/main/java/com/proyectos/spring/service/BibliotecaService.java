package com.proyectos.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectos.spring.feignclients.JuegoFeignClient;
import com.proyectos.spring.response.JuegoResponse;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class BibliotecaService {

	@Autowired
	private JuegoFeignClient juegoFeign;
	
	public List<JuegoResponse> getAllJuegos(){
		return juegoFeign.getJuego();
	}
}
