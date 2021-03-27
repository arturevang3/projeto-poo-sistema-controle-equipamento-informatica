package br.com.minhacasatech.model;

public class Local {
	private String nomeDaCasa;
	private String nomeDoCompartimento;
	
	public Local(String nomeDaCasa, String nomeDoCompartimento) {
		this.nomeDaCasa = nomeDaCasa;
		this.nomeDoCompartimento = nomeDoCompartimento;
	}
	
	public String getnomeDacasa() {
		return this.nomeDaCasa;
	}
	public void setnomeDaCasa(String novo) {
		if (novo == "" || novo == null) {
			System.out.println("O nome da casa não foi informado, por favor informe-o");
		} else {
			this.nomeDaCasa = novo;
		}
	}
	
	public String getnomeDoCompartimento() {
		return this.nomeDoCompartimento;
	}
	public void setnomeDoCompartimento(String novo) {
		if (novo == "" || novo == null) {
			System.out.println("O nome do compartimento não foi informado, por favor informe-o.");
		} else {
			this.nomeDoCompartimento = novo;
		}
	}
}
