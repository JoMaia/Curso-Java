import java.util.Scanner;

public class MedodosExercicio2 {

	public static String diaDaSemana(int numero) {
		switch (numero) {
		case 1:
			return "Segunda-Feira";
		case 2:
			return "Terça-Feira";
		case 3:
			return "Quarta-Feira";
		case 4:
			return "Quinta-Feira";
		case 5:
			return "Sexta-Feira";
		case 6:
			return "Sábado-Feira";
		case 7:
			return "Domingo-Feira";

		default:
			return "Esse dia é Invalido";
		}
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Insira o primeiro dia de trabalho da semana");
		int primeiroDia = teclado.nextInt();
		System.out.println("Insira o segundo dia de trabalho da semana");
		int ultimoDia = teclado.nextInt();

		String diasmna = diaDaSemana(primeiroDia);
		String diasmna2 = diaDaSemana(ultimoDia);

		System.out.println("Voçê trabalha de " + diasmna + " a " + diasmna2);

	}

}