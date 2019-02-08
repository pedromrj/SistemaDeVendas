package br.com.cesed.sistemadevendas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cesed.sistemadevendas.domain.EstoqueSaida;
import br.com.cesed.sistemadevendas.repositories.EstoqueSaidaRepository;
import br.com.cesed.sistemadevendas.service.exceptions.NotFoundException;

@Service
public class EstoqueSaidaService {
	
	@Autowired
	private EstoqueSaidaRepository repository;
	
	public EstoqueSaida insert(EstoqueSaida estoque) {
		return repository.save(estoque);
	}
	
	public List<EstoqueSaida> readAll() {
		return repository.findAll();
	}
	
	public EstoqueSaida findOne(Long id) {
		return repository.findById(id).orElseThrow(() -> new NotFoundException("ID : " + id + "do EstoqueSaida nao existe!"));
	}
	
	public void delete(Long id) {
		if(repository.existsById(id)) {
			repository.deleteById(id);
		} else {
			throw new NotFoundException("ID : " + id + "do EstoqueSaida nao existe!");
		}
	}
	
	public EstoqueSaida update(EstoqueSaida estoque) {
		if(repository.existsById(estoque.getId())) {
			return repository.save(estoque);
		} else {
			throw new NotFoundException("ID : " + estoque.getId() + "do EstoqueSaida nao existe!");
		}
	}

}
