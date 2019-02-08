package br.com.cesed.sistemadevendas.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
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
@Table(name = "produtos")
public class Produto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="produtos_id")
	private Long id;
	
	private String codBarra;
	
	private String nome;
	
	private double qtdEstoque;
	
	@ManyToOne
	@JoinColumn(name = "tipodeunidades_id")
	private TipoDeUnidade tipoUnidade;
	
	private float tamanhoUnidade;
	
	private boolean Comercializavel;
	
	private float valorUnitarioVenda;
	
	@OneToOne(mappedBy = "produto")
	private ItemVenda itemVenda;
	
	@OneToMany(mappedBy= "produtos")
	private List<EstoqueSaida> estoqueSaida = new ArrayList<EstoqueSaida>();
	
	@OneToOne(mappedBy="produto")
	private EstoqueEntrada estoque;
	public Produto() {
		
	}

	public Produto(Long id, String codBarra, String nome, List<Categoria> categorias, double qtdEstoque,
			TipoDeUnidade tipoUnidade, float tamanhoUnidade, boolean comercializavel, float valorUnitarioVenda) {
		super();
		this.id = id;
		this.codBarra = codBarra;
		this.nome = nome;
		this.qtdEstoque = qtdEstoque;
		this.tipoUnidade = tipoUnidade;
		this.tamanhoUnidade = tamanhoUnidade;
		Comercializavel = comercializavel;
		this.valorUnitarioVenda = valorUnitarioVenda;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodBarra() {
		return codBarra;
	}

	public void setCodBarra(String codBarra) {
		this.codBarra = codBarra;
	}
	
	public ItemVenda getItemVenda() {
		return itemVenda;
	}

	public void setItemVenda(ItemVenda itemVenda) {
		this.itemVenda = itemVenda;
	}

	public List<EstoqueSaida> getEstoqueSaida() {
		return estoqueSaida;
	}

	public void setEstoqueSaida(List<EstoqueSaida> estoqueSaida) {
		this.estoqueSaida = estoqueSaida;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(double qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	public TipoDeUnidade getTipoUnidade() {
		return tipoUnidade;
	}

	public void setTipoUnidade(TipoDeUnidade tipoUnidade) {
		this.tipoUnidade = tipoUnidade;
	}

	public float getTamanhoUnidade() {
		return tamanhoUnidade;
	}

	public void setTamanhoUnidade(float tamanhoUnidade) {
		this.tamanhoUnidade = tamanhoUnidade;
	}

	public boolean isComercializavel() {
		return Comercializavel;
	}

	public void setComercializavel(boolean comercializavel) {
		Comercializavel = comercializavel;
	}

	public float getValorUnitarioVenda() {
		return valorUnitarioVenda;
	}

	public void setValorUnitarioVenda(float valorUnitarioVenda) {
		this.valorUnitarioVenda = valorUnitarioVenda;
	}
	
	
}
