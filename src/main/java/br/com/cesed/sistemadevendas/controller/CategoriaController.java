package br.com.cesed.sistemadevendas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.cesed.sistemadevendas.domain.Categoria;
import br.com.cesed.sistemadevendas.service.CategoriaService;

@Controller
@RequestMapping("/categorias")
public class CategoriaController {
	
	@Autowired
	private CategoriaService service;
	
	@PostMapping
	public ResponseEntity<Categoria> create(@RequestBody Categoria categoria){
		return new ResponseEntity<Categoria> (service.insert(categoria),HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<Categoria>> readAll(){
		return new ResponseEntity<List<Categoria>>(service.readAll(), HttpStatus.OK);
	}
}
