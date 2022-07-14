package br.com.dogo.Encapsulamento.casaB;

import br.com.dogo.Encapsulamento.casaA.Ana;

// extends pois herda (Pedro é filho de Ana)
public class Pedro extends Ana {

	/* Não é necessário instanciar pois Pedro herda de Ana
	 * Ana mae = new Ana();
	 */

	void testeAcesso() {
		// System.out.println(esposa.segredo); // Erro pois "segredo" é privado
		
		// System.out.println(mae.facoDentroDeCasa); // Erro pois é padrão (só é visivel no mesmo pacote "br.com.dogo.Encapsulamento.casaA")
		
		/* --- FORMA ERRADA ---
		 * System.out.println(mae.formaDeFalar);
		 * Errado pois Pedro é herança de Ana. Não é necessário instanciar Ana.
		 * Deve-se acessar diretamente pois recebeu os atributos por herança.
		 */
		 
		// --- FORMA CORRETA ---
		System.out.println(formaDeFalar); // Acessa pois é protected (mesmo pacote) "br.com.dogo.Encapsulamento"
		
		System.out.println(todosSabem); // Acessa pois é publico
	}
}
