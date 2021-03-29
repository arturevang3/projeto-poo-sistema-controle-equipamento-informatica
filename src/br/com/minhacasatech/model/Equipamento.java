package br.com.minhacasatech.model;

public class Equipamento{

    private String nome;
    private float peso;
    private String serie;
    private int quantidade;
    private float preco;
    private Local local;
    private Responsavel responsavel;
    private Fornecedor fornecedor;
    
    public Equipamento(String nome,float peso,String serie,int quantidade,float preco,Local local,Responsavel responsavel,Fornecedor fornecedor) {
        setNome(nome);
        setPeso(peso);
        setSerie(serie);
        setQuantidade(quantidade);
        setPreco(preco);
        setLocal(local);
        setResponsavel(responsavel);
        setFornecedor(fornecedor);
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String novo){
        if (novo == "" || novo == null){
            System.out.println("O nome não foi informado, por favor informe o nome.");
        } else{
            this.nome = novo;
        }
        
    }

    public float getPeso(){
        return this.peso;
    }
    public void setPeso(float novo){
        if (peso == 0){
            System.out.println("O peso não foi informado, por favor informe o peso");
        } else{
            this.peso = novo;
        }
        
    }

    public String getSerie(){
        return this.serie;
    }
    public void setSerie(String novo){
        if (novo == "" || novo == null){
            System.out.println("A série não foi informada, por favor informe a série.");
        } else{
            this.serie = novo;
        }
        
    }

    public int getQuantidade(){
        return this.quantidade;
    }
    public void setQuantidade(int novo){
    	if (quantidade == 0) {
    		System.out.println("A quantidade não foi informada, por favor informe a quantidade.");
    	} else {
    		this.quantidade = novo;
    	}
        
    }
    
    public float getPreco() {
    	return this.preco;
    }
    public void setPreco(float novo) {
    	if (preco == 0) {
    		System.out.println("O preço não foi informado, por favor informe o preço");
    	} else {
    		this.preco = novo;
    	}
    }

    public Local getLocal(){
        return this.local;
    }
    public void setLocal(Local novo){
    	if (novo == null) {
    		System.out.println("O local não foi informado, por favor informe o local.");
    	} else {
    		this.local = novo;
    	}
        
    }

    public Responsavel getResponsavel(){
        return this.responsavel;
    } 
    public void setResponsavel(Responsavel novo){
    	if (novo == null) {
    		System.out.println("O responsável não foi informado, por favor informe o responsável.");
    	} else {
    		this.responsavel = novo;
    	}
        
    }

    public Fornecedor getFornecedor(){
        return this.fornecedor;
    }
    public void setFornecedor(Fornecedor novo){
    	if (novo == null) {
    		System.out.println("O fornecedor não foi informado, por favor informe o fornecedor.");
    	} else {
    		this.fornecedor = novo;
    	}
        
    }
}
