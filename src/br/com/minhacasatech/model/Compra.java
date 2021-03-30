package br.com.minhacasatech.model;

import java.util.Calendar;

public class Compra {
	private Fornecedor fornecedor;
	private Equipamento equipamento;
	private Responsavel responsavel;
	private int quantidade;
	private float valor;
	private Calendar dataDaCompra;
	private String tipoDePagamento;
	
	public Compra(Fornecedor fornecedor,Equipamento equipamento,Responsavel responsavel,int quantidade,float valor,Calendar dataDaCompra,String tipoDePagamento){
		setFornecedor(fornecedor);
		setEquipamento(equipamento);
		setResponsavel(responsavel);
		setQuantidade(quantidade);
		setValor(valor);
		setDataDaCompra(dataDaCompra);
		setTipoDePagamento(tipoDePagamento);
	}

	public Fornecedor getFornecedor(){
		return this.fornecedor;
	}
	public void setFornecedor(Fornecedor novo) {
		if (novo == null) {
			System.out.println("Fornecedor não foi informado, por favor informe-o.");
		} else {
			this.fornecedor = novo;
		}
	}

	public Equipamento getEquipamento(){
		return this.equipamento;
	}
	public void setEquipamento(Equipamento novo) {
		if (novo == null) {
			System.out.println("Equipamento não foi informado, por favor informe-o.");
		} else {
			this.equipamento = novo;
		}
	}

public Responsavel getResponsavel(){
		return this.responsavel;
	}
	public void setResponsavel(Responsavel novo) {
		if (novo == null) {
			System.out.println("Responsável não foi informado, por favor informe-o.");
		} else {
			this.responsavel = novo;
		}
	}	

public int getQuantidade(){
        return this.quantidade;
    }
    public void setQuantidade(int novo){
    	if (quantidade == 0) {
    		System.out.println("A quantidade não foi informada, por favor informe-a.");
    	} else {
    		this.quantidade = novo;
    	}   
    }

 public float getValor() {
    	return this.valor;
    }
    public void setValor(float novo) {
    	if (valor == 0) {
    		System.out.println("O valor não foi informado, por favor informe-o.");
    	} else {
    		this.valor = novo;
    	}
    }

 public Calendar getdataDaCompra() {
    	return this.dataDaCompra;
    }
    public void setdataDaCompra(Calendar novo) {
    	this.dataDaCompra = novo;
    }

public String gettipoDePagamento() {
    	return this.tipoDePagamento;
    }
    public void settipoDePagamento(String novo) {
    	if (novo == "" || novo == null) {
    		System.out.println("O tipo de pagamento não foi informado, por favor informe-o.");
    	} else {
    		this.tipoDePagamento = novo;
    	}
    }

}
