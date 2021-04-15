package br.com.minhacasatech.model;

import java.util.Calendar;

public class Fornecedor {
	private String nomeDoFornecedor;
	private String cpfDoFornecedor;
	private String enderecoDoFornecedor;
	private Calendar dataDeCadastro;
	private int codigoFornecedor;
	
	public Fornecedor(String nomeDoFornecedor,String cpfDoFornecedor,String enderecoDoFornecedor,Calendar dataDeCadastro, int codigoFornecedor){
		setNomeDoFornecedor(nomeDoFornecedor);
		setCpfDoFornecedor(cpfDoFornecedor);
		setEnderecoDoFornecedor(enderecoDoFornecedor);
		setDataDeCadastro(dataDeCadastro);
		setCodigoFornecedor(codigoFornecedor);
	}

public String getNomeDoFornecedor() {
		return this.nomeDoFornecedor;
	}
	public void setNomeDoFornecedor(String novo) {
		if (novo == ""|| novo == null) {
			System.out.println("nomeDoFornecedor não foi informado, por favor informe-o.");
		} else {
			this.nomeDoFornecedor = novo;
		}
	}

public String getCpfDoFornecedor() {
		return this.cpfDoFornecedor;
	}
	
	public void setCpfDoFornecedor(String novo) {
		if (novo == "" || novo == null) {
			System.out.println("cpfDoFornecedor não foi informado, por favor informe-o.");
		} else {
			this.cpfDoFornecedor = novo;
		}
	}

public String getEnderecoDoFornecedor(){
		return this.enderecoDoFornecedor;
	}
	    public void setEnderecoDoFornecedor(String novo){
        if (novo == "" || novo == null){
            System.out.println("O endereço não foi informado, por favor informe-o.");
        } else{
            this.enderecoDoFornecedor = novo;
        }  
    }

public Calendar getDataDeCadastro() {
    	return this.dataDeCadastro;
    }
    public void setDataDeCadastro(Calendar novo) {
    	this.dataDeCadastro = novo;
    }
    
public int getCodigoFornecedor(){
        return this.codigoFornecedor;
    } 
    public void setCodigoFornecedor(int novo){
    	if (novo == 0) {
    		System.out.println("O código do responsável não foi informado, por favor informe-o.");
    	} else {
    		this.codigoFornecedor = novo;
    	}
        
    }


}
