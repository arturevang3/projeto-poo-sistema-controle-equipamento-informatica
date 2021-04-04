package br.com.minhacasatech.DAO;

import br.com.minhacasatech.model.Equipamento;
import java.io.*;
import java.util.ArrayList;

public class EquipamentoDAO {
	private ArrayList <Equipamento> equipamentos;
	File arq;
	FileWriter writer;
	PrintWriter escrever;
	String texto;
	FileReader reader;
	BufferedReader ler;
	
	
	public void salvar(Equipamento equipamento) {
		equipamentos.add(equipamento);
		try {
			arq = new File("equipamentos.txt");
			writer = new FileWriter(arq);
			escrever = new PrintWriter(writer);
			escrever.print(equipamentos);
			escrever.close();
			writer.close();
			
		} catch(IOException e) {e.printStackTrace();}
	}
	
	public boolean pesquisar(Equipamento equipamento) {
		try{
			arq = new File("equipamentos.txt");
			if(arq.exists() && arq.isFile() && arq.canRead()) {
				reader = new FileReader("equipamentos.txt");
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
	
	public void editar(Equipamento equipamento) {
		if(pesquisar(equipamento)) {
			
		equipamentos.add(equipamento);
		try {
			arq = new File("equipamentos.txt");
			writer = new FileWriter(arq);
			escrever = new PrintWriter(writer);
			escrever.print(equipamentos);
			escrever.close();
			writer.close();
			
		} catch(IOException e) {e.printStackTrace();}
		
		}
	}
	
	public void excluir(Equipamento equipamento) {
		equipamentos.remove(equipamento);
		try {
			arq = new File("equipamentos.txt");
			writer = new FileWriter(arq);
			escrever = new PrintWriter(writer);
			escrever.print(equipamentos);
			escrever.close();
			writer.close();
			
		} catch(IOException e) {e.printStackTrace();}
	}

}
