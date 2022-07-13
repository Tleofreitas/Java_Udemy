package br.com.dogo.Arrays;

import java.util.Scanner;

public class DesafioArrayMediaNotas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Quantas notas: ");
		int qtdNotas = teclado.nextInt();

		double[] notas = new double[qtdNotas];

		for (int i = 0; i < notas.length; i++) {
			System.out.print("informe a nota " + (i + 1) + ": ");
			notas[i] = teclado.nextDouble();
		}

		double total = 0.0;
		for (double nota : notas) {
			total += nota;
		}
		
		double media = total / notas.length;
		System.out.println("A média é " + media + "!");

		teclado.close();
	}

}
