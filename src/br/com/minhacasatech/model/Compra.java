package br.com.minhacasatech.model;

import java.util.Calendar;

public class Compra {
	private int codigoFornecedor;
	private int codigoEquipamento;
	private int codigoResponsavel;
	private int quantidade;
	private float valorUnitario;
	private float valorTotal;
	private Calendar dataDaCompra;
	private String formaDePagamento;
	
	public Compra(int codigoFornecedor,int codigoEquipamento,int codigoResponsavel,int quantidade,float valorUnitario, Calendar dataDaCompra,String formaDePagamento){
		setCodigoFornecedor(codigoFornecedor);
		setCodigoEquipamento(codigoEquipamento);
		setCodigoResponsavel(codigoResponsavel);
		setQuantidade(quantidade);
		setValorUnitario(valorUnitario);
		setDataDaCompra(dataDaCompra);
		setFormaDePagamento(formaDePagamento);
	}

	public int getCodigoFornecedor(){
		return this.codigoFornecedor;
	}
	public void setCodigoFornecedor(int novo) {
		if (novo == 0) {
			System.out.println("O codigo do fornecedor não foi informado, por favor informe-o.");
		} else {
			this.codigoFornecedor = novo;
		}
	}

	public int getCodigoEquipamento(){
		return this.codigoEquipamento;
	}
	public void setCodigoEquipamento(int novo) {
		if (novo == 0) {
			System.out.println("O codigo do equipamento não foi informado, por favor informe-o.");
		} else {
			this.codigoEquipamento = novo;
		}
	}

public int getCodigoResponsavel(){
		return this.codigoResponsavel;
	}
	public void setCodigoResponsavel(int novo) {
		if (novo == 0) {
			System.out.println("O código do responsável não foi informado, por favor informe-o.");
		} else {
			this.codigoResponsavel = novo;
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
    		System.out.println("O valor unitario não foi informado, por favor informe-o.");
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
    

 public Calendar getDataDaCompra() {
    	return this.dataDaCompra;
    }
    public void setDataDaCompra(Calendar novo) {
    	this.dataDaCompra = novo;
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
