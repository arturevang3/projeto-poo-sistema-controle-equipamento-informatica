package br.com.minhacasatech.DAO;

import br.com.minhacasatech.model.Venda;
import java.io.*;
import java.util.ArrayList;

public class VendaDAO {
	private ArrayList <Venda> vendas = new ArrayList<Venda>();
	File arq;
	FileWriter writer;
	PrintWriter escrever;
	String texto = "";
	FileReader reader;
	BufferedReader ler;
	
	//carregar e salvar as informações de arquivo de texto no ArrayList
	public ArrayList <Venda> getVendas(ArrayList <Venda> vendas){
		return vendas;
	}
	
	public void setVendas(ArrayList <Venda> vendas){
		this.vendas = vendas;
	}
	
	
	public void salvar(Venda venda) {
		this.vendas.add(venda);
		try {
			arq = new File("vendas.txt");
			writer = new FileWriter(arq);
			escrever = new PrintWriter(writer);
			String linha = "";
			for(int i = 0; i < vendas.size();i++) {
				linha = linha + "código cliente:" + vendas.get(i).getCodigoCliente()+";";
				linha = linha + "código responsavel:" + vendas.get(i).getCodigoResponsavel()+";";
				linha = linha + "código equipamento:" + vendas.get(i).getCodigoEquipamento()+";";
				linha = linha + "quantidade:" + vendas.get(i).getQuantidade()+";";
				linha = linha + "valor unitario:" + vendas.get(i).getValorUnitario()+";";
				linha = linha + "valor total:" + vendas.get(i).getValorTotal()+";";
				linha = linha + "data da venda:" + vendas.get(i).getDataDaVenda().getTime()+";";
				linha = linha + "forma de pagamento:" + vendas.get(i).getFormaDePagamento()+"/";
			}
			escrever.print(linha);
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
