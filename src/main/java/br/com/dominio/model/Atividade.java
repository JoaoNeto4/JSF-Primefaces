package br.com.dominio.model;

import java.io.Serializable;

public class Atividade implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private long id;
	private String nome;
	private TipoAtividade tipoAtividade;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public TipoAtividade getTipoAtividade() {
		return tipoAtividade;
	}
	public void setTipoAtividade(TipoAtividade tipoAtividade) {
		this.tipoAtividade = tipoAtividade;
	}

	
}
