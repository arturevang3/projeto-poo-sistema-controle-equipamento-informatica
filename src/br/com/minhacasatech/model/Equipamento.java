package br.com.minhacasatech.model;

public class Equipamento{

    private String nomeDeEquipamento;
    private float peso;
    private String numeroDeSerie;
    private int quantidade;
    private float preco;
    private int codigoLocal;
    private int codigoResponsavel;
    private int codigoEquipamento;
    
    public Equipamento(String nomeDeEquipamento,float peso,String numeroDeSerie,int quantidade,float preco,int codigoLocal,int codigoResponsavel,int codigoEquipamento) {
    	setNomeDeEquipamento(nomeDeEquipamento);
    	setPeso(peso);
    	setNumeroDeSerie(numeroDeSerie);
    	setQuantidade(quantidade);
    	setPreco(preco);
    	setCodigoLocal(codigoLocal);
    	setCodigoResponsavel(codigoResponsavel);
    	setCodigoEquipamento(codigoEquipamento);
    }

    public String getNomeDeEquipamento(){
        return this.nomeDeEquipamento;
    }
    public void setNomeDeEquipamento(String novo){
        if (novo == "" || novo == null){
            System.out.println("O nome do equipamento não foi informado, por favor informe-o.");
        } else{
            this.nomeDeEquipamento = novo;
        }
        
    }

    public float getPeso(){
        return this.peso;
    }
    public void setPeso(float novo){
        if (novo == 0){
            System.out.println("O peso não foi informado, por favor informe-o");
        } else{
            this.peso = novo;
        }
        
    }

    public String getNumeroDeSerie(){
        return this.numeroDeSerie;
    }
    public void setNumeroDeSerie(String novo){
        if (novo == "" || novo == null){
            System.out.println("A série não foi informada, por favor informe-a.");
        } else{
            this.numeroDeSerie = novo;
        }
        
    }

    public int getQuantidade(){
        return this.quantidade;
    }
    public void setQuantidade(int novo){
    	if (novo == 0) {
    		System.out.println("A quantidade não foi informada, por favor informe-a.");
    	} else {
    		this.quantidade = novo;
    	}
        
    }
    
    public float getPreco() {
    	return this.preco;
    }
    public void setPreco(float novo) {
    	if (novo == 0) {
    		System.out.println("O preço não foi informado, por favor informe-o");
    	} else {
    		this.preco = novo;
    	}
    }

    public int getCodigoLocal(){
        return this.codigoLocal;
    }
    public void setCodigoLocal(int novo){
    	if (novo == 0) {
    		System.out.println("O código do local não foi informado, por favor informe-o.");
    	} else {
    		this.codigoLocal = novo;
    	}
        
    }

    public int getCodigoResponsavel(){
        return this.codigoResponsavel;
    } 
    public void setCodigoResponsavel(int novo){
    	if (novo == 0) {
    		System.out.println("O código do responsável não foi informado, por favor informe-o.");
    	} else {
    		this.codigoResponsavel = novo;
    	}
        
    }

    public int getCodigoEquipamento(){
        return this.codigoEquipamento;
    }
    public void setCodigoEquipamento(int novo){
    	if (novo == 0) {
    		System.out.println("O codigo do equipamento não foi informado, por favor informe-o.");
    	} else {
    		this.codigoEquipamento = novo;
    	}
        
    }
}
