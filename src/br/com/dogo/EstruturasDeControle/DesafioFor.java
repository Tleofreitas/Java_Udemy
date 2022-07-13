package br.com.dogo.EstruturasDeControle;

public class DesafioFor {

	public static void main(String[] args) {
		
		String valor = "#";
		for (int i = 1; i <= 5; i++) {
			System.out.println(valor);
			valor += "#";			
		}
		
		// Desafio: Não pode usar valor númerico para controlar o laço
		System.out.println("--- Versão Desafio -----");
		for (String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);			
		}
	}
}
