import java.util.Scanner;

public class ClassesExercicioCofre1 {

	public static void main(String[] args) {	
		Scanner teclado = new Scanner(System.in);
		
		int[] combinacao = new int[6];
		
		combinacao[0] = 5;
		combinacao[1] = 2;
		combinacao[2] = 9;
		combinacao[3] = 6;
		combinacao[4] = 3;
		combinacao[5] = 1;
				
		Cofre c = new Cofre(combinacao); //criar o objecto do tipo Cofre passando um array de inteiros que corresponde a combinacao
		
		// tentar combinacao diretamente no codigo Java
		c.inserirNumero(1);
		c.inserirNumero(3);
		c.inserirNumero(2);
		c.inserirNumero(8);
		c.inserirNumero(9);
		c.inserirNumero(1);
		
		c.tentarAbrir(); 
		c.mostrarEstado(); //deve mostrar cofre fechado, uma vez que os numeros inseridos nao correspondem a combinacao
		
		//segunda utilizacao do mesmo objecto cofre agora introduzindo a chave correcta
		c.cancelarAbertura();
				
		c.inserirNumero(5);
		c.inserirNumero(2);
		c.inserirNumero(9);
		c.inserirNumero(6);
		c.inserirNumero(3);
		c.inserirNumero(1);
		
		c.tentarAbrir(); 
		c.mostrarEstado(); //deve mostrar cofre aberto, uma vez que os numeros inseridos correspondem a combinacao
	}
}