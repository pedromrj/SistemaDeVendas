package br.com.cesed.sistemadevendas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cesed.sistemadevendas.domain.EstoqueEntrada;
import br.com.cesed.sistemadevendas.repositories.EstoqueEntradaRepository;
import br.com.cesed.sistemadevendas.service.exceptions.NotFoundException;

@Service
public class EstoqueEntradaService {
	
	@Autowired
	private EstoqueEntradaRepository repository;
	
	public EstoqueEntrada insert(EstoqueEntrada estoque) {
		return repository.save(estoque);
	}
	
	public List<EstoqueEntrada> readAll() {
		return repository.findAll();
	}
	
	public EstoqueEntrada findOne(Long id) {
		return repository.findById(id).orElseThrow(() -> new NotFoundException("ID : " + id + "do EstoqueEntrada nao existe!"));
	}
	
	public void delete(Long id) {
		if(repository.existsById(id)) {
			repository.deleteById(id);
		} else {
			throw new NotFoundException("ID : " + id + "do EstoqueEntrada nao existe!");
		}
	}
	
	public EstoqueEntrada update(EstoqueEntrada estoque) {
		if(repository.existsById(estoque.getId())) {
			return repository.save(estoque);
		} else {
			throw new NotFoundException("ID : " + estoque.getId() + "do EstoqueEntrada nao existe!");
		}
	}
}
