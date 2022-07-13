package br.com.dogo.EstruturasDeControle;

import java.util.Scanner;

public class Geral {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		// -- If Else ---------------------------------
		System.out.println("--- IF ELSE Media -------------");
		
		Double media = 6.8;
		
		if (media >= 7.0) {
			System.out.println("Aprovado!");			
		} else {
			System.out.println("Reprovado!");
		}
		
		/*
		 * Não usar ; em estruturas de controle. Exemplo:
		 * if (media >= 7.0); {
		 * 		System.out.println("Aprovado!");			
		 * } else {
		 * 		System.out.println("Reprovado!");
		 * }
		*/
		
		System.out.println("\n--- IF ELSE IF Dia da Semana ---");
		
		String diaDaSemana = "terca";
		
		if (diaDaSemana == "Domingo") {
			System.out.println("Valor da semana = 1");
		} else if (diaDaSemana.equalsIgnoreCase("Segunda")) { // Não usar == para comparar String !!
			System.out.println("Valor da semana = 2");
		} else if ((diaDaSemana.equalsIgnoreCase("Terça")) || (diaDaSemana.equalsIgnoreCase("Terca"))) { // Ignora letra maiusculas e minusculas
			System.out.println("Valor da semana = 3");
		} else if ("Quarta".equalsIgnoreCase(diaDaSemana)) { // Ignora letra maiusculas e minusculas
			System.out.println("Valor da semana = 4");
		} else {
			System.out.println("Valor inválido!");
		}
		
		/*
		 * -- While ---------------------------------
		 * Laço de repetição Indeterminado
		 * Pode NÃO SER EXECUTADO. No exemplo abaixo, se a variável valor fosse "sair",
		 * o bloco do while não seria executado. 
		 */
		
		System.out.println("\n--- While ----------------------");
		
		String valor = "";
		while (!valor.equalsIgnoreCase("sair")) {
			System.out.println("Você diz (SAIR): ");
			valor = teclado.nextLine();		
		}		
		
		System.out.println("\nWhile Terminado!");
		
		/*
		 * -- Do While ---------------------------------
		 * Laço de repetição Indeterminado
		 * Diferente do While, é EXECUTADO NO MÍNIMO UMA VEZ
		 */
		
		System.out.println("\n--- Do While -------------------");
		
		String valor2 = "Sair";
		do {
			System.out.println("Digite o password de SAÍDA (SAIR)...");
			valor2 = teclado.nextLine();			
		} while (!valor2.equalsIgnoreCase("sair"));
		
		System.out.println("\nDo While Terminado!");
		
		/*
		 * -- For ---------------------------------
		 * Laço de repetição Determinado 
		 */

		System.out.println("\n--- For -------------------------");
		for (int contador = 10; contador >= 0; contador -= 2) {
			System.out.printf("Contador = %d\n", contador);			
		}
		
		System.out.println("\n--- For 2 -----------------------");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("[%d %d]", i, j);
			}
			System.out.println();			
		}
	
		/*
		 * -- Switch Case --------------------------
		 * Case não permite intervalos 
		 * Case não pode ser duplicado
		 */
		System.out.println("\n--- Switch Sem Break-------------");
		String faixa = "Vermelha";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o Shodan...");
		case "roxa":
			System.out.println("Sei o Godan...");
		case "verde":
			System.out.println("Sei o Yodan...");
		case "laranja":
			System.out.println("Sei o Sandan...");
		case "vermelha":
			System.out.println("Sei o Nidan...");
		case "amarela":
			System.out.println("Sei o Shodan...");
		}
		
		System.out.println("\n--- Switch Com Break-------------");
		String conceito = "";
		System.out.println("Informe a nota: ");
		int nota = teclado.nextInt();
		
		switch (nota) {
		case 10: case 9:
			conceito = "A";
			break;
		case 8: case 7:
			conceito = "B";
			break;
		case 6: case 5:
			conceito = "C";
			break;
		case 4: case 3:
			conceito = "D";
			break;
		case 2: case 1: case 0:
			conceito = "E";
			break;

		default:
			conceito = "não encontrado!";
			break;
		}
		
		System.out.printf("Conceito é: " + conceito);
		
		/*
		 * -- Break e Continue --------------------------
		 * Break interrompe o bloco de código
		 * Continue avança para a próxima iteração
		 */
		
		/*
		 * -- Exercícios -------------------------------
			1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;
			
			2. Criar um programa informa se o ano atual é um ano bissexto;
			
			3. Criar um programa que receba duas notas parciais, calcular a média final. Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado", se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação", caso contrário imprime no console "Reprovado".
			
			4. Criar um programa que receba um número e diga se ele é um número primo.
			
			5. Refatorar o exercício 04, utilizando a estrutura switch.
			
			6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um numero aleatório em uma variável. O Jogador tem 10 tentativas para adivinhar o número gerado. Ao final de cada tentativa, imprima a quantidade de tentativas restantes, e imprima se o número inserido é maior ou menor do que o número armazenado.
			
			7. Criar um programa que enquanto estiver recebendo números positivos, imprime no console a soma dos números inseridos, caso receba um número negativo, encerre o programa. Tente utilizar a estrutura do while.
			
			8. Criar um programa que receba uma palavra e imprime no console letra por letra.
			
			9. Crie um programa que recebe 10 valores e ao final imprima o maior número.
			
			Respostas em:
			https://github.com/cod3rcursos/fundamentos-programacao-java/blob/master/CursoJavaExercicios/src/controle/Exercicio3.java
		 */
		
		teclado.close();
	}
}
