package br.com.minhacasatech.model;

import java.util.Calendar;

public class Fornecedor {
	private String nome;
	private String cpf;
	private String endereco;
	private Calendar dataDeCadastro;
	private Equipamento equipamento;
	
	public Fornecedor(String nome,String cpf,String endereco,Calendar dataDeCadastro,Equipamento equipamento){
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.dataDeCadastro = dataDeCadastro;
		this.equipamento = equipamento;
	}

public String getNome() {
		return this.nome;
	}
	public void setNome(String novo) {
		if (novo == ""|| novo == null) {
			System.out.println("Nome não foi informado, por favor informe-o.");
		} else {
			this.nome = novo;
		}
	}

public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String novo) {
		if (novo == "" || novo == null) {
			System.out.println("Cpf não foi informado, por favor informe-o.");
		} else {
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

public Calendar getdataDeCadastro() {
    	return this.dataDeCadastro;
    }
    public void setdataDeCadastro(Calendar novo) {
    	this.dataDeCadastro = novo;
    }

public Equipamento getEquipamento(){
		return this.equipamento;
	}
	public void setEquipamento(Equipamento novo) {
		if (novo == null) {
			System.out.println("Equipamento não foi informado, por favor informe-o.");
		} else {
			this.equipamento = novo;
		}
	}

}
