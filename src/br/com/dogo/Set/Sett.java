package br.com.dogo.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sett {

	public static void main(String[] args) {

		// Nenhuma dessas abaixo pode acessar os elementos pelo índice
		
		// HashSet Não garante ordenação
		Set<String> listaAprovados = new HashSet<>();
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");

		System.out.println("--- HashSet ---");
		for (String candidato : listaAprovados) {
			System.out.println(candidato);
		}

		// TreeSet Garante ordenação
		Set<String> listaAprovadosB = new TreeSet<>();
		listaAprovadosB.add("Ana");
		listaAprovadosB.add("Carlos");
		listaAprovadosB.add("Luca");
		listaAprovadosB.add("Pedro");

		System.out.println("--- TreeSet ---");
		for (String candidato : listaAprovadosB) {
			System.out.println(candidato);
		}

		// HashSet Com Números
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);

		System.out.println("--- HashSet com Integer---");
		for (int n : nums) {
			System.out.println(n);
		}

	}

}
