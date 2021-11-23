import java.util.Scanner;

public class ControledeFluxoll3 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Quantas disciplinas deseja calcular?");
		int quantidade_numeros = teclado.nextInt();
		int soma = 0;
		
		
		for (int contador = 0;contador<quantidade_numeros;contador++) {
			System.out.println("Insira a " + (contador + 1) + "º nota para somar a Media final");
			int numero_lido = teclado.nextInt();
			soma=soma + numero_lido; 
		}
		
		System.out.println("A média final é " + soma / quantidade_numeros);
		
	}


}
