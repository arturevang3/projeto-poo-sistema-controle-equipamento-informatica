package br.com.minhacasatech.DAO;

import br.com.minhacasatech.model.Fornecedor;
import java.io.*;
import java.util.ArrayList;

public class FornecedorDAO {
	private ArrayList <Fornecedor> fornecedores;
	File arq;
	FileWriter writer;
	PrintWriter escrever;
	String texto;
	FileReader reader;
	BufferedReader ler;

public void salvar(Fornecedor fornecedor) {
		fornecedores.add(fornecedor);
		try {
			arq = new File("fornecedores.txt");
			writer = new FileWriter(arq);
			escrever = new PrintWriter(writer);
			escrever.print(fornecedores);
			escrever.close();
			writer.close();
			
		} catch(IOException e) {e.printStackTrace();}
	}

public boolean pesquisar(Fornecedor fornecedor) {
		try{
			arq = new File("fornecedores.txt");
			if(arq.exists() && arq.isFile() && arq.canRead()) {
				reader = new FileReader("fornecedores.txt");
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

public void editar(Fornecedor fornecedor) {
		if(pesquisar(fornecedor)) {
			
		fornecedores.add(fornecedor);
		try {
			arq = new File("fornecedores.txt");
			writer = new FileWriter(arq);
			escrever = new PrintWriter(writer);
			escrever.print(fornecedores);
			escrever.close();
			writer.close();
			
		} catch(IOException e) {e.printStackTrace();}
		
		}
	}

public void excluir(Fornecedor fornecedor) {
		fornecedores.remove(fornecedor);
		try {
			arq = new File("fornecedores.txt");
			writer = new FileWriter(arq);
			escrever = new PrintWriter(writer);
			escrever.print(fornecedores);
			escrever.close();
			writer.close();
			
		} catch(IOException e) {e.printStackTrace();}
	}

}
