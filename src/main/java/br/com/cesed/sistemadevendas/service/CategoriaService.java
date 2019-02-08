package br.com.cesed.sistemadevendas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cesed.sistemadevendas.domain.Categoria;
import br.com.cesed.sistemadevendas.repositories.CategoriaRepository;
import br.com.cesed.sistemadevendas.service.exceptions.NotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repository;
	
	public Categoria insert(Categoria categoria) {
		return repository.save(categoria);
	}
	
	public List<Categoria> readAll() {
		return repository.findAll();
	}
	
	public Categoria findOne(Long id) {
		return repository.findById(id).orElseThrow(() -> new NotFoundException("ID : " + id + "do Categoria nao existe!"));
	}
	
	public void delete(Long id) {
		if(repository.existsById(id)) {
			repository.deleteById(id);
		} else {
			throw new NotFoundException("ID : " + id + "do Categoria nao existe!");
		}
	}
	
	public Categoria update(Categoria categoria) {
		if(repository.existsById(categoria.getId())) {
			return repository.save(categoria);
		} else {
			throw new NotFoundException("ID : " + categoria.getId() + "do Categoria nao existe!");
		}
	}
	
}
