package br.com.dogo.OOComposicao;

import java.util.ArrayList;

public class Compra {

	String cliente;
	ArrayList<CompraItem> itens = new ArrayList<>();
	
	void adicionarItem(String nome, int quantidade, double preco) {
		this.adicionarItem(nome, quantidade, preco);
	}
	
	void adicionarItem(CompraItem item) {
		itens.add(item);
		item.compra = this;
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for (CompraItem compraItem : itens) {
			total += compraItem.quantidade * compraItem.preco;
		}
		return total;
	}
}
