package br.com.dogo.List;

import java.util.ArrayList;

public class Lista {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Anna");
		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		
		// Imprimindo por posição Index
		System.out.println("-Imprimir por posição Index------");
		System.out.println(lista.get(2));
		System.out.println("---------------------------------");
		
		System.out.println("-Imprimir tudo-------------------");
		for (Usuario usuario : lista) {
			System.out.println(usuario);
		}
		System.out.println("---------------------------------");
		System.out.println("-Remover da Lista----------------");		
		System.out.println(">>>>" + lista.remove(1));
		System.out.println(lista.remove(new Usuario("Manu")));
		System.out.println("---------------------------------");
		
		System.out.println("-Contem na lista?----------------");
		System.out.println("Tem? " + lista.contains(new Usuario("Lia")));
		System.out.println("---------------------------------");
		
		System.out.println("-Imprimir tudo após as remoções--");
		for (Usuario usuario : lista) {
			System.out.println(usuario);
		}
		
		
		
		

	}

}
