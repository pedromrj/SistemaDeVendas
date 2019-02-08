package br.com.cesed.sistemadevendas.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class CadastroProduto {
	
	@NotEmpty
	private String nome;
	
	@NotEmpty
	private String codBarra;
	
	private double qtdEstoque;
	
	private float tamanhoUnitario;
	
	@NotEmpty
	private Boolean comercializavel;
	
	private float valorUnitarioVenda;
	
	@NotNull
	private Long categoriaId;
	
	@NotNull
	private Long tipoUnidadeId;

	public CadastroProduto(@NotEmpty String nome, @NotEmpty String codBarra, double qtdEstoque, float tamanhoUnitario,
			@NotEmpty Boolean comercializavel, float valorUnitarioVenda, @NotNull Long categoriaId,
			@NotNull Long tipoUnidadeId) {
		this.nome = nome;
		this.codBarra = codBarra;
		this.qtdEstoque = qtdEstoque;
		this.tamanhoUnitario = tamanhoUnitario;
		this.comercializavel = comercializavel;
		this.valorUnitarioVenda = valorUnitarioVenda;
		this.categoriaId = categoriaId;
		this.tipoUnidadeId = tipoUnidadeId;
	}

	public String getCodBarra() {
		return codBarra;
	}

	public void setCodBarra(String codBarra) {
		this.codBarra = codBarra;
	}

	public Boolean getComercializavel() {
		return comercializavel;
	}

	public void setComercializavel(Boolean comercializavel) {
		this.comercializavel = comercializavel;
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

	public float getTamanhoUnitario() {
		return tamanhoUnitario;
	}

	public void setTamanhoUnitario(float tamanhoUnitario) {
		this.tamanhoUnitario = tamanhoUnitario;
	}

	public boolean isComercializavel() {
		return comercializavel;
	}

	public void setComercializavel(boolean comercializavel) {
		this.comercializavel = comercializavel;
	}

	public float getValorUnitarioVenda() {
		return valorUnitarioVenda;
	}

	public void setValorUnitarioVenda(float valorUnitarioVenda) {
		this.valorUnitarioVenda = valorUnitarioVenda;
	}

	public Long getCategoriaId() {
		return categoriaId;
	}

	public void setCategoriaId(Long categoriaId) {
		this.categoriaId = categoriaId;
	}

	public Long getTipoUnidadeId() {
		return tipoUnidadeId;
	}

	public void setTipoUnidadeId(Long tipoUnidadeId) {
		this.tipoUnidadeId = tipoUnidadeId;
	}
	
	
}
