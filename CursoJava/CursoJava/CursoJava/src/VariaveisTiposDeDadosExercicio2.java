import java.util.Scanner;
public class VariaveisTiposDeDadosExercicio2 {

	public static void main(String[] args) throws java.io.IOException {
		System.out.println("Introduza um numero e prima Enter");
		Scanner teclado = new Scanner(System.in);
		
		int raio = teclado.nextInt();
		System.out.println("...");
		
		double pi = 3.14;
		double area = (raio * raio) * pi; 
		
		System.out.println("Resultado da area " + area);
		
	}

}
