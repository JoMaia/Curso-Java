import java.util.Scanner;

public class CalcularIva {

	public static final double TAXA_IVA = 0.23;
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Itruduza o primeiro numero");
		int numero1 = teclado.nextInt();
		System.out.println("Itruduza o segundo numero");
		int numero2 = teclado.nextInt();
		
		double soma_com_iva = (numero1 + numero2)*(1 + TAXA_IVA);
		System.out.println("A soma dos dois numeros que intruduziu de iva é " + soma_com_iva);
		
	}
}
