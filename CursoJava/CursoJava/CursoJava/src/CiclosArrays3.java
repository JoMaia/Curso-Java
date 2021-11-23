import java.util.Scanner;

public class CiclosArrays3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] conjunto1 = new int[5];
		int[] conjunto2 = new int[5];
		
		for(int contador = 0; contador < conjunto1.length; contador++) {
			System.out.println("Insira o " + (contador+1) + "º numero");
			conjunto1[contador] = input.nextInt();	}
		
		{	
			 System.out.println("...");
			 System.out.println("Segundo Conjunto.");
			 System.out.println("...");
				
			}
		
		for(int contador = 0; contador < conjunto2.length; contador++) {
			System.out.println("Insira o " + (contador+1) + "º numero");
			conjunto2[contador] = input.nextInt();
			
			}
		boolean igual = true;

		for(int contador = 0; contador < 5; contador++) {
			if (conjunto1[contador] != conjunto2[contador]) {
				igual = false;
				break;
			}
		}

		if (igual) {
			System.out.println("Os conjuntos são iguais!");
		} else {
			System.out.println("Os conjuntos são diferentes!");
		}
		
	}

}
