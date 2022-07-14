package br.com.dogo.HerancaComEncapsulamento.Encapsulamento;

// Extends para Civic herdar de Carro
public class Civic extends Carro {

	// Construtor criado pois a classe Carro não possui construtor padrão 
	public Civic() {
		super(212); // 212 é a velocidade máxima atribuída para o modelo Civic
	}
}
