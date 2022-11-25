package com.bedu.mensajeria.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MensajePrueba {
	@GetMapping(path = "/MensajePrueba")
	public String getMensaje() {
		return "hola esta es una prueba";
	}
}
