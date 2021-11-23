import java.util.Scanner;

public class NestedIfs {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira um numero maior que zero");
		int numero = teclado.nextInt();
		
		if(numero < 100){
			if (numero > 50){
				System.out.println("O seu numero esta entre 50 e 100");
			}
			else {
				System.out.println("O seu numero esta entre 0 e 50");
			}
		}
		else {
			System.out.println("O seu numero é maior que 100");
		}
	}

}
