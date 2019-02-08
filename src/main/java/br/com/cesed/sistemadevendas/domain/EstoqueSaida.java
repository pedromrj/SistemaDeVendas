package br.com.cesed.sistemadevendas.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "estoquesaidas")
public class EstoqueSaida {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "estoquesaidas_id")
	private Long id;
	
	private String justificativa;
	
	private Date data;
	
	private boolean voltoEstoque;
	
	@ManyToOne
	@JoinColumn(name= "produtos_id")
	private Produto produtos;
	
	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;
	
	public EstoqueSaida() {
		
	}

	public EstoqueSaida(Long id, Produto produto, String justificativa, Date data, boolean voltoEstoque,
			Usuario usuario) {
		super();
		this.id = id;
		this.justificativa = justificativa;
		this.data = data;
		this.voltoEstoque = voltoEstoque;
		this.usuario = usuario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getJustificativa() {
		return justificativa;
	}

	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public boolean isVoltoEstoque() {
		return voltoEstoque;
	}

	public void setVoltoEstoque(boolean voltoEstoque) {
		this.voltoEstoque = voltoEstoque;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
