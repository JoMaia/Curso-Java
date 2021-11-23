import java.util.Scanner;

public class Condicao {

	public static void main(String[] args) {

		int idade;

		try {
			System.out.println("Intruduzaa sua idade");
			Scanner teclado = new Scanner(System.in);

			idade = teclado.nextInt();

			if (idade < 19) {
				System.out.println("Você é um jovem");
			} else {
				System.out.println("Você é um adulto");
			}
		} catch (Exception e) {
			System.out.println("Idade invalida");
		}
	}
}