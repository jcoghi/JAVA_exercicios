package com.example.demo.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("metodos")
public class MetodosHttpController {

	@GetMapping
	public String get() {
		return "Requisição GET";		
	}
	
	@PostMapping
	public String post() {
		return "Requisição POST";		
	}
	
	@PutMapping
	public String PUT() {
		return "Requisição PUT";		
	}
	
	@PatchMapping
	public String path() {
		return "Requisição PATH";		
	}
	
	@DeleteMapping
	public String delete() {
		return "Requisição DELETE";		
	}
	
}
