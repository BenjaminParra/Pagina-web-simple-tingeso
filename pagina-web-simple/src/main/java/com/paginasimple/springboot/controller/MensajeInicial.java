package com.paginasimple.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MensajeInicial {
	@RequestMapping(method = RequestMethod.GET)
	public String home() {
		return "Buenos días usach";
	}

}
