package br.com.dogo.Heranca;

//Extends para Ferrari herdar de Carro
public class Ferrari extends Carro {

	Ferrari() {
		this(315); // Caso não seja passado valor, irá atribuir 315
	}

	Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		padraoAceleracao = 350;
	}

	/* como o padraoAceleracao foi passado no construtor, não há necessidade da
	 * sobrescrita da aceleração herdada
	 * 
	// Sobrescrevendo a velocidade padrão de Acelerar recebido por herança
	@Override
	public void acelerar() {
		velocidadeAtual += 15;
	}
	*/
}
