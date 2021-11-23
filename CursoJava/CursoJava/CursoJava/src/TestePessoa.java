import java.text.ParseException;
import java.util.Scanner;

import poo.Pessoa;



public class TestePessoa {

	public static void main(String[] args) throws ParseException {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Insira o seu nome");
		String nome = teclado.nextLine();

		System.out.println("Insira a sua Morada");
		String morada = teclado.nextLine();

		System.out.println("Insira o seu telefone");
		long telefone = teclado.nextLong();

		

		teclado.nextLine();
		System.out.println("Insira a sua data de nascimento no formato dd-mm-aaaa");
		String datanasc = teclado.nextLine();

		Pessoa p = new Pessoa(nome, morada, telefone, datanasc);

		long idade = p.obterIdade();
		System.out.println("Voce tem " + idade + " anos");
	}

}
