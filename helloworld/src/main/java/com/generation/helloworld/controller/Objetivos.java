package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("objetivos")
public class Objetivos {

	@GetMapping
	public String objetivos(){
		return
	            "Meus objetivos de apredizagem dessa semana será: Melhorar minhas habilidades técnicas em Spring + MYSQL e melhorar minha softskill em comunicação.";
}
}