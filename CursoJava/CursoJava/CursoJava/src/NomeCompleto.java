import java.util.Scanner;

public class NomeCompleto {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduza nome completo");
		String nomeCompleto = teclado.nextLine();

		String[] nomeSeparado = nomeCompleto.split(" ");

		System.out.println(nomeSeparado[0].toUpperCase());

		System.out.println(nomeSeparado[nomeSeparado.length - 1].toUpperCase());
	}

}
