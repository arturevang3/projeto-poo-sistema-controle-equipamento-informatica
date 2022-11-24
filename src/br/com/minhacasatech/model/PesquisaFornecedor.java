package br.com.minhacasatech.model;

import br.com.minhacasatech.DAO.FornecedorDAO;

public class PesquisaFornecedor implements Pesquisa{
	
	@Override
	public void pesquisar(Fornecedor fornecedor) {
		FornecedorDAO fornecedordao = new FornecedorDAO();
		fornecedordao.pesquisar(fornecedor);
	}

	@Override
	public void pesquisar(Equipamento equipamento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pesquisar(Local local) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pesquisar(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pesquisar(Responsavel responsavel) {
		// TODO Auto-generated method stub
		
	}

}
