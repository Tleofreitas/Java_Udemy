package br.com.dogo.desafioFibonacci;

public class Program {

	public static void main(String[] args) {

		try {
			if (args.length <= 0) {
				System.out.println("Não é possível imprimir uma sequência de 0 posições!");

			} else if (Integer.parseInt(args[0]) <= 0) {
				System.out.println("Não é possível imprimir uma sequência de 0 posições!");

			} else {
				System.out.println("Sequência até a posição " + args[0]);
				int primeiroValor = 0;
				int segundoValor = 1;

				System.out.println(primeiroValor);
				System.out.println(segundoValor);

				int parametro = Integer.parseInt(args[0]);

				for (int i = 0; i < (parametro - 2); i++) {
					int sequencia = primeiroValor + segundoValor;
					System.out.println(sequencia);
					primeiroValor = segundoValor;
					segundoValor = sequencia;
				}

			}

		} catch (Exception e) {
			System.out.printf("Não é possível imprimir uma sequência atráves do caracter: " + args[0]);
		}
	}
}
