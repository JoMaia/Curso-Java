import java.util.Scanner;

//classe para receber dois numeros escritos numericamente pelo utilizador
//e mostrar no ecra a correspondência a escrita em texto dos mesmos

public class MetodosExercicio2 {
		
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);	
		
		System.out.println("Insira o primeiro dia de trabalho da semana ( 0 - segunda a 7 - domingo ) ");
		int primeirodia = teclado.nextInt();
		
		String primeirodiatexto;
		
		//transformar o primeiro dia escrito numericamente em texto
		switch (primeirodia){
			case 0:	primeirodiatexto = "Segunda"; break;
			case 1:	primeirodiatexto = "Terça"; break;
			case 2:	primeirodiatexto = "Quarta"; break;
			case 3:	primeirodiatexto = "Quinta"; break;
			case 4:	primeirodiatexto = "Sexta"; break;
			case 5:	primeirodiatexto = "Sabado"; break;
			case 6:	primeirodiatexto = "Domingo"; break;
			default: primeirodiatexto = "Dia Invalido"; break;
		}
		
		System.out.println("Insira o segundo dia de trabalho da semana ( 0 - segunda a 7 - domingo ) ");
		int segundodia = teclado.nextInt();
		
		String segundodiatexto;
		
		//transformar o segundo dia escrito numericamente em texto
		switch (segundodia){
			case 0:	segundodiatexto = "Segunda"; break;
			case 1:	segundodiatexto = "Terça"; break;
			case 2:	segundodiatexto = "Quarta"; break;
			case 3:	segundodiatexto = "Quinta"; break;
			case 4:	segundodiatexto = "Sexta"; break;
			case 5:	segundodiatexto = "Sabado"; break;
			case 6:	segundodiatexto = "Domingo"; break;
			default: segundodiatexto = "Dia Invalido"; break;
		}
		
		System.out.println("Voçê trabalha de " + primeirodiatexto + " a " + segundodiatexto);
		
	}
}