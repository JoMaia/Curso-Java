import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		try {
		System.out.println("Insira o primeiro numero");
		int num1 = teclado.nextInt();
		
		System.out.println("Insira a operação");
		char oper = teclado.next().charAt(0);
		
		System.out.println("Insira o segundo numero");
		int num2 = teclado.nextInt();
		
		double res=0;
		
		switch(oper) {
		case '+': res = num1 + num2; break;
		case '-': res = num1 + num2; break;
		case '*': res = num1 + num2; break;
		case '/': res = num1 + num2; break;
		}
		System.out.println("O resultado é -> " + res);
	}
		catch(InputMismatchException e) {
			System.out.println("Erro nos tipos dos dados introduzidos");
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			//System.out.println("Não pode dividir por zero");
		}
		catch(Exception e) {
			System.out.println("Ocorreu um erro inesperado no programa");
		}
	}	

}
