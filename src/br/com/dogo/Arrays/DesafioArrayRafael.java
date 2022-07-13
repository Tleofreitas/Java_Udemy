package br.com.dogo.Arrays;

import java.util.Arrays;

public class DesafioArrayRafael {

	public static void main(String[] args) {

		int[] sequenciaA = { 1, 7, 4 };
		int[] sequenciaB = { 8, 6, 5, 3 };
		int[] sequenciaC = { 2, 9, 0 };

		int tamanhoArray = sequenciaA.length + sequenciaB.length + sequenciaC.length;
		int[] sequenciaD = new int[tamanhoArray];

		int posicao = 0;
		for (int elemento : sequenciaA) {
			sequenciaD[posicao] = elemento;
			posicao++;
		}
		for (int elemento : sequenciaB) {
			sequenciaD[posicao] = elemento;
			posicao++;
		}
		for (int elemento : sequenciaC) {
			sequenciaD[posicao] = elemento;
			posicao++;
		}

		System.out.println("Ordem numérica:");
		System.out.println(Arrays.toString(sequenciaD));
		int menor = 0;

		for (int i = 0; i < sequenciaD.length; i++) {
			for (int j = 0; j < sequenciaD.length - 1; j++) {
				if (sequenciaD[j] > sequenciaD[j + 1]) {
					menor = sequenciaD[j];
					sequenciaD[j] = sequenciaD[j + 1];
					sequenciaD[j + 1] = menor;
				}
			}
		}

		System.out.println("Ordem numérica Ordenada:");
		System.out.println(Arrays.toString(sequenciaD));
	}

}
