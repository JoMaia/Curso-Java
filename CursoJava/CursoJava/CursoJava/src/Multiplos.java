import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	System.out.println("Insira um numero");
	
	int numero_lido = teclado.nextInt();
	int resto = numero_lido % 7;
	
	if(resto == 0) {
		System.out.println("O numero � multiplo de 7");	
	}
	else {
		System.out.println("O numero n�o � multiplo de 7");
		}
	
	}

}
