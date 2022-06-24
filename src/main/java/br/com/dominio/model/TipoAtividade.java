package br.com.dominio.model;

public enum TipoAtividade {
	
	APRESENTACAO("Apresentação"), CURSO("Curso"), MINICURSO("Minicurso"), PALESTRA("Palestra"),
	SEMINARIO("Seminario"), SIMPOSIO("Simposio"), OUTRA("Outras");
	
	private String descricao;
	
	TipoAtividade(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return this.descricao;
	}

}
