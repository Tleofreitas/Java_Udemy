package br.com.dogo.geral;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		double valor1 = teclado.nextDouble();
		
		System.out.print("Digite o segundo numero: ");
		double valor2 = teclado.nextDouble();
		
		System.out.println("Digite a operação desejada (+, -, *, / ou %): ");
		String operacao = teclado.next();
		
		double resultado = "+".equals(operacao) ? valor1 + valor2 : 0;
		resultado = "-".equals(operacao) ? valor1 - valor2 : resultado;
		resultado = "*".equals(operacao) ? valor1 * valor2 : resultado;
		resultado = "/".equals(operacao) ? valor1 / valor2 : resultado;
		resultado = "%".equals(operacao) ? valor1 % valor2 : resultado;
		
		// System.out.print(valor1 + " " + operacao + " " + valor2 + " = " + resultado);
		System.out.printf("%.2f %s %.2f = %.2f", valor1, operacao, valor2, resultado);
		
		teclado.close();
	}

}
