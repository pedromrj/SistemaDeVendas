package br.com.cesed.sistemadevendas.controller.exceptions;

public class ErrorPadrao {

	private Long timestamp;

	private Integer status;

	private String descricao;

	public ErrorPadrao(Long timestamp, Integer status, String descricao) {
		this.timestamp = timestamp;
		this.status = status;
		this.descricao = descricao;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
