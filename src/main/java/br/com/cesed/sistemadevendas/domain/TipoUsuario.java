package br.com.cesed.sistemadevendas.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="tipousuarios")
public class TipoUsuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String tipo;
	
	private Boolean gerenca;
	
	private Boolean pdv;
	
	private Boolean caixa;
	
	private Boolean controleCliente;
	
	@OneToMany(mappedBy = "tipo")
	private List<Usuario> usuarios = new ArrayList<Usuario>();
	
	public TipoUsuario() {
		
	}

	public TipoUsuario(Long id, String tipo, Boolean gerenca, Boolean pdv, Boolean caixa, Boolean controleCliente) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.gerenca = gerenca;
		this.pdv = pdv;
		this.caixa = caixa;
		this.controleCliente = controleCliente;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Boolean getGerenca() {
		return gerenca;
	}

	public void setGerenca(Boolean gerenca) {
		this.gerenca = gerenca;
	}

	public Boolean getPdv() {
		return pdv;
	}

	public void setPdv(Boolean pdv) {
		this.pdv = pdv;
	}

	public Boolean getCaixa() {
		return caixa;
	}

	public void setCaixa(Boolean caixa) {
		this.caixa = caixa;
	}

	public Boolean getControleCliente() {
		return controleCliente;
	}

	public void setControleCliente(Boolean controleCliente) {
		this.controleCliente = controleCliente;
	}
	
	

}
