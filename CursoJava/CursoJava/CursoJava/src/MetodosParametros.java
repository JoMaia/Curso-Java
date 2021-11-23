import java.util.Scanner;

public class MetodosParametros {
	public static void soma(int oper1, int oper2, int resultado ) {
		resultado = oper1 + oper2;
	}

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Insira o Primeiro operando");
		int operando1 = teclado.nextInt();
		
		System.out.println("Insira o Segundo operando");
		int operando2 = teclado.nextInt();
		
		int res = 0;
		
		soma(operando1,operando2, res );
		
		System.out.println("O resultado da soma dos dois numeros e " + res);
		
	}

}
