package br.com.cesed.sistemadevendas.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "itemvendas")
public class ItemVenda {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@OneToOne
	@JoinColumn(name = "produtos_id")
	private Produto produto;
	
	private float valorParcial;
	
	private double quantidade;
	
	private String observacao;
	
	@ManyToOne
	@JoinColumn(name = "usuarios_id")
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name = "contas_id")
	private Conta conta;
	
	
	
	public ItemVenda() {
		
	}

	public ItemVenda(Long id, Produto produto, float valorParcial, double quantidade, String observacao,
			Usuario usuario) {
		super();
		this.id = id;
		this.produto = produto;
		this.valorParcial = valorParcial;
		this.quantidade = quantidade;
		this.observacao = observacao;
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

	public float getValorParcial() {
		return valorParcial;
	}

	public void setValorParcial(float valorParcial) {
		this.valorParcial = valorParcial;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
}
