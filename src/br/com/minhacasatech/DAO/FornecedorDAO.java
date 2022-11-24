package br.com.minhacasatech.DAO;


import br.com.minhacasatech.model.Fornecedor;
import java.io.*;
import java.util.ArrayList;

public class FornecedorDAO {
	private ArrayList <Fornecedor> fornecedores = new ArrayList<Fornecedor>();
	File arq;
	FileWriter writer;
	PrintWriter escrever;
	String texto = "";
	FileReader reader;
	BufferedReader ler;
	
	//carregar e salvar as informações de arquivo de texto no ArrayList
	public ArrayList <Fornecedor> getFornecedores(ArrayList <Fornecedor> fornecedores){
		return fornecedores;
	}
	
	public void setFornecedores(ArrayList <Fornecedor> fornecedores){
		this.fornecedores = fornecedores;
	} 

	public void salvar(Fornecedor fornecedor) {
		this.fornecedores.add(fornecedor);
		try {
			arq = new File("fornecedores.txt");
			writer = new FileWriter(arq);
			escrever = new PrintWriter(writer);
			String linha = "";
			for(int i = 0; i < fornecedores.size();i++) {
				linha = linha + "nome do fornecedor:" + fornecedores.get(i).getNome()+";";
				linha = linha + "endereco do fornecedor:" + fornecedores.get(i).getCpf()+";";
				linha = linha + "cpf do fornecedor:" + fornecedores.get(i).getEndereco()+";";
				linha = linha + "data de cadastro:" + fornecedores.get(i).getDataDeCadastro().getTime()+";";
				linha = linha + "código fornecedor:" + fornecedores.get(i).getCodigoFornecedor()+"/";
			}
			escrever.print(linha);
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
