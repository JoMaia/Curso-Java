import java.util.Scanner;

public class ControledeFluxoll1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduza um numero de 0 a 6");
		int dialido = teclado.nextInt();
		
		String textoDia = "";
		
		switch (dialido){
	case 0: textoDia = "Domingo"; break;
	case 1: textoDia = "Segunda"; break;
	case 2: textoDia = "terça"; break;
	case 3: textoDia = "Quarta"; break;
	case 4: textoDia = "Quinta"; break;
	case 5: textoDia = "Sexta"; break;
	case 6: textoDia = "Sábado"; break;
	default : textoDia = "Dia invalido";
	
		}
	
		System.out.println("O dia da semana é " +
				textoDia);
		
	}

}
