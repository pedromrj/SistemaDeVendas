package br.com.cesed.sistemadevendas.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	
	private String nome;
	
	private String login;
	
	private String senha;
	
	@OneToMany(mappedBy = "usuario")
	private List<ItemVenda> vendas = new ArrayList<ItemVenda>();
	
	@ManyToOne
	@JoinColumn(name = "tipousuarios_id")
	private TipoUsuario tipo;
	
	@OneToOne
	@JoinColumn(name = "conta_id")
	private Conta conta;
	
	@OneToMany(mappedBy= "usuario")
	private List<EstoqueEntrada> estoqueEntrada = new ArrayList<EstoqueEntrada>();
	
	@OneToMany(mappedBy= "usuario")
	private List<EstoqueSaida> estoqueSaida = new ArrayList<EstoqueSaida>();
	
	public Usuario() {
		
	}

	public Usuario(Long id, String nome, String login, String senha, List<ItemVenda> vendas, TipoUsuario tipo,
			Conta conta, List<EstoqueEntrada> estoqueEntrada, List<EstoqueSaida> estoqueSaida) {
		super();
		this.id = id;
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.vendas = vendas;
		this.tipo = tipo;
		this.conta = conta;
		this.estoqueEntrada = estoqueEntrada;
		this.estoqueSaida = estoqueSaida;
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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public TipoUsuario getTipo() {
		return tipo;
	}

	public void setTipo(TipoUsuario tipo) {
		this.tipo = tipo;
	}
	
	

}
