import java.util.Scanner;

public class ExercicioCostantes {
	
	public static final double TAXA_IVA = 0.23;
	public static final double TAXA_IRC = 0.35;

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Itruduza o primeiro valor");
		int numero1 = teclado.nextInt();
		System.out.println("Itruduza o segundo valor");
		int numero2 = teclado.nextInt();
		System.out.println("Itruduza o terceiro valor");
		int numero3 = teclado.nextInt();
		System.out.println("Itruduza o quarto valor");
		int numero4 = teclado.nextInt();
		System.out.println("Itruduza o quinto valor");
		int numero5 = teclado.nextInt();
		
		int[] valor = new int[5];
		
		valor[0] = (numero1);
		valor[1] = (numero2);
		valor[2] = (numero3);
		valor[3] = (numero4);
		valor[4] = (numero5);
		
		System.out.println("Valor 1 mais iva e irc - " + (valor[0])*(1 + TAXA_IVA + TAXA_IRC));
		System.out.println("Valor 1 mais iva e irc - " + (valor[1])*(1 + TAXA_IVA + TAXA_IRC));
		System.out.println("Valor 1 mais iva e irc - " + (valor[2])*(1 + TAXA_IVA + TAXA_IRC));
		System.out.println("Valor 1 mais iva e irc - " + (valor[3])*(1 + TAXA_IVA + TAXA_IRC));
		System.out.println("Valor 1 mais iva e irc - " + (valor[4])*(1 + TAXA_IVA + TAXA_IRC));
	}

}
