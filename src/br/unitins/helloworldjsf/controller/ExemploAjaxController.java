package br.unitins.helloworldjsf.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class ExemploAjaxController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2485428355653628538L;
	private String nome;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void imprimirConsole() {
	
		System.out.println("Imprimir no console");
		
	}
	
	}
	


