package br.com.cesed.sistemadevendas.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "estoqueentradas")
public class EstoqueEntrada {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@OneToOne
	@JoinColumn(name = "produtos_id")
	private Produto produto;

	private Date data;

	private int qtdEntrada;

	private int valorPago;

	@ManyToOne
	@JoinColumn(name = "usuarios_id")
	private Usuario usuario;

	public EstoqueEntrada() {

	}

	public EstoqueEntrada(Long id, Produto produto, Date data, int qtdEntrada, int valorPago, Usuario usuario) {
		this.id = id;
		this.produto = produto;
		this.data = data;
		this.qtdEntrada = qtdEntrada;
		this.valorPago = valorPago;
		this.usuario = usuario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getQtdEntrada() {
		return qtdEntrada;
	}

	public void setQtdEntrada(int qtdEntrada) {
		this.qtdEntrada = qtdEntrada;
	}

	public int getValorPago() {
		return valorPago;
	}

	public void setValorPago(int valorPago) {
		this.valorPago = valorPago;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
