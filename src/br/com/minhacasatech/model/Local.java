package br.com.minhacasatech.model;

public class Local {
	private String nomeDaCasa;
	private String nomeDoCompartimento;
	
	public Local(String nomeDaCasa, String nomeDoCompartimento) {
		setNomeDaCasa(nomeDaCasa);
		setNomeDoCompartimento(nomeDoCompartimento);
	}
	
	public String getNomeDacasa() {
		return this.nomeDaCasa;
	}
	public void setNomeDaCasa(String novo) {
		if (novo == "" || novo == null) {
			System.out.println("O nome da casa não foi informado, por favor informe-o");
		} else {
			this.nomeDaCasa = novo;
		}
	}
	
	public String getNomeDoCompartimento() {
		return this.nomeDoCompartimento;
	}
	public void setNomeDoCompartimento(String novo) {
		if (novo == "" || novo == null) {
			System.out.println("O nome do compartimento não foi informado, por favor informe-o.");
		} else {
			this.nomeDoCompartimento = novo;
		}
	}
}
