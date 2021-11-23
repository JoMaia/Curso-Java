import java.util.Scanner;

public class CiclosArrays1 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
		int[] alunos = new int[2];
		int[] notas1 = new int[2];
		int[] notas2 = new int[2];
		int[] media = new int[2];
		 
		
		 for(int contador = 0; contador < alunos.length; contador++){
		 System.out.println("Insira a nota do " + (contador+1) + "° aluno.");
		 notas1[contador] = input.nextInt();
		 
		 }
		 
		 System.out.println("...");
		 System.out.println("Segundo teste.");
		 System.out.println("...");
		 
		 for(int contador = 0; contador < alunos.length; contador++){
			 System.out.println("Insira a nota do " + (contador+1) + "° aluno.");
			 notas2[contador] = input.nextInt();
			
			 }
			
		 for(int contador = 0; contador < alunos.length; contador++) {
			media[contador] = (notas1[contador] + notas2[contador]) / 2;
		
				}
		 for(int contador = 0; contador < alunos.length; contador++) {
			System.out.println("A media final é " + media[contador]); 
		 }
		 
	}
}