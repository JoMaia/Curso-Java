import java.util.Scanner;

public class CiclosArrays2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Quantos numeros quer inserir ?");
		int numeros = teclado.nextInt();
		
		int[] valor = new int[numeros];
		int repetidos = 0;
		
		
		for(int contador = 0; contador < numeros; contador++) {
			System.out.println("Insira o " + (contador+1) + "º valor");
			valor[contador] = teclado.nextInt();
			
		}
		System.out.println("Insira um numero!");
		int numeros1 = teclado.nextInt();
			
		for(int contador = 0; contador < numeros; contador++) {
			if (valor[contador] == numeros1) {
				repetidos++;
				
			}
			
			
		}
		System.out.println("O elemento repetese " + repetidos +" vez");
		
	}

}
