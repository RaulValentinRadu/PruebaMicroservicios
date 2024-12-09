package com.proyectos.spring.model;

import java.io.Serializable;
import java.util.List;

public class Biblioteca implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	
	List<Juego> juegos;
}
