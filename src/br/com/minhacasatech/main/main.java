package br.com.minhacasatech.aplicacao;

import br.com.minhacasatech.DAO.*;
import br.com.minhacasatech.model.*;
import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		//relacionamento de equipamento
		System.out.println("Informações de equipamento");
		Local local = new Local("casa de toinho", "sala", 1);
		Usuario usuario = new Usuario("Toinho", "1234", "Toinho12", 3, "toinho@hotmail.com");
		Responsavel responsavel = new Responsavel("Toinho", "84-9-96457897", "Rua Das Dores", usuario.getCodigoUsuario(), 10);
		Equipamento equipamento = new Equipamento("computador", 1000.0f, "1090", 3, 1200.0f, local.getCodigoLocal(), responsavel.getCodigoResponsavel(), 40);
		
		
		System.out.println("nome: "+equipamento.getNomeDeEquipamento());
		System.out.println("peso: "+equipamento.getPeso());
		System.out.println("serie: "+equipamento.getNumeroDeSerie());
		System.out.println("quantidade: "+equipamento.getQuantidade());
		System.out.println("preco: "+equipamento.getPreco());
		System.out.println("codigo local: "+equipamento.getCodigoLocal());
		System.out.println("codigo responsavel: "+equipamento.getCodigoResponsavel());
		System.out.println("codigo equipamento: "+equipamento.getCodigoEquipamento());
		
		
		System.out.println("\n\n");
		System.out.println("Informações de venda");
		//relacionamento de venda
		Cliente cliente = new Cliente("livia", "034.098.345-23", "Rua Maria Dias", Calendar.getInstance(), 5);
		Venda venda = new Venda(cliente.getCodigoCliente(), responsavel.getCodigoResponsavel(), equipamento.getCodigoEquipamento(), 4, 3000, Calendar.getInstance(), "dinheiro");
		venda.setValorTotal();
		
		System.out.println("codigo cliente: "+venda.getCodigoCliente());
		System.out.println("codigo responsavel: "+venda.getCodigoResponsavel());
		System.out.println("codigo equipamento: "+venda.getCodigoEquipamento());
		System.out.println("quantidade: "+venda.getQuantidade());
		System.out.println("valor unitario: "+venda.getValorUnitario());
		System.out.println("valor total: "+venda.getValorTotal());
		System.out.println("data da venda: " +venda.getDataDaVenda().getTime());
		System.out.println("codigo responsavel: "+equipamento.getCodigoResponsavel());
		System.out.println("codigo equipamento: "+equipamento.getCodigoEquipamento());
		
		System.out.println("\n\n");
		System.out.println("Informações de Usuário");
		//relacionamento de usuario
		System.out.println("login: "+usuario.getLogin());
		System.out.println("senha: "+usuario.getSenha());
		System.out.println("nome de usuário: "+usuario.getNomeDoUsuario());
		System.out.println("código do usuario:"+usuario.getCodigoUsuario());
		System.out.println("email: "+usuario.getEmail());
		
		System.out.println("\n\n");
		System.out.println("Informações de Local");
		//relacionamento de local
		System.out.println("casa: "+local.getCasa());
		System.out.println("compartimento: "+local.getCompartimento());
		System.out.println("codigo de local: "+local.getCodigoLocal());
		
		System.out.println("\n\n");
		System.out.println("Informações de Cliente");
		//relacionamento de cliente
		System.out.println("nome do cliente: "+cliente.getNomeDoCliente());
		System.out.println("cpf do cliente: "+cliente.getCpfDoCliente());
		System.out.println("endereço do cliente: "+cliente.getEnderecoDoCliente());
		System.out.println("data de cadastro: "+cliente.getDataDeCadastro().getTime());
		System.out.println("codigo do cliente: "+cliente.getCodigoCliente());
		
		System.out.println("\n\n");
		System.out.println("Informações de fornecedor");
		//relacionamento de fornecedor
		Fornecedor fornecedor = new Fornecedor("Pedro", "098.876.654-90", "Rua Francisco Mota", Calendar.getInstance(), 67);
		System.out.println("nome do fornecedor: "+fornecedor.getNomeDoFornecedor());
		System.out.println("cpf do fornecedor: "+fornecedor.getCpfDoFornecedor());
		System.out.println("endereço do fornecedor: "+fornecedor.getEnderecoDoFornecedor());
		System.out.println("data de cadastro: "+fornecedor.getDataDeCadastro().getTime());
		System.out.println("codigo do fornecedor: "+fornecedor.getCodigoFornecedor());
		
		System.out.println("\n\n");
		System.out.println("Informações de compra");
		//relacionamento de compra
		Compra compra = new Compra(fornecedor.getCodigoFornecedor(),equipamento.getCodigoEquipamento(), responsavel.getCodigoResponsavel(), 2, 1200f, Calendar.getInstance(), "cartão");
		compra.setValorTotal();
		System.out.println("codigo do fornecedor: "+compra.getCodigoFornecedor());
		System.out.println("codigo do equipamento: "+compra.getCodigoEquipamento());
		System.out.println("codigo de responsavel: "+compra.getCodigoResponsavel());
		System.out.println("quantidade: "+compra.getQuantidade());
		System.out.println("valor unitario: "+compra.getValorUnitario());
		System.out.println("valor total: "+compra.getValorTotal());
		System.out.println("data da compra: "+compra.getDataDaCompra().getTime());
		System.out.println("forma de pagamento: "+compra.getFormaDePagamento());
		
		System.out.println("\n\n");
		System.out.println("Informações de responsavel");
		//relacionamento de responsavel
		System.out.println("nome do responsavel: "+responsavel.getNomeDoResponsavel());
		System.out.println("numero de telefone do responsavel: "+responsavel.getTelefoneDoResponsavel());
		System.out.println("endereço do responsavel: "+responsavel.getEnderecoDoResponsavel());
		System.out.println("código do usuário: "+responsavel.getCodigoUsuario());
		System.out.println("código do responsável: "+responsavel.getCodigoResponsavel());
		
		
	}

}

		