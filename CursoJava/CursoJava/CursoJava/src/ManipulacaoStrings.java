import java.util.Scanner;

public class ManipulacaoStrings {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduza uma frase");
		String frase = teclado.nextLine();
		String transformada = "";

		for (int i = 0; i < frase.length(); ++i) {
			char corrente = frase.charAt(i);

			if (corrente == 'r') {
				transformada += '1';
			} else {
				transformada += corrente;
			}
		}

		System.out.println("A frase com os r's substituidos por 1's : " + transformada);
	}

}
