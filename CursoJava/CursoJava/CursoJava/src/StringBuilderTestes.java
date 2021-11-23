import java.util.Scanner;

public class StringBuilderTestes {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira uma Frase");
		StringBuilder texto = new StringBuilder(teclado.nextLine());
		
		System.out.println("A sua frase ao contrario - " + texto.reverse());
		texto.reverse(); //reverse ao modo normal
		
		System.out.println("Escreva uma palavra para juntar ao fim da frase");
		
		String palavra = teclado.nextLine();
		
		//junta  a string palavra ao fim do texto do stringbuilder
		texto.append("" + palavra);
		System.out.println("A sua frase com palavra no fim - " + texto);
		
		//transformar o primeiro caratere em maiusculo
		char caratereMaiusculo = Character.toUpperCase(texto.charAt(0));
		texto.setCharAt(0, caratereMaiusculo);
		
		for(int i = 1; i < texto.length();++i) {
			if(texto.charAt(i-1) == ' ') {
				//se o caratere atrás do corrente e um espaço
				//transforma o carater corrente em maiusculo
				caratereMaiusculo = Character.toUpperCase(texto.charAt(i));
				texto.setCharAt(i,caratereMaiusculo);
			}
		}
		
	}

}
