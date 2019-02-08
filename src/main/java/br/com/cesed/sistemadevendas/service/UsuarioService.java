package br.com.cesed.sistemadevendas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cesed.sistemadevendas.domain.Usuario;
import br.com.cesed.sistemadevendas.repositories.UsuarioRepository;
import br.com.cesed.sistemadevendas.service.exceptions.NotFoundException;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;

	public Usuario insert(Usuario usuario) {
		return repository.save(usuario);
	}

	public List<Usuario> readAll() {
		return repository.findAll();
	}

	public Usuario findOne(Long id) {
		return repository.findById(id)
				.orElseThrow(() -> new NotFoundException("ID : " + id + "do Usuario nao existe!"));
	}

	public Usuario update(Usuario usuario) {
		if (repository.existsById(usuario.getId())) {
			return repository.save(usuario);
		} else {
			throw new NotFoundException("ID : " + usuario.getId() + "do Usuario nao existe!");
		}
	}
}
