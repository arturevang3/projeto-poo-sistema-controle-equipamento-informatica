package br.com.minhacasatech.DAO;


import br.com.minhacasatech.model.Compra;
import java.io.*;
import java.util.ArrayList;

public class CompraDAO {
	private ArrayList <Compra> compras = new ArrayList<Compra>();
	File arq;
	FileWriter writer;
	PrintWriter escrever;
	String texto = "";
	FileReader reader;
	BufferedReader ler;
	
	//carregar e salvar as informações de arquivo de texto no ArrayList
		public ArrayList <Compra> getCompras(ArrayList <Compra> compras){
			return compras;
		}
		
		public void setCompras(ArrayList <Compra> compras){
			this.compras = compras;
		} 

		public void salvar(Compra compra) {
			this.compras.add(compra);
			try {
				arq = new File("compras.txt");
				writer = new FileWriter(arq);
				escrever = new PrintWriter(writer);
				String linha = "";
				for(int i = 0; i < compras.size();i++) {
					linha = linha + "código fornecedor:" + compras.get(i).getCodigoFornecedor()+";";
					linha = linha + "código equipamento:" + compras.get(i).getCodigoEquipamento()+";";
					linha = linha + "código responsavel:" + compras.get(i).getCodigoResponsavel()+";";
					linha = linha + "quantidade:" + compras.get(i).getQuantidade()+";";
					linha = linha + "valor unitario:" + compras.get(i).getValorUnitario()+";";
					linha = linha + "valor total:" + compras.get(i).getValorTotal()+";";
					linha = linha + "data da compra:" + compras.get(i).getDataDaCompra().getTime()+";";
					linha = linha + "forma de pagamento:" + compras.get(i).getFormaDePagamento()+"/";
				}
				escrever.print(linha);
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
