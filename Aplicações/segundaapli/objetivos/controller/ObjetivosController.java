package com.segundaapli.objetivos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ObjetivosController {
	
	
	@GetMapping
	public String objetivo() {
		return "Os meus objetivos de aprendizegem para essa semana são: "+
				"<br>" +
				"NÃO DESISTIR!" +
				"<br>" + 
				"Ver todos os vídeos do bloco II" +
				"<br>" + 
				"Fazer todas as tarefas" +
				"<br>" +
				"Ver os conteúdos complementares" +
				"<br>" +
				"Fazer as tarefas do Projeto Integrador" +
				"<br>"+ 
				"|||| CONFIAR NO PROCESSO ||||";
		
	}

}
