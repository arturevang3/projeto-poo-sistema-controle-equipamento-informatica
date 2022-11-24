package br.com.minhacasatech.DAO;

import br.com.minhacasatech.model.Usuario;
import java.io.*;
import java.util.ArrayList;

public class UsuarioDAO {
	private ArrayList <Usuario> usuarios = new ArrayList<Usuario>();
	File arq;
	FileWriter writer;
	PrintWriter escrever;
	String texto = "";
	FileReader reader;
	BufferedReader ler;
	
	
	//carregar e salvar as informações de arquivo de texto no ArrayList
	public ArrayList <Usuario> getUsuarios(ArrayList <Usuario> usuarios){
		return usuarios;
	}
	
	public void setUsuarios(ArrayList <Usuario> usuarios){
		this.usuarios = usuarios;
	}
	
	public void salvar(Usuario usuario) {
		this.usuarios.add(usuario);
		try {
			arq = new File("usuarios.txt");
			writer = new FileWriter(arq);
			escrever = new PrintWriter(writer);
			String linha = "";
			for(int i = 0; i < usuarios.size();i++) {
				linha = linha + "login:" + usuarios.get(i).getLogin()+";";
				linha = linha + "senha:" + usuarios.get(i).getSenha()+";";
				linha = linha + "nome de usuario:" + usuarios.get(i).getNomeDoUsuario()+";";
				linha = linha + "codigo de usuario:" + usuarios.get(i).getCodigoUsuario()+";";
				linha = linha + "email:" + usuarios.get(i).getEmail()+"/";
			}
			escrever.print(linha);
			escrever.close();
			writer.close();
			
		} catch(IOException e) {e.printStackTrace();}
	}
	
	public boolean pesquisar(Usuario usuario) {
		try{
			arq = new File("usuarios.txt");
			if(arq.exists() && arq.isFile() && arq.canRead()) {
				reader = new FileReader("usuarios.txt");
				ler = new BufferedReader(reader);
				String linha = "";
				while ((linha = ler.readLine()) != null)
					texto = texto + linha;
				ler.close();
				reader.close();
			}
		}catch(IOException e) {e.printStackTrace();}
		finally {System.out.println(texto);}
		if(texto == null) {
			return false;
		} else {
			return true;
		}
	}
	
	public void editar(Usuario usuario) {
		if(pesquisar(usuario)) {
			
		usuarios.add(usuario);
		try {
			arq = new File("usuarios.txt");
			writer = new FileWriter(arq);
			escrever = new PrintWriter(writer);
			escrever.print(usuarios);
			escrever.close();
			writer.close();
			
		} catch(IOException e) {e.printStackTrace();}
		
		}
	}
	
	public void excluir(Usuario usuario) {
		usuarios.remove(usuario);
		try {
			arq = new File("usuarios.txt");
			writer = new FileWriter(arq);
			escrever = new PrintWriter(writer);
			escrever.print(usuarios);
			escrever.close();
			writer.close();
			
		} catch(IOException e) {e.printStackTrace();}
	}

}
