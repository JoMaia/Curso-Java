import java.util.Scanner;
public class LeituraDeDados {

	public static void main (String[] args) throws java.io.IOException {
		System.out.println("Introduza um numero e prima Enter");
		Scanner teclado = new Scanner(System.in);
		int numero = teclado.nextInt();
		System.out.println("Intruduziu o numero - " + numero);
	} // fim do metodo main
	
} // fim da class LeituraDeDados
