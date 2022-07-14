package br.com.dogo.OOComposicao.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	// UMA Compra tem MUITOS Itens
	List<Item> itens = new ArrayList<>();
	
	// Ao adicionar, também cria o Item
	public void adicionarItem(Produto p, int quantidade) {
		this.itens.add(new Item(p, quantidade));
	}
	
	//
	public void adicionarItem(String nome, double preco, int quantidade) {
		Produto produto = new Produto(nome, preco);
		this.itens.add(new Item(produto, quantidade));
	}
	
	double obterValorTotal() {
		double total = 0.0;
		
		for (Item item : itens) {
			total += item.quantidade * item.produto.preco;
		}
		
		return total;
	}
}
