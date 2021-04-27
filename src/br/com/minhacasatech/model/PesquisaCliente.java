package br.com.minhacasatech.model;

import br.com.minhacasatech.DAO.ClienteDAO;

public class PesquisaCliente implements Pesquisa{
	
	public void pesquisar(Cliente cliente) {
		ClienteDAO clientedao = new ClienteDAO();
		clientedao.pesquisar(cliente);
	}

}
