package br.com.minhacasatech.model;

public class Usuario {
	private String login;
	private String senha;
	private String nomeDoUsuario;
	private int codigoUsuario;
	private String email;
	
	public Usuario(String login, String senha, String nomeDoUsuario, int codigoUsuario, String email) {
		setLogin(login);
		setSenha(senha);
		setNomeDoUsuario(nomeDoUsuario);
		setCodigoUsuario(codigoUsuario);
		setEmail(email);
	}
	
	public String getLogin() {
		return this.login;
	}
	public void setLogin(String novo) {
		if (novo == "" || novo == null) {
			System.out.println("Login não informado, por favor informe-o.");
		} else {
			this.login = novo;
		}
	}
	
	public String getSenha() {
		return this.senha;
	}
	public void setSenha(String novo) {
		if (novo == "" || novo == null) {
			System.out.println("Senha não foi informada, por favor informe-a.");
		} else {
			this.senha = novo;
		}
	}
	
	public String getNomeDoUsuario() {
		return this.nomeDoUsuario;
	}
	public void setNomeDoUsuario(String novo) {
		if (novo == ""|| novo == null) {
			System.out.println("nomeDoUsuario não foi informado, por favor informe-o.");
		} else {
			this.nomeDoUsuario = novo;
		}
	}
	
	public int getCodigoUsuario() {
		return this.codigoUsuario;
	}
	public void setCodigoUsuario(int novo) {
		if (novo == 0) {
			System.out.println("O codigo de usuario não foi informado, por favor informe-o.");
		} else {
			this.codigoUsuario = novo;
		}
	}
	
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String novo) {
		if (novo == "" || novo == null) {
			System.out.println("Email não foi informado, por favor informe-o.");
		} else {
			this.email = novo;
		}
	}

}
