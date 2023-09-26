package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {
    
    //@RequestMapping(method = RequestMethod.GET)
	@GetMapping
    public String ola() {
        return "Mudando o texto";
    }
}
