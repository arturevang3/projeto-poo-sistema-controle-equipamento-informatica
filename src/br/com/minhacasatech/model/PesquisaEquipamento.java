package br.com.minhacasatech.model;

import br.com.minhacasatech.DAO.*;

public class PesquisaEquipamento implements Pesquisa{
	
	public void pesquisar(Equipamento equipamento) {
		EquipamentoDAO equipamentodao = new EquipamentoDAO();
		equipamentodao.pesquisar(equipamento);
		
	}

}
