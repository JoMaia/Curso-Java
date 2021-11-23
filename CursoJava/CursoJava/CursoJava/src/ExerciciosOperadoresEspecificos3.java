import java.util.Scanner;

public class ExerciciosOperadoresEspecificos3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira um numero");
		int numero_lido = teclado.nextInt();

		boolean primo = true;
		for (int contador = 2; contador < numero_lido; contador++) {  
		   if (numero_lido % contador == 0) { 
		      primo  = false; 
		   }
		}
		if (primo) { 
			System.out.println("O Numero " + numero_lido + " é primo!");

		} else { 
			System.out.println("Não é primo!");
		}
	}
	
		
	}