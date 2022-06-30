package br.com.medicamentos.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
//import javax.faces.bean.SessionScoped;
//import javax.faces.view.ViewScoped;
//import javax.faces.bean.ApplicationScoped;
//import javax.faces.bean.ManagedBean;
//import javax.enterprise.context.SessionScoped;
//import javax.faces.bean.ApplicationScoped;
//import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
//import javax.inject.Named;
//import javax.inject.Named;
import javax.inject.Named;

import br.com.medicamentos.model.Medicamento;
import br.com.medicamentos.service.MedicamentoService;
import br.com.medicamentos.utility.Message;
import br.com.medicamentos.utility.NegocioException;


//@Named("medicamentoMB")
//@ViewScoped
//@SessionScoped
//@ManagedBean(name="medicamentoMB") 
//@ApplicationScoped
@Named("medicamentoMB")
@ViewScoped
public class MedicamentoMB implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Medicamento medicamento;

	@Inject
	private MedicamentoService service;

	@Inject
	private List<Medicamento> medicamentos;

	@PostConstruct // constrio o metodo assim que a classe é criada
	public void carregar() {
		medicamentos = service.todosOsMedicamentos();
	}

	public void adicionar() {
		try {
			service.salvar(medicamento);
			medicamento = new Medicamento();
			carregar();

			Message.info("Salvo com sucesso!");

		} catch (NegocioException e) {
			Message.erro(e.getMessage());
		}
	}

	public void excluir() {
		try {
			service.remover(medicamento);
			carregar();

			Message.info(medicamento.getNome() + " Foi removido!");
		} catch (NegocioException e) {
			Message.erro(e.getMessage());
		}
	}

	public Medicamento getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}

	public List<Medicamento> getMedicamentos() {
		return medicamentos;
	}

}
