package br.com.minhacasatech.model;

import br.com.minhacasatech.DAO.*;

public class PesquisaResponsavel implements Pesquisa{
	
	public void pesquisar(Responsavel responsavel) {
		ResponsavelDAO responsaveldao = new ResponsavelDAO();
		responsaveldao.pesquisar(responsavel);
	}

}
