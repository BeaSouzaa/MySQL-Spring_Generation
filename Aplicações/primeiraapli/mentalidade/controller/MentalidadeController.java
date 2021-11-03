package com.primeiraapl.mentalidade.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mentalidade")


public class MentalidadeController {
	@GetMapping
	public String ment() {
		return "Mentalidades para o bloco II na sessão de Spring: " +
		"<br>" + 
		" Persistência: Ser a persistência não superamos os erros" +
		"<br>" + 
		"Atenção aos detalhes: No Spring há MUITOS detalhes" +
		"<br>" +
		"||| VIVER NUNCA FOI PARA AMADOR ||| " +
		"||| CONFIE NO PROCESSO |||";
		
		
	
	}

	

	
	
}
