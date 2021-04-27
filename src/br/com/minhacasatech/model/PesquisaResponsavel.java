package br.com.minhacasatech.model;

import br.com.minhacasatech.DAO.*;

public class PesquisaResponsavel implements Pesquisa{
	
	@Override
	public void pesquisar(Responsavel responsavel) {
		ResponsavelDAO responsaveldao = new ResponsavelDAO();
		responsaveldao.pesquisar(responsavel);
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
	public void pesquisar(Fornecedor fornecedor) {
		// TODO Auto-generated method stub
		
	}

}
