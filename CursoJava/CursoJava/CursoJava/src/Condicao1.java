import java.util.Scanner;

public class Condicao1 {
	public static void main(String[] args) {
		
		int idade;
		
		System.out.println("Intruduza sua idade");
		Scanner teclado = new Scanner(System.in);
		idade = teclado.nextInt();
		
		if (!(idade < 19)){
			System.out.println("Você é um jovem");
		}
		else if (idade < 65){
			System.out.println("Você é um adulto");
		}
		else if (idade < 100){
			System.out.println("Você é um idoso");
		}
		else {
			System.out.println("Você é um centenário");
		}
		
	}

}
