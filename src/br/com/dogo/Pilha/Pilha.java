package br.com.dogo.Pilha;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		// O último elemento que entra é o primeiro que sai
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O pequeno Principe");
		livros.add("Don Quixote");
		livros.add("O Hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		// Mesmos principios da Queue
	}
}
