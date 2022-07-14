package br.com.dogo.Encapsulamento.casaA;

public class Paulo {
	
	Ana esposa = new Ana();
	
	void testeAcesso() {
		// System.out.println(esposa.segredo); // Erro pois "segredo" é privado
		
		System.out.println(esposa.facoDentroDeCasa); // Acessa pois é padrão (só é visivel no mesmo pacote "br.com.dogo.Encapsulamento.casaA")
		
		System.out.println(esposa.formaDeFalar); // Acessa pois é protected (mesmo pacote) "br.com.dogo.Encapsulamento"
		
		System.out.println(esposa.todosSabem); // Acessa pois é publico
	}
}
