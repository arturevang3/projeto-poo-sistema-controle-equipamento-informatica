package br.com.minhacasatech.DAO;

import br.com.minhacasatech.model.Usuario;
import java.io.*;
import java.util.ArrayList;

public class UsuarioDAO {
	private ArrayList <Usuario> usuarios;
	File arq;
	FileWriter writer;
	PrintWriter escrever;
	String texto;
	FileReader reader;
	BufferedReader ler;
	
	
	public void salvar(Usuario usuario) {
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
