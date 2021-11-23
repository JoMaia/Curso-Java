import java.util.Scanner;

public class CiclosArraysInversao {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Quantos numeros quer inserir ?");
		int quantidadenumeros = teclado.nextInt();
		
		int[] arraynumeros = new int[quantidadenumeros];
		
		for(int contador = 0; contador < quantidadenumeros; contador++) {
			System.out.println("Insira o " + (contador) + " numero");
			arraynumeros[contador] = teclado.nextInt();
			//leitura do numero intruduzido diretamente para o array
			//na posição contador
		}
		
		System.out.println("Os numeros de forma inversa:");
		
		for(int contador = quantidadenumeros - 1; contador >= 0; contador--) {
			System.out.println(arraynumeros[contador]);
		}
	}

}
