package br.com.cesed.sistemadevendas.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tipodeunidade")
public class TipoDeUnidade {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name = "tipodeunidade_nome",nullable= false)
	private String nome;
	
	@OneToMany(mappedBy="tipoUnidade")
	private List<Produto> produtos = new ArrayList<Produto>();

	public TipoDeUnidade(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public TipoDeUnidade() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
