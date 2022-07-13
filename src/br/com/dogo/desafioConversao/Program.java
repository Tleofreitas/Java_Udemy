package br.com.dogo.desafioConversao;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);


		// --- Solução 1 -------------------------------------
		
		System.out.println("Digite o primeiro salário:");
		String A = teclado.next().replace(",", ".");

		System.out.println("Digite o segundo salário:");
		String B = teclado.next().replace(",", ".");

		System.out.println("Digite o terceiro salário:");
		String C = teclado.next().replace(",", ".");

		double salario1 = Double.parseDouble(A);
		double salario2 = Double.parseDouble(B);
		double salario3 = Double.parseDouble(C);

		double media = (salario1 + salario2 + salario3) / 3;
		
		System.out.println("A média do Salário é: " + media);
		

		teclado.close();
	}

}
