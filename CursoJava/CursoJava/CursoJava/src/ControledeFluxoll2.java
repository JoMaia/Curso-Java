import java.util.Scanner;

public class ControledeFluxoll2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);        
			        
			int num1;
			int num2;
			       
			System.out.print("Digite o primeiro n�mero: ");
			num1 = entrada.nextInt();
			
			System.out.print("Digite o segundo n�mero: ");
			num2 = entrada.nextInt();
			
			int soma = 0;
			
			for (int contador = 0; contador < num2; contador++) {
				soma = soma + num1;
				}
			
			System.out.println("a multiplica��o � " + soma);
			}

		}
