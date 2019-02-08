package br.com.cesed.sistemadevendas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.cesed.sistemadevendas.domain.TipoUsuario;
import br.com.cesed.sistemadevendas.repositories.TipoUsuarioRepository;
import br.com.cesed.sistemadevendas.service.exceptions.NotFoundException;

public class TipoUsuarioService {
	
	@Autowired
	private TipoUsuarioRepository repository;
	
	public TipoUsuario insert(TipoUsuario tipo) {
		return repository.save(tipo);
	}
	
	public List<TipoUsuario> readAll() {
		return repository.findAll();
	}
	
	public TipoUsuario findOne(Long id) {
		return repository.findById(id).orElseThrow(() -> new NotFoundException("ID : " + id + "do TipoUsuario nao existe!"));
	}
	
	public void delete(Long id) {
		if(repository.existsById(id)) {
			repository.deleteById(id);
		} else {
			throw new NotFoundException("ID : " + id + "do TipoUsuario nao existe!");
		}
	}
	
	public TipoUsuario update(TipoUsuario tipo) {
		if(repository.existsById(tipo.getId())) {
			return repository.save(tipo);
		} else {
			throw new NotFoundException("ID : " + tipo.getId() + "do TipoUsuario nao existe!");
		}
	}

}
