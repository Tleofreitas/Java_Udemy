package br.com.dogo.HerancaComEncapsulamento.Encapsulamento;

public class Carro {

	// public pois não muda
	public final int VELOCIDADE_MAXIMA;
	// protected pois é transmitido por herança
	protected int velocidadeAtual;
	protected int padraoAceleracao = 5;

	protected Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	// Método acelerar padrão
	public void acelerar() {
		if (velocidadeAtual + padraoAceleracao > VELOCIDADE_MAXIMA) { // Regra para não exceder velocidade máxima
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += padraoAceleracao;
		}
	}

	public void frear() {
		if (velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		} else {
			velocidadeAtual = 0;
		}
	}

	@Override
	public String toString() {
		return "Velocidade atual é " + velocidadeAtual + " Km/h";
	}
}
