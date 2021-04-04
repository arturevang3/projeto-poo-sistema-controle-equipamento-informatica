package br.com.minhacasatech.DAO;

import br.com.minhacasatech.model.Compra;
import java.io.*;
import java.util.ArrayList;

public class CompraDAO {
	private ArrayList <Compra> compras;
	File arq;
	FileWriter writer;
	PrintWriter escrever;
	String texto;
	FileReader reader;
	BufferedReader ler;

	public void salvar(Compra compra) {
		compras.add(compra);
		try {
			arq = new File("compras.txt");
			writer = new FileWriter(arq);
			escrever = new PrintWriter(writer);
			escrever.print(compras);
			escrever.close();
			writer.close();
			
		} catch(IOException e) {e.printStackTrace();}
	}

public boolean pesquisar(Compra compra) {
		try{
			arq = new File("compras.txt");
			if(arq.exists() && arq.isFile() && arq.canRead()) {
				reader = new FileReader("compras.txt");
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

public void editar(Compra compra) {
		if(pesquisar(compra)) {
			
		compras.add(compra);
		try {
			arq = new File("compras.txt");
			writer = new FileWriter(arq);
			escrever = new PrintWriter(writer);
			escrever.print(compras);
			escrever.close();
			writer.close();
			
		} catch(IOException e) {e.printStackTrace();}
		
		}
	}

public void excluir(Compra compra) {
		compras.remove(compra);
		try {
			arq = new File("compras.txt");
			writer = new FileWriter(arq);
			escrever = new PrintWriter(writer);
			escrever.print(compras);
			escrever.close();
			writer.close();
			
		} catch(IOException e) {e.printStackTrace();}
	}

}
