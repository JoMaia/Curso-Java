import java.util.Scanner;

public class DataSwitch {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduza o dia");
		int dialido = teclado.nextInt();
		System.out.println("Intruduza o mês");
		int meslido = teclado.nextInt();
		System.out.println("Intruduza o ano");
		int anolido = teclado.nextInt();
		
		String textoMes = "";
		
		switch (meslido){
			case 1: textoMes = "Janeiro"; break;
			case 2: textoMes = "Fevereiro"; break;
			case 3: textoMes = "Março"; break;
			case 4: textoMes = "Abril"; break;
			case 5: textoMes = "Maio"; break;
			case 6: textoMes = "Junho"; break;
			case 7: textoMes = "Julho"; break;
			case 8: textoMes = "Agosto"; break;
			case 9: textoMes = "Setembro"; break;
			case 10: textoMes = "Outubro"; break;
			case 11: textoMes = "Novembro"; break;
			case 12: textoMes = "Dezembro"; break;
			default : textoMes = "Mês invalido";
		}
		
		System.out.println("A sua data de nascimento foi a " +
				dialido + " de " + textoMes + " de " + anolido);
			
	}

}
