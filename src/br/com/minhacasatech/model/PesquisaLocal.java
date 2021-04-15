package br.com.minhacasatech.model;

import br.com.minhacasatech.DAO.LocalDAO;

public class PesquisaLocal implements Pesquisa{
	
	public void pesquisar(Local local) {
		LocalDAO localdao = new LocalDAO();
		localdao.pesquisar(local);
		
	}

}
