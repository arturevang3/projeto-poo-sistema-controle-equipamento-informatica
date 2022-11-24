package br.com.minhacasatech.model;

import br.com.minhacasatech.DAO.ClienteDAO;

public class PesquisaCliente implements Pesquisa{
	
	@Override
	public void pesquisar(Cliente cliente) {
		ClienteDAO clientedao = new ClienteDAO();
		clientedao.pesquisar(cliente);
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
	public void pesquisar(Responsavel responsavel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pesquisar(Fornecedor fornecedor) {
		// TODO Auto-generated method stub
		
	}

}
