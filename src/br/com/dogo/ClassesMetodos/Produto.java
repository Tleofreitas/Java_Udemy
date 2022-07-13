package br.com.dogo.ClassesMetodos;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;
	
	public Produto() {
	}

	public Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}

	double precoConDesconto() {
		return preco * (1 - desconto);
	}

	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}
}
