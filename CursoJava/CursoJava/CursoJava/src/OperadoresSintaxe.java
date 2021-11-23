import java.util.Scanner;

public class OperadoresSintaxe {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira um numero");
		
		int numero_lido = teclado.nextInt();
		System.out.println("Numero lido - " + numero_lido);
		
		int numero_incrementado = ++numero_lido;
		System.out.println("Numero Depois de incrementado - " + numero_lido + " | Numero com o valor do incremento - " + 
		numero_incrementado);	
			
	}

}
