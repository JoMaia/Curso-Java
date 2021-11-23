import java.util.Scanner;

public class ClassesExercicioCofre2 {
	public static final int TAMANHO = 4;
	
	public static void main(String[] args) {	
		Scanner teclado = new Scanner(System.in);
		
		int[] combinacao = new int[TAMANHO];
		
		combinacao[0] = 5;
		combinacao[1] = 2;
		combinacao[2] = 9;
		combinacao[3] = 6;
				
		Cofre c = new Cofre(combinacao); //criar o objecto do tipo cofre passando um array de inteiros que corresponde a combinacao
		
		int contador = 0;
		boolean cancelado =false;
		
		while (contador<TAMANHO && cancelado==false){
			System.out.println("Insira o " + (contador + 1) + " numero da combinacao ou -1 se pretender cancelar a tentativa");
			int tentativa = teclado.nextInt();
			
			if(tentativa == -1){ //cancelamento da tentativa
				c.cancelarAbertura();
				cancelado = true;
				System.out.println("Cancelou a tentativa de a abertura do cofre");
			}
			else { //caso nao seja feito o cancelamento inserir o numero no cofre
				c.inserirNumero(tentativa);
				
				contador++;	 //incrementar o numero de tentativas
				System.out.println("Ja introduziu " + c.numerosTentativa() + " numero(s) para esta tentativa");
			}			
		}
		
		if(cancelado==false){
			boolean abriu = c.tentarAbrir(); //tentar abrir e capturar o valor se abriu ou nao
			
			if(abriu==true){
				System.out.println("Parabens conseguiu abrir!");
			}
			else {
				System.out.println("Combinacao incorrecta!");
			}
			
			c.mostrarEstado();
		}
		
		System.out.println("Programa terminado ...");
				
	}
}
