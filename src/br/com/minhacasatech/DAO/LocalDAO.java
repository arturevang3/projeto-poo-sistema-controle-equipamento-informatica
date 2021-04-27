package br.com.minhacasatech.DAO;

import br.com.minhacasatech.model.Local;
import java.io.*;
import java.util.ArrayList;

public class LocalDAO {
	private ArrayList <Local> locais = new ArrayList<Local>();
	File arq;
	FileWriter writer;
	PrintWriter escrever;
	String texto = "";
	FileReader reader;
	BufferedReader ler;
	
	//carregar e salvar as informações de arquivo de texto no ArrayList
	public ArrayList <Local> getLocais(ArrayList <Local> locais){
		return locais;
	}
			
	public void setLocais(ArrayList <Local> locais){
		this.locais = locais;
	} 
	
	
	public void salvar(Local local) {
		this.locais.add(local);
		try {
			arq = new File("locais.txt");
			writer = new FileWriter(arq);
			escrever = new PrintWriter(writer);
			String linha = "";
			for(int i = 0; i < locais.size();i++) {
				linha = linha + "casa:" + locais.get(i).getCasa()+";";
				linha = linha + "compartimento:" + locais.get(i).getCompartimento()+";";
				linha = linha + "codigo:" + locais.get(i).getCodigoLocal()+";";
			}
			escrever.print(linha);
			escrever.close();
			writer.close();
			
		} catch(IOException e) {e.printStackTrace();}
	}
		 
	
	public boolean pesquisar(Local local) {
		try{
			arq = new File("locais.txt");
			if(arq.exists() && arq.isFile() && arq.canRead()) {
				reader = new FileReader("locais.txt");
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
	
	public void editar(Local local) {
		if(pesquisar(local)) {
			
		locais.add(local);
		try {
			arq = new File("locais.txt");
			writer = new FileWriter(arq);
			escrever = new PrintWriter(writer);
			escrever.print(locais);
			escrever.close();
			writer.close();
			
		} catch(IOException e) {e.printStackTrace();}
		
		}
	}
	
	public void excluir(Local local) {
		locais.remove(local);
		try {
			arq = new File("locais.txt");
			writer = new FileWriter(arq);
			escrever = new PrintWriter(writer);
			escrever.print(locais);
			escrever.close();
			writer.close();
			
		} catch(IOException e) {e.printStackTrace();}
	}

}
