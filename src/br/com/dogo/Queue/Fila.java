package br.com.dogo.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();

		fila.add("Anna"); // Em caso de listas com limite, pode gerar excessão
		fila.offer("Bia"); // Em caso de listas com limite, retorna falso e não gera excessão
		fila.offer("Bia");
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");

		// Mostra o primeiro elemento da fila
		// Quando for vazio, retorna Nulo
		System.out.println("--Mostrar primeiro elemento com Peek----");
		System.out.println(fila.peek());

		// Mostra o primeiro elemento da fila
		// Quando for vazio, gera excessão
		System.out.println("--Mostrar primeiro elemento com Element-");
		System.out.println(fila.element());

		System.out.println("--Comandos------------------------------");
		System.out.println("--fila.size() - tamanho");
		System.out.println("--fila.clear() - limpar");
		System.out.println("--fila.isEmpty() - verificar se está vazio");
		System.out.println("--fila.contais() - verificar se tem na lista");
		System.out.println("----------------------------------------");

		// Quando for vazio, retorna Nulo
		System.out.println("--Mostrar primeiro elemento da fila e depois remove----");
		System.out.println(fila.poll());

		// Quando for vazio, retorna Nulo
		System.out.println("--Mostrar primeiro elemento e depois remove----");
		System.out.println(fila.peek());
		
		// Quando for vazio, gera excessão
		System.out.println("--Remover elemento-----------------------------");
		System.out.println(fila.remove());

	}

}
