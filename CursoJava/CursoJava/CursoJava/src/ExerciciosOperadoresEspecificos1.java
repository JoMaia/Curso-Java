import java.util.Scanner;

public class ExerciciosOperadoresEspecificos1 {

	public static void main(String[] args) {
		
	int maior = 100;
	int menor = 0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira um numero");
		int numero_lido = teclado.nextInt();
		
		if(numero_lido > 0 && numero_lido < 100) {
			System.out.println("Verdadeiro");
		}else {
			System.out.println("Falso");
		}
		
	}
	
	

}
