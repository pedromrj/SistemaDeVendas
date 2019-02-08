package br.com.cesed.sistemadevendas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cesed.sistemadevendas.domain.Conta;
import br.com.cesed.sistemadevendas.repositories.ContaRepository;
import br.com.cesed.sistemadevendas.service.exceptions.NotFoundException;

@Service
public class ContaService {
	
	@Autowired
	private ContaRepository repository;
	
	public Conta insert(Conta conta) {
		return repository.save(conta);
	}
	
	public List<Conta> readAll() {
		return repository.findAll();
	}
	
	public Conta findOne(Long id) {
		return repository.findById(id).orElseThrow(() -> new NotFoundException("ID : " + id + "do Conta nao existe!"));
	}
	
	public void delete(Long id) {
		if(repository.existsById(id)) {
			repository.deleteById(id);
		} else {
			throw new NotFoundException("ID : " + id + "do Conta nao existe!");
		}
	}
	
	public Conta update(Conta conta) {
		if(repository.existsById(conta.getId())) {
			return repository.save(conta);
		} else {
			throw new NotFoundException("ID : " + conta.getId() + "do Conta nao existe!");
		}
	}
}
