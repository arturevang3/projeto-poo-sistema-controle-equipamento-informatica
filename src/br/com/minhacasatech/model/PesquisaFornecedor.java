package br.com.minhacasatech.model;

import br.com.minhacasatech.DAO.FornecedorDAO;

public class PesquisaFornecedor implements Pesquisa{
	
	public void pesquisar(Fornecedor fornecedor) {
		FornecedorDAO fornecedordao = new FornecedorDAO();
		fornecedordao.pesquisar(fornecedor);
	}

}
