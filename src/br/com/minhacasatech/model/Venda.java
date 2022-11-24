package br.com.minhacasatech.model;

import java.util.Calendar;

public class Venda {
	private int codigoCliente;
	private int codigoResponsavel;
	private int codigoEquipamento;
	private int quantidade;
	private float valorUnitario;
	private float valorTotal;
	private Calendar dataDaVenda;
	private String formaDePagamento;
	
	public Venda(int codigoCliente, int codigoResponsavel, int codigoEquipamento, int quantidade, float valorUnitario, Calendar dataDaVenda, String formaDePagamento) {
		setCodigoCliente(codigoCliente);
		setCodigoResponsavel(codigoResponsavel);
		setCodigoEquipamento(codigoEquipamento);
		setQuantidade(quantidade);
		setValorUnitario(valorUnitario);
		setDataDaVenda(dataDaVenda);
		setFormaDePagamento(formaDePagamento);
	}
	
	public int getCodigoCliente() {
		return this.codigoCliente;
	}
	public void setCodigoCliente(int novo) {
		if (novo == 0) {
			System.out.println("O codigo do cliente não foi informado, por favor informe-o.");
		} else {
			this.codigoCliente = novo;
		}
	}
	
	public int getCodigoResponsavel() {
		return this.codigoResponsavel;
	}
	public void setCodigoResponsavel(int novo) {
		if (novo == 0) {
			System.out.println("O código de responsável não foi informado, por favor informe-o");
		} else {
			this.codigoResponsavel = novo;
		}
	}
	
	public int getCodigoEquipamento() {
		return this.codigoEquipamento;
	}
	public void setCodigoEquipamento(int novo) {
		if (novo == 0) {
			System.out.println("O codigo de equipamento não foi informado, por favor informe-o");
		} else {
			this.codigoEquipamento = novo;
		}
	}
	
	public int getQuantidade(){
        return this.quantidade;
    }
    public void setQuantidade(int novo){
    	if (novo == 0) {
    		System.out.println("A quantidade não foi informada, por favor informe-a.");
    	} else {
    		this.quantidade = novo;
    	}
        
    }
    
    public float getValorUnitario() {
    	return this.valorUnitario;
    }
    public void setValorUnitario(float novo) {
    	if (novo == 0) {
    		System.out.println("O valorUnitario não foi informado, por favor informe-o.");
    	} else {
    		this.valorUnitario = novo;
    	}
    }
    
    public float getValorTotal() {
    	return this.valorTotal;
    }
    public void setValorTotal() {
    		this.valorTotal = this.quantidade*this.valorUnitario;
    	
    }
    
    public Calendar getDataDaVenda() {
    	return this.dataDaVenda;
    }
    public void setDataDaVenda(Calendar novo) {
    	this.dataDaVenda = novo;
    }
    
    public String getFormaDePagamento() {
    	return this.formaDePagamento;
    }
    
    public void setFormaDePagamento(String novo) {
    	if (novo == "" || novo == null) {
    		System.out.println("O tipo de pagamento não foi informado, por favor informe-o.");
    	} else {
    		this.formaDePagamento = novo;
    	}
    }
}
