package br.com.cesed.sistemadevendas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cesed.sistemadevendas.domain.ItemVenda;
import br.com.cesed.sistemadevendas.repositories.ItemVendaRepository;
import br.com.cesed.sistemadevendas.service.exceptions.NotFoundException;

@Service
public class ItemVendaService {
	
	@Autowired
	private ItemVendaRepository repository;
	
	public ItemVenda insert(ItemVenda itemvenda) {
		return repository.save(itemvenda);
	}
	
	public List<ItemVenda> readAll() {
		return repository.findAll();
	}
	
	public ItemVenda findOne(Long id) {
		return repository.findById(id).orElseThrow(() -> new NotFoundException("ID : " + id + "do ItemVenda nao existe!"));
	}
	
	public void delete(Long id) {
		if(repository.existsById(id)) {
			repository.deleteById(id);
		} else {
			throw new NotFoundException("ID : " + id + "do ItemVenda nao existe!");
		}
	}
	
	public ItemVenda update(ItemVenda item) {
		if(repository.existsById(item.getId())) {
			return repository.save(item);
		} else {
			throw new NotFoundException("ID : " + item.getId() + "do ItemVenda nao existe!");
		}
	}
}
