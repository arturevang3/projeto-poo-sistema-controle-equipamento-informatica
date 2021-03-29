package br.com.minhacasatech.model;

import java.util.Calendar;

public class Venda {
	private Cliente cliente;
	private Responsavel responsavel;
	private Equipamento equipamento;
	private int quantidade;
	private float valor;
	private Calendar dataDaVenda;
	private String tipoDePagamento;
	
	public Venda(Cliente cliente, Responsavel responsavel, Equipamento equipamento, int quantidade, float valor, Calendar dataDaVenda, String tipoDePagamento) {
		setCliente(cliente);
		setResponsavel(responsavel);
		setEquipamento(equipamento);
		setQuantidade(quantidade);
		setValor(valor);
		setDataDaVenda(dataDaVenda);
		setTipoDePagamento(tipoDePagamento);
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	public void setCliente(Cliente novo) {
		if (novo == null) {
			System.out.println("Cliente não foi informado, por favor informe-o.");
		} else {
			this.cliente = novo;
		}
	}
	
	public Responsavel getResponsavel() {
		return this.responsavel;
	}
	public void setResponsavel(Responsavel novo) {
		if (novo == null) {
			System.out.println("Responsável não foi informado, por favor informe-o");
		} else {
			this.responsavel = novo;
		}
	}
	
	public Equipamento getEquipamento() {
		return this.equipamento;
	}
	public void setEquipamento(Equipamento novo) {
		if (novo == null) {
			System.out.println("Equipamento não foi informado, por favor informe-o");
		} else {
			this.equipamento = novo;
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
    
    public Calendar getDataDaVenda() {
    	return this.dataDaVenda;
    }
    public void setDataDaVenda(Calendar novo) {
    	this.dataDaVenda = novo;
    }
    
    public String getTipoDePagamento() {
    	return this.tipoDePagamento;
    }
    
    public void setTipoDePagamento(String novo) {
    	if (novo == "" || novo == null) {
    		System.out.println("O tipo de pagamento não foi informado, por favor informe-o.");
    	} else {
    		this.tipoDePagamento = novo;
    	}
    }
}
