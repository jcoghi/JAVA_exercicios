package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.*;
import com.example.demo.model.entities.Cliente;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {
	
	@GetMapping(path ="/qualquer")
	public Cliente obterCliente() {
		return new Cliente(28,"Pedro","123.456.789.00");
	}
	
	@GetMapping("/{id}")
	public Cliente obterClientePorId1(@PathVariable int id) {
		return new Cliente(id, "Maria", "987.654.321-00");
	}

	@GetMapping
	public Cliente obterClientePorId2(
			@RequestParam(name="id") int  id) {
		return new Cliente(id,"Joao", "111.222.333-44");
	}

}
