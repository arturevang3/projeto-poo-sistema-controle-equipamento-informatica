package br.com.minhacasatech.DAO;

import br.com.minhacasatech.model.Venda;
import java.io.*;
import java.util.ArrayList;

public class VendaDAO {
	private ArrayList <Venda> vendas;
	File arq;
	FileWriter writer;
	PrintWriter escrever;
	String texto;
	FileReader reader;
	BufferedReader ler;
	
	
	public void salvar(Venda venda) {
		vendas.add(venda);
		try {
			arq = new File("vendas.txt");
			writer = new FileWriter(arq);
			escrever = new PrintWriter(writer);
			escrever.print(vendas);
			escrever.close();
			writer.close();
			
		} catch(IOException e) {e.printStackTrace();}
	}
	
	public boolean pesquisar(Venda venda) {
		try{
			arq = new File("vendas.txt");
			if(arq.exists() && arq.isFile() && arq.canRead()) {
				reader = new FileReader("vendas.txt");
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
	
	public void editar(Venda venda) {
		if(pesquisar(venda)) {
			
		vendas.add(venda);
		try {
			arq = new File("vendas.txt");
			writer = new FileWriter(arq);
			escrever = new PrintWriter(writer);
			escrever.print(vendas);
			escrever.close();
			writer.close();
			
		} catch(IOException e) {e.printStackTrace();}
		
		}
	}
	
	public void excluir(Venda venda) {
		vendas.remove(venda);
		try {
			arq = new File("vendas.txt");
			writer = new FileWriter(arq);
			escrever = new PrintWriter(writer);
			escrever.print(vendas);
			escrever.close();
			writer.close();
			
		} catch(IOException e) {e.printStackTrace();}
	}

}
