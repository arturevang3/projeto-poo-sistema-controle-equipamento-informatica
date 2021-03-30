package br.com.minhacasatech.model;

import java.util.Calendar;

public class Responsavel {
	private String nome;
	private String telefone;
	private String endereco;
	private Usuario usuario;
	private Calendar dataDeCadastro;
	
public Responsavel(String nome,String telefone,String endereco,Usuario usuario,Calendar dataDeCadastro){
	setNome(nome);
	setTelefone(telefone);
	setEndereco(endereco);
	setUsuario(usuario);
	setDataDeCadastro(dataDeCadastro);
}

public String getNome() {
		return this.nome;
	}
	public void setNome(String novo) {
		if (novo == ""|| novo == null) {
			System.out.println("O nome não foi informado, por favor informe-o.");
		} else {
			this.nome = novo;
		}
	}

public String getTelefone(){
		return this.telefone;
	}
	    public void setTelefone(String novo){
        if (novo == "" || novo == null){
            System.out.println("O Telefone não foi informado, por favor informe-o.");
        } else{
            this.telefone = novo;
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

public Usuario getUsuario(){
		return this.usuario;
	}
	public void setUsuario(Usuario novo) {
		if (novo == null) {
			System.out.println("Usuário não foi informado, por favor informe-o.");
		} else {
			this.usuario = novo;
		}
	}

public Calendar getDataDeCadastro() {
    	return this.dataDeCadastro;
    }
    public void setDataDeCadastro(Calendar novo) {
    	this.dataDeCadastro = novo;
    }

}
