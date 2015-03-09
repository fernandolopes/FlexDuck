package br.com.fernandolopez.model;

import java.io.Serializable;

/**
 * Modelo para agenda de contato
 * @author Fernando Lopes 
 */
public class Contato implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nome;

	private String email;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}