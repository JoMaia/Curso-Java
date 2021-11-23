import java.util.Scanner;

public class QuebraCiclos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int contador = 0;
		
		while(contador < 10) {
			System.out.println("Insira um numero");
			int numero = teclado.nextInt();
			
			if(numero > 100) {
				break;
			}
			
			contador++;
		 }
		
		System.out.println("Instrução continue:");
		contador = 0;
		
		while(contador < 10) {
			
			System.out.println("Insira um numero");
			int numero = teclado.nextInt();
			
			if(numero > 100) {
				continue;
			}
			
			contador++;
			System.out.println("O numero inserido foi " + numero);
		}
			
		System.out.println("Fim do Programa");
	
	}
}
