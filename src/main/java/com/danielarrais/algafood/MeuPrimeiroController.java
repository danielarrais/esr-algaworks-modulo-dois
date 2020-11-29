package com.danielarrais.algafood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeuPrimeiroController {

	@GetMapping("/hello")
	@ResponseBody // Para dispensar existencia de um arquivo HTML
	public String hello() {
		return "Hello";
	}
	
}
