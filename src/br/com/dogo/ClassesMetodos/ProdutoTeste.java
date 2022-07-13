package br.com.dogo.ClassesMetodos;

public class ProdutoTeste {

	public static void main(String[] args) {

		Produto p1 = new Produto("Note", 4356.89);
		/*
		p1.nome = "Note";
		p1.preco = 4356.89;
		p1.desconto = 0.25;
		*/
		
		Produto p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		
		Produto.desconto = 0.29;
		
		double precoFinal1 = p1.precoComDesconto(0);
		double precoFinal2 = p2.precoComDesconto(0.1);
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);
	}
}
