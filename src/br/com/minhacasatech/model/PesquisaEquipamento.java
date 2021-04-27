package br.com.minhacasatech.model;

import br.com.minhacasatech.DAO.*;

public class PesquisaEquipamento implements Pesquisa{
	
	@Override
	public void pesquisar(Equipamento equipamento) {
		EquipamentoDAO equipamentodao = new EquipamentoDAO();
		equipamentodao.pesquisar(equipamento);
		
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

	@Override
	public void pesquisar(Fornecedor fornecedor) {
		// TODO Auto-generated method stub
		
	}

	
}
