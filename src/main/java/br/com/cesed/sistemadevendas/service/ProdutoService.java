package br.com.cesed.sistemadevendas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cesed.sistemadevendas.domain.Produto;
import br.com.cesed.sistemadevendas.repositories.ProdutoRepository;
import br.com.cesed.sistemadevendas.service.exceptions.NotFoundException;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository repository;
	
	public Produto insert(Produto produto) {
		return repository.save(produto);
	}
	
	public List<Produto> readAll() {
		return repository.findAll();
	}
	
	public Produto findOne(Long id) {
		return repository.findById(id).orElseThrow(() -> new NotFoundException("ID : " + id + "do Produto nao existe!"));
	}
	
	public void delete(Long id) {
		if(repository.existsById(id)) {
			repository.deleteById(id);
		} else {
			throw new NotFoundException("ID : " + id + "do Produto nao existe!");
		}
	}
	
	public Produto update(Produto produto) {
		if(repository.existsById(produto.getId())) {
			return repository.save(produto);
		} else {
			throw new NotFoundException("ID : " + produto.getId() + "do Produto nao existe!");
		}
	}
	
}
