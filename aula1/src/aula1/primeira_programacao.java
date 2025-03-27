package aula1;

import java.util.Locale;

public class primeira_programacao {

	public static void main(String[] args) {
		
		String nome = "Maria";
		int idade = 32;
		double renda = 4000.0;

		System.out.println(nome);
		System.out.println(idade);
		System.out.println(renda);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n ", nome, idade, renda);;
		Locale.setDefault(Locale.US);
		
	}

}
