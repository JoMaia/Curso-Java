import java.util.Scanner;

public class ComparacoesStrings {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Insira o nome do seu pais em minusculas");
		String pais = teclado.nextLine();

			if (pais.equals("portugal")) {
				System.out.println("O seu pais tem 89015km2");
				
			} 
			else if(pais.equals("espanha")){
				System.out.println("O seu pais tem 505954km2");
			}
			else if(pais.equals("inglaterra")){
				System.out.println("O seu pais tem 244820km2");
			}
			else{
				System.out.println("Pais desconhecido...");
			}
		}


	}

