package com.proyectos.spring.feignclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.proyectos.spring.response.JuegoResponse;

@FeignClient(name = "juego")
public interface JuegoFeignClient {
	
	@GetMapping("/juego")
	public List<JuegoResponse> getJuego();
	
}
