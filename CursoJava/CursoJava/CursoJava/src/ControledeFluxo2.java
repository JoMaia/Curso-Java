import java.util.Scanner;

public class ControledeFluxo2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Intruduza o primeiro numero");
		int numero1 = teclado.nextInt();
		System.out.println("Intruduza o segundo numero");
		int numero2 = teclado.nextInt();
		
		if (numero1 > numero2) {
			System.out.println("Numero 1 é maior");
		}
		else if (numero2 > numero1) {
			System.out.println("O segundo numero é maior");
		}
		else {
			System.out.println("São numeros iguais");
		}
		
	}

}
