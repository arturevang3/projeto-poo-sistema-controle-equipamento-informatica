package br.com.minhacasatech.model;

public class Responsavel {
	private String nomeDoResponsavel;
	private String telefoneDoResponsavel;
	private String enderecoDoResponsavel;
	private int codigoUsuario;
	private int codigoResponsavel;
	
public Responsavel(String nomeDoResponsavel,String telefoneDoResponsavel,String enderecoDoResponsavel,int codigoUsuario,int codigoResponsavel){
	setNomeDoResponsavel(nomeDoResponsavel);
	setTelefoneDoResponsavel(telefoneDoResponsavel);
	setEnderecoDoResponsavel(enderecoDoResponsavel);
	setCodigoUsuario(codigoUsuario);
	setCodigoResponsavel(codigoResponsavel);
}

public String getNomeDoResponsavel() {
		return this.nomeDoResponsavel;
	}
	public void setNomeDoResponsavel(String novo) {
		if (novo == ""|| novo == null) {
			System.out.println("O nome do responsável não foi informado, por favor informe-o.");
		} else {
			this.nomeDoResponsavel = novo;
		}
	}

public String getTelefoneDoResponsavel(){
		return this.telefoneDoResponsavel;
	}
	    public void setTelefoneDoResponsavel(String novo){
        if (novo == "" || novo == null){
            System.out.println("O telefone do responsavel não foi informado, por favor informe-o.");
        } else{
            this.telefoneDoResponsavel = novo;
        }
    }

public String getEnderecoDoResponsavel(){
		return this.enderecoDoResponsavel;
	}
	    public void setEnderecoDoResponsavel(String novo){
        if (novo == "" || novo == null){
            System.out.println("O endereço não foi informado, por favor informe-o.");
        } else{
            this.enderecoDoResponsavel = novo;
        }  
    }

public int getCodigoUsuario(){
		return this.codigoUsuario;
	}
	public void setCodigoUsuario(int novo) {
		if (novo == 0) {
			System.out.println("O código de usuário não foi informado, por favor informe-o.");
		} else {
			this.codigoUsuario = novo;
		}
	}

public int getCodigoResponsavel() {
    	return this.codigoResponsavel;
    }
    public void setCodigoResponsavel(int novo) {
    	if (novo == 0) {
    		System.out.println("O código de responsável não foi informado, por favor informe-o");
    	} else {
    		this.codigoResponsavel = novo;
    	}
    }

}
