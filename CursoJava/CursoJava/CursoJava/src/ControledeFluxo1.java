import java.util.Scanner;

public class ControledeFluxo1 {

	public static void main(String[] args) {
		
		int avaliacao;
		
		System.out.println("Intruduza sua avalia��o");
		Scanner teclado = new Scanner(System.in);
		avaliacao = teclado.nextInt();
		
		if (avaliacao < 10){
			System.out.println("Voc� chumbou");
		}
		
		else if (avaliacao < 20){
			System.out.println("Voc� passou");
		}
		
	}

}