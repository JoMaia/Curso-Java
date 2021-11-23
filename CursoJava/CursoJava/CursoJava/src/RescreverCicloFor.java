import java.util.Scanner;

public class RescreverCicloFor {

	public static void main(String[] args) {
		
		Scanner teclado = new  Scanner(System.in);
		
		System.out.println("Insira o numero de vezes que quer executar");
		int maximo = teclado.nextInt();
		
		for (int contador = 0; contador < maximo; contador++) {
			System.out.println("Valor atual " + contador);
		}
		
	}

}
