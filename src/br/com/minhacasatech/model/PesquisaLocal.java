package br.com.minhacasatech.model;

import br.com.minhacasatech.DAO.LocalDAO;

public class PesquisaLocal implements Pesquisa{
	
	@Override
	public void pesquisar(Local local) {
		LocalDAO localdao = new LocalDAO();
		localdao.pesquisar(local);
		
	}

	@Override
	public void pesquisar(Equipamento equipamento) {
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

	@Override
	public void pesquisar(Fornecedor fornecedor) {
		// TODO Auto-generated method stub
		
	}

}
