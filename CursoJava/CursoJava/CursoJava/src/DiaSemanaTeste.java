import java.util.Scanner;

public class DiaSemanaTeste {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	try {
		System.out.println("Escolha um dia da semana (Segunda/Terça/Quarta/Quinta/Quinta/Sexta/Sábado/Domingo)");
		String diaTexto = teclado.nextLine();

		DiaSemana dia = DiaSemana.valueOf(diaTexto);

		if (dia == DiaSemana.Domingo) {
			System.out.println("A Formabase está fechada no Domingo");
		} else if (dia == DiaSemana.Sabado) {
			System.out.println("A Formabase está fechada Sabado á tarde");
		} 
		else {
			System.out.println("A Formabase funciona normalmente de segunda a sexta");
		}
	}
	catch(IllegalArgumentException excecao) {
		System.out.println("Dia da semana invalido");
	}

	}

}