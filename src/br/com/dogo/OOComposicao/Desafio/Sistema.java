package br.com.dogo.OOComposicao.Desafio;

public class Sistema {

	public static void main(String[] args) {
		
		// Criar Cliente
		Cliente cliente = new Cliente("Maria Julia Moraes");
		
		// Criar compa
		Compra compra1 = new Compra();
		// Adcicionar Itens na Compra
		compra1.adicionarItem("Caneta", 1, 100);
		compra1.adicionarItem(new Produto("Notebook", 2000), 2);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno", 10, 10);
		compra2.adicionarItem(new Produto("Impressora", 1000), 1);
		
		// Adicionar Compras a um Cliente
		cliente.adicionarCompra(compra1);
		cliente.compras.add(compra2);
		
		System.out.println(cliente.obterValorTotal());
	}
}
