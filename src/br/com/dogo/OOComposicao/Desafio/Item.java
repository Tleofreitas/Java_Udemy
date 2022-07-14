package br.com.dogo.OOComposicao.Desafio;

public class Item {

	// UM Item tem UM Produto
	
	final Produto produto;
	final int quantidade;
	
	public Item(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}
}
