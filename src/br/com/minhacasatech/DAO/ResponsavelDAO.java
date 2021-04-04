package br.com.minhacasatech.DAO;

import br.com.minhacasatech.model.Responsavel;
import java.io.*;
import java.util.ArrayList;

public class ResponsavelDAO {
	private ArrayList <Responsavel> responsaveis;
	File arq;
	FileWriter writer;
	PrintWriter escrever;
	String texto;
	FileReader reader;
	BufferedReader ler;

	public void salvar(Responsavel responsavel) {
		responsaveis.add(responsavel);
		try {
			arq = new File("responsaveis.txt");
			writer = new FileWriter(arq);
			escrever = new PrintWriter(writer);
			escrever.print(responsaveis);
			escrever.close();
			writer.close();
			
		} catch(IOException e) {e.printStackTrace();}
	}

public boolean pesquisar(Responsavel responsavel) {
		try{
			arq = new File("responsaveis.txt");
			if(arq.exists() && arq.isFile() && arq.canRead()) {
				reader = new FileReader("responsaveis.txt");
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

public void editar(Responsavel responsavel) {
		if(pesquisar(responsavel)) {
			
		responsaveis.add(responsavel);
		try {
			arq = new File("responsaveis.txt");
			writer = new FileWriter(arq);
			escrever = new PrintWriter(writer);
			escrever.print(responsaveis);
			escrever.close();
			writer.close();
			
		} catch(IOException e) {e.printStackTrace();}
		
		}
	}

public void excluir(Responsavel responsavel) {
		responsaveis.remove(responsavel);
		try {
			arq = new File("responsaveis.txt");
			writer = new FileWriter(arq);
			escrever = new PrintWriter(writer);
			escrever.print(responsaveis);
			escrever.close();
			writer.close();
			
		} catch(IOException e) {e.printStackTrace();}
	}

}
