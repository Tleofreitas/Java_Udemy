package br.com.dogo.MapA;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

	public static void main(String[] args) {

		Map<Integer, String> usuarios = new HashMap<>();
		usuarios.put(1, "Roberto"); // Caso já exista, substitui
		usuarios.put(20, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");

		// Tamanho do Map
		System.out.println(usuarios.size());

		// Map está vazio?
		System.out.println(usuarios.isEmpty());

		// Quais são as chaves do Map?
		System.out.println(usuarios.keySet());

		// Quais são os valores do Map?
		System.out.println(usuarios.values());

		// Quais são as chaves e os valores?
		System.out.println(usuarios.entrySet());

		// Contém a Chave?
		System.out.println(usuarios.containsKey(20));

		// Contém o Valor?
		System.out.println(usuarios.containsValue("Rebeca"));

		// Puxar Informações
		System.out.println(usuarios.get(4));

		// Percorrer e imprimir as chaves
		for (int chave : usuarios.keySet()) {
			System.out.println(chave);
		}

		// Percorrer e imprimir os valores
		for (String valor : usuarios.values()) {
			System.out.println(valor);
		}

		// Percorrer e imprimir chave valor
		for (Map.Entry<Integer, String> usuario : usuarios.entrySet()) {
			System.out.print(usuario.getKey() + "==>");
			System.out.println(usuario.getValue());
		}
	}
}
