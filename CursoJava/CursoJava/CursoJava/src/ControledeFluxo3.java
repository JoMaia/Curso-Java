import java.util.Scanner;

public class ControledeFluxo3 {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		System.out.println("Intruduza um numero");
		int numero = teclado.nextInt();
		
		if(numero == 0) {
		System.out.println("Zero");
		}
		else if (numero < 0){
			System.out.println("Negativo");
		}
		
		else if (numero > 0){
			System.out.println("Positivo");
		}
			
	}
		
}

