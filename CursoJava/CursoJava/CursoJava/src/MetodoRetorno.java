import java.util.Scanner;

public class MetodoRetorno {
	public static int soma(int oper1, int oper2) {
		int resultadofinal = oper1 + oper2;
		
		return resultadofinal;
	}

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Insira o Primeiro operando");
	int operando1 = teclado.nextInt();
	
	System.out.println("Insira o Segundo operando");
	int operando2 = teclado.nextInt();
	
	int resultado = soma(operando1,operando2);
	
	System.out.println("A soma entre " + operando1 + " e " + operando2 + " é " + resultado);
	
	}

}
