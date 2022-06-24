package br.com.dominio.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.dominio.model.Pessoa;

@Named("bean")//seta um nome
@SessionScoped /* nao destroi o bean ao retornar para o cliente, ao contrario do 
                  @RequestScoped que destroi o a memoria do bean a cada interacao
                  @AplicattionScoped se abrir outro navegador no mesmo endereço da 
                  url as informações sao compartilhadas entre eles
                  @ConversatioScoped precisa setar o inicio e o fim manualmente
                  mas pra isto precisa de uma implementacao bem simple 
                  
                  */
public class PessoaMB implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Inject
	private Pessoa pessoa;
	private List<Pessoa> pessoas = new ArrayList<Pessoa>();

	public String adicionar() {
		pessoas.add(pessoa);
		limpar();
		return null;//"paginas/sucesso";
	}
	
	private void limpar() {
		pessoa = new Pessoa();
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}	
}
