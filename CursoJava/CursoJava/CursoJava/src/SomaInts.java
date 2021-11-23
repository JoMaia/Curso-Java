import java.util.Scanner;
public class SomaInts {
	
	public static void main(String[] args) 
	 {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduza o primeiro numero");
		int numero1 = teclado.nextInt();
		System.out.println("Introduza o segundo numero");
		int numero2 = teclado.nextInt();
		
		int soma = numero1 + numero2;
		System.out.println(numero1 + " + " + numero2 + " = " + soma);
	}
}