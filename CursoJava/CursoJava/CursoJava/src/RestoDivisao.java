import java.util.Scanner;

public class RestoDivisao {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	System.out.println("Insira um numero");
	
	int numero_lido = teclado.nextInt();
	
	//obter o resto da divis�o do numero por 2
	int resto = numero_lido % 2;
	
	if(resto == 0) {
		System.out.println("O numero que introduziu � par");
	}
	else {
		// se o numero n�o � par tem obrigatoriamente que ser impar
		System.out.println("O numero que introduziu � impar");
	}
	}

}
