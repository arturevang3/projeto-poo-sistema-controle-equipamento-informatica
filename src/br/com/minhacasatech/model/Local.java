package br.com.minhacasatech.model;

public class Local {
	private String casa;
	private String compartimento;
	private int codigoLocal;
	
	public Local(String casa, String compartimento, int codigoLocal) {
		setCasa(casa);
		setCompartimento(compartimento);
		setCodigoLocal(codigoLocal);
	}
	
	public String getCasa() {
		return this.casa;
	}
	public void setCasa(String novo) {
		if (novo == "" || novo == null) {
			System.out.println("O nome da casa não foi informado, por favor informe-o");
		} else {
			this.casa = novo;
		}
	}
	
	public String getCompartimento() {
		return this.compartimento;
	}
	public void setCompartimento(String novo) {
		if (novo == "" || novo == null) {
			System.out.println("O nome do compartimento não foi informado, por favor informe-o.");
		} else {
			this.compartimento = novo;
		}
	}
	
	public int getCodigoLocal(){
        return this.codigoLocal;
    } 
    public void setCodigoLocal(int novo){
    	if (novo == 0) {
    		System.out.println("O código do responsável não foi informado, por favor informe-o.");
    	} else {
    		this.codigoLocal = novo;
    	}
        
    }
}
