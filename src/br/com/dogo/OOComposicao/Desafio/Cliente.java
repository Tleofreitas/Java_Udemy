package br.com.dogo.OOComposicao.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	/* --- Relação Cliente e Compra ---
	 * UM Cliente tem MUITAS Compras
	 * UMA Compra pertence a UM Cliente
	 */

	final String nome;
	public final List<Compra> compras = new ArrayList<>();
	
	public Cliente(String nome) {
		this.nome = nome;
	}
	
	public void adicionarCompra(Compra compra) {
		this.compras.add(compra);
	}

	public double obterValorTotal() {
		double total = 0.0;
		
		for(Compra compra : compras) {
			total += compra.obterValorTotal();
		}
		return total;
	}
}
