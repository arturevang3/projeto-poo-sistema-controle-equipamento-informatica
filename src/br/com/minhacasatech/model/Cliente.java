package br.com.minhacasatech.model;

import java.util.Calendar;

public class Cliente {
	private String nomeDoCliente;
	private String cpfDoCliente;
	private String enderecoDoCliente;
	private Calendar dataDeCadastro;
	private int codigoCliente;
	
	public Cliente(String nomeDoCliente,String cpfDoCliente,String enderecoDoCliente,Calendar dataDeCadastro, int codigoCliente){
		setNomeDoCliente(nomeDoCliente);
		setCpfDoCliente(cpfDoCliente);
		setEnderecoDoCliente(enderecoDoCliente);
		setDataDeCadastro(dataDeCadastro);
		setCodigoCliente(codigoCliente);
	}
		 
		public String getNomeDoCliente(){
        return this.nomeDoCliente;
    }
	public void setNomeDoCliente(String novo){
        if (novo == "" || novo == null){
            System.out.println("O nome do cliente não foi informado, por favor informe-o.");
        } else{
            this.nomeDoCliente = novo;
        }    
    }


	public String getCpfDoCliente(){
		return this.cpfDoCliente;
	}
	    public void setCpfDoCliente(String novo){
        if (novo == "" || novo == null){
            System.out.println("O cpf do cliente não foi informado, por favor informe-o.");
        } else{
            this.cpfDoCliente = novo;
        }
    }

	public String getEnderecoDoCliente(){
		return this.enderecoDoCliente;
	}
	    public void setEnderecoDoCliente(String novo){
        if (novo == "" || novo == null){
            System.out.println("O endereço do cliente não foi informado, por favor informe-o.");
        } else{
            this.enderecoDoCliente = novo;
        }  
    }


	public Calendar getDataDeCadastro() {
    	return this.dataDeCadastro;
    }
    public void setDataDeCadastro(Calendar novo) {
    	this.dataDeCadastro = novo;
    }
    
    public int getCodigoCliente(){
        return this.codigoCliente;
    } 
    public void setCodigoCliente(int novo){
    	if (novo == 0) {
    		System.out.println("O código do cliente não foi informado, por favor informe-o.");
    	} else {
    		this.codigoCliente = novo;
    	}
        
    }

}
