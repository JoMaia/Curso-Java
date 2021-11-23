import java.util.Scanner;

public class OperadorTernario {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira um numero");
		
		int numero_lido = teclado.nextInt();
		String acima = (numero_lido > 10) ? "maior que" : "menor ou igual a";
		
		System.out.println("O numero que escreveu é " + acima + " 10");
		}
	}
