import java.util.Scanner;

public class rescreverCicloFor2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Quantos numeros deseja somar?");
		int quantidade_numeros = teclado.nextInt();
		int soma = 0;
		
		for (int contador = 0;contador<quantidade_numeros;contador++) {
			System.out.println("Insira o " + (contador + 1) + "º numero para somar");
			int numero_lido = teclado.nextInt();
			soma=soma + numero_lido;
		}
		
		System.out.println("A soma de todos os numeros que intruduzio é " + soma);
	}

}
