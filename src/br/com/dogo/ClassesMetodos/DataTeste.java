package br.com.dogo.ClassesMetodos;

public class DataTeste {

	public static void main(String[] args) {

		Data d1 = new Data();

		Data d2 = new Data(31, 12, 2020);
		/*
		d2.dia = 31;
		d2.mes = 12;
		d2.ano = 2020;
		*/

		System.out.println(d1.obterData());
		System.out.println(d2.obterData());
	}

}
