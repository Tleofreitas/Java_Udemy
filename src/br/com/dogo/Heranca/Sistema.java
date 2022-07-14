package br.com.dogo.Heranca;

public class Sistema {

	public static void main(String[] args) {

		System.out.println("--- Carro 1 ---");
		Carro c1 = new Civic();
		
		c1.acelerar();
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);
		
		c1.acelerar();
		c1.frear();
		System.out.println(c1);

		System.out.println("--- Carro 2 ---");
		Carro c2 = new Ferrari(400);
		// OU Carro c2 = new Ferrari(); Não passando a velocidade máxima

		c2.acelerar();
		System.out.println(c2);
		
		c2.acelerar();
		System.out.println(c2);
		
		c2.acelerar();
		c2.frear();
		System.out.println(c2);
		
	}
}
