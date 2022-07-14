package br.com.dogo.Encapsulamento.casaB;

import br.com.dogo.Encapsulamento.casaA.Ana;

public class Julia {

	void testeAcesso() {
		Ana sogra = new Ana();
		
		// System.out.println(sogra.segredo); // Erro pois "segredo" é privado
		
		// System.out.println(sogra.facoDentroDeCasa); // Erro pois é padrão (só é visivel no mesmo pacote "br.com.dogo.Encapsulamento.casaA")
		
		// System.out.println(mae.formaDeFalar); Erro pois Julia não é herança de Ana e também não
		// está no mesmo pacote "br.com.dogo.Encapsulamento"

		// System.out.println(sogra.formaDeFalar); // Erro pois não é herança de Ana e também é protected
		
		System.out.println(sogra.todosSabem); // Acessa pois é publico
	}
}
