package com.example.demo.controllers;

import java.awt.print.Pageable;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.entities.Produto;
import com.example.demo.model.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;

	@RequestMapping(method= {RequestMethod.POST, RequestMethod.PUT})
	public Produto novoProduto(@Valid Produto produto) {
		produtoRepository.save(produto);
		return produto;
	}
	
	@GetMapping(path="/buscar")
	public Iterable<Produto> obterProduto() {
		return produtoRepository.findAll();
	}
	
	@GetMapping(path="/pagina/{nomeroPagina}")
	public Iterable<Produto> obterProdutosPorPagina(@PathVariable int numeroPagina) {
		Pageable page = (Pageable) PageRequest.of(0, 4);
		return produtoRepository.findAll((Sort) page);
	}
	
	@GetMapping(path="/{id}")
	public Optional<Produto> obterProdutoID(@PathVariable int id) {
		return produtoRepository.findById(id);
	}
	
	@DeleteMapping(path="/{id}")
	public void exluirProduto(@PathVariable int id) {
		produtoRepository.deleteById(id);
	}
	
	
}
