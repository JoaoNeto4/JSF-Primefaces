package br.com.dominio.controller;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named("msg")
@SessionScoped
public class MessagesMB implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public void salvar() {
		FacesMessage message = new FacesMessage("Menssagem de Sucesso");
		FacesContext.getCurrentInstance().addMessage(null, message);	
		System.out.println("sucesso");
	}
	
	public void erro() {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Menssagem de Erro", null);
		FacesContext.getCurrentInstance().addMessage(null, message);
		System.out.println("erro");
	}
	
	
}
