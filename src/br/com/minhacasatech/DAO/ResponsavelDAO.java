package br.com.minhacasatech.DAO;

import br.com.minhacasatech.model.Responsavel;
import java.io.*;
import java.util.ArrayList;

public class ResponsavelDAO {
	private ArrayList <Responsavel> responsaveis = new ArrayList<Responsavel>();
	File arq;
	FileWriter writer;
	PrintWriter escrever;
	String texto = "";
	FileReader reader;
	BufferedReader ler;
	
	//carregar e salvar as informações de arquivo de texto no ArrayList
	public ArrayList <Responsavel> getResponsaveis(ArrayList <Responsavel> responsaveis){
		return responsaveis;
	}
	
	public void setResponsaveis(ArrayList <Responsavel> responsaveis){
		this.responsaveis = responsaveis;
	}

	public void salvar(Responsavel responsavel) {
		this.responsaveis.add(responsavel);
		try {
			arq = new File("responsaveis.txt");
			writer = new FileWriter(arq);
			escrever = new PrintWriter(writer);
			String linha = "";
			for(int i = 0; i < responsaveis.size();i++) {
				linha = linha + "nome:" + responsaveis.get(i).getNome()+";";
				linha = linha + "endereco:" + responsaveis.get(i).getEndereco()+";";
				linha = linha + "codigo do usuario:" + responsaveis.get(i).getCodigoUsuario()+";";
				linha = linha + "codigo do responsavel:" + responsaveis.get(i).getCodigoResponsavel()+"/";
			}
			escrever.print(linha);
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
