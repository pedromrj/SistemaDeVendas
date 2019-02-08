package br.com.cesed.sistemadevendas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.cesed.sistemadevendas.domain.Produto;
import br.com.cesed.sistemadevendas.service.ProdutoService;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoService service;
	
	@PostMapping
	public ResponseEntity<Produto> create(@RequestBody Produto categoria){
		return new ResponseEntity<Produto> (service.insert(categoria),HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<Produto>> readAll(){
		return new ResponseEntity<List<Produto>>(service.readAll(), HttpStatus.OK);
	}
}
