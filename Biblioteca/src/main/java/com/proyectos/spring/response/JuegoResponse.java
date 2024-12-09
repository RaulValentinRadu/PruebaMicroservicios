package com.proyectos.spring.response;

import java.io.Serializable;

import com.proyectos.spring.model.Juego;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JuegoResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nombre;
	private int anioSalida;
	
	public static JuegoResponse of(Juego juego) {
		JuegoResponse respuesta = new JuegoResponse();
		respuesta.setNombre(juego.getNombre());
		respuesta.setAnioSalida(juego.getAnioSalida());
		return respuesta;
	}
}
