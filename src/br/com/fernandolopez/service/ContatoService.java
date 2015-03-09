package br.com.fernandolopez.service;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.fernandolopez.model.Contato;

/**
 * Serviço para manutenção dos contatos
 * @author Fernando Lopes 
 */
public class ContatoService {
	
	private static ArrayList<Contato> listContato = new ArrayList<Contato>(); 
	private static final Logger logger = LoggerFactory.getLogger(ContatoService.class);
	/**
	 * Adiciona um contato a lista
	 * @param contato
	 */
	public void addContato(Contato contato) {
		
		logger.info("Add Contato.");
		listContato.add(contato);
	}

	/**
	 * Retorna a lista de contatos
	 * @return
	 */
	public ArrayList<Contato> getListContato() {
		logger.info("Lista todos os Contatos.");
		return listContato;
	}
	
}