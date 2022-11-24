package br.com.minhacasatech.DAO;

import br.com.minhacasatech.model.Cliente;
import java.io.*;
import java.util.ArrayList;

public class ClienteDAO {
	private ArrayList <Cliente> clientes = new ArrayList<Cliente>();
	File arq;
	FileWriter writer;
	PrintWriter escrever;
	String texto = "";
	FileReader reader;
	BufferedReader ler;
	
	//carregar e salvar as informações de arquivo de texto no ArrayList
	public ArrayList <Cliente> getClientes(ArrayList <Cliente> clientes){
		return clientes;
	}
	
	public void setClientes(ArrayList <Cliente> clientes){
		this.clientes = clientes;
	} 
	
	public void salvar(Cliente cliente) {
		this.clientes.add(cliente);
		try {
			arq = new File("clientes.txt");
			writer = new FileWriter(arq);
			escrever = new PrintWriter(writer);
			String linha = "";
			for(int i = 0; i < clientes.size();i++) {
				linha = linha + "nome:" + clientes.get(i).getNome()+";";
				linha = linha + "endereco:" + clientes.get(i).getEndereco()+";";
				linha = linha + "cpf:" + clientes.get(i).getCpf()+";";
				linha = linha + "codigo:" + clientes.get(i).getCodigoCliente()+";";
				linha = linha + "data:" + clientes.get(i).getDataDeCadastro().getTime()+"/";
			}
			escrever.print(linha);
			escrever.close();
			writer.close();
			
		} catch(IOException e) {e.printStackTrace();}
	}
		 
	public boolean pesquisar(Cliente cliente) {
		try{
			arq = new File("clientes.txt");
			if(arq.exists() && arq.isFile() && arq.canRead()) {
				reader = new FileReader("clientes.txt");
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

public void editar(Cliente cliente) {
		if(pesquisar(cliente)) {
			
		clientes.add(cliente);
		try {
			arq = new File("clientes.txt");
			writer = new FileWriter(arq);
			escrever = new PrintWriter(writer);
			escrever.print(clientes);
			escrever.close();
			writer.close();
			
		} catch(IOException e) {e.printStackTrace();}
		
		}
	}

public void excluir(Cliente cliente) {
		clientes.remove(cliente);
		try {
			arq = new File("clientes.txt");
			writer = new FileWriter(arq);
			escrever = new PrintWriter(writer);
			escrever.print(clientes);
			escrever.close();
			writer.close();
			
		} catch(IOException e) {e.printStackTrace();}
	}

}
