package br.com.minhacasatech.model;

import java.util.Calendar;

public class Cliente {
	private String nome;
	private String cpf;
	private String endereco;
	private Calendar dataDeCadastro;
	
	public Cliente(String nome,String cpf,String endereco,Calendar dataDeCadastro){
		setNome(nome);
		setCpf(cpf);
		setEndereco(endereco);
		setDataDeCadastro(dataDeCadastro);
	}
		 
		public String getNome(){
        return this.nome;
    }
	public void setNome(String novo){
        if (novo == "" || novo == null){
            System.out.println("O nome não foi informado, por favor informe-o.");
        } else{
            this.nome = novo;
        }    
    }

    public String getCpf(){
		return this.cpf;
	}
	    public void setCpf(String novo){
        if (novo == "" || novo == null){
            System.out.println("O CPF não foi informado, por favor informe-o.");
        } else{
            this.cpf = novo;
        }
    }

 public String getEndereco(){
		return this.endereco;
	}
	    public void setEndereco(String novo){
        if (novo == "" || novo == null){
            System.out.println("O endereço não foi informado, por favor informe-o.");
        } else{
            this.endereco = novo;
        }  
    }

	public Calendar getDataDeCadastro() {
    	return this.dataDeCadastro;
    }
    public void setDataDeCadastro(Calendar novo) {
    	this.dataDeCadastro = novo;
    }

}
