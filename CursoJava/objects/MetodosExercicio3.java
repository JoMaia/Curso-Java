import java.util.Scanner;

//classe que escreve um determinado numero de vezes no ecrã uma determinada palavra
//Esta tem este procedimento três vezes
public class MetodosExercicio3 {
	public static void main(String[] args) {	
		
		Scanner teclado = new Scanner(System.in);	
		
		System.out.println("Insira quantas vezes quer repetir a primeira palavra");
		int vezes1 = teclado.nextInt();
		
		System.out.println("Insira a palavra a repetir");
		String texto1 = teclado.next();
		
		//ciclo que executa o numero de vezes introduzido pelo utilizador (vezes1)
		for (int contador = 0; contador < vezes1 ; contador++ ){
			System.out.println(texto1);
		}
		
		
		System.out.println("Insira quantas vezes quer repetir a segunda palavra");
		int vezes2 = teclado.nextInt();
		
		System.out.println("Insira a palavra a repetir");
		String texto2 = teclado.next();
		
		//ciclo que executa o numero de vezes introduzido pelo utilizador (vezes2)
		for (int contador = 0; contador < vezes2 ; contador++ ){
			System.out.println(texto2);
		}
		
		
		System.out.println("Insira quantas vezes quer repetir a terceira palavra");
		int vezes3 = teclado.nextInt();
		
		System.out.println("Insira a palavra a repetir");
		String texto3 = teclado.next();
		
		//ciclo que executa o numero de vezes introduzido pelo utilizador (vezes3)
		for (int contador = 0; contador < vezes3 ; contador++ ){
			System.out.println(texto3);
		}
	}
}
