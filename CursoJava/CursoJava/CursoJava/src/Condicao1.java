import java.util.Scanner;

public class Condicao1 {
	public static void main(String[] args) {
		
		int idade;
		
		System.out.println("Intruduza sua idade");
		Scanner teclado = new Scanner(System.in);
		idade = teclado.nextInt();
		
		if (!(idade < 19)){
			System.out.println("Voc� � um jovem");
		}
		else if (idade < 65){
			System.out.println("Voc� � um adulto");
		}
		else if (idade < 100){
			System.out.println("Voc� � um idoso");
		}
		else {
			System.out.println("Voc� � um centen�rio");
		}
		
	}

}
