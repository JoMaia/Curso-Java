import java.util.Scanner;

public class Datas {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Intruduza o dia");
		int dialido = teclado.nextInt();
		System.out.println("Intruduza o mês");
		int meslido = teclado.nextInt();
		System.out.println("Intruduza o ano");
		int anolido = teclado.nextInt();
		
		String textoMes = "";
		
		if (meslido == 1) {
			textoMes = "Janeiro";
		}
		else if (meslido == 2) {
			textoMes = "Fevereiro";
		} else if (meslido == 3) {
			textoMes = "Março";
		} else if (meslido == 4) {
			textoMes = "Abril";
		} else if (meslido == 5) {
			textoMes = "Maio";
		} else if (meslido == 6) {
			textoMes = "Junho";
		} else if (meslido == 7) {
			textoMes = "Julho";
		} else if (meslido == 8) {
			textoMes = "Agosto";
		} else if (meslido == 9) {
			textoMes = "Setembro";
		} else if (meslido == 10) {
			textoMes = "outubro";
		} else if (meslido == 11) {
			textoMes = "Novembro";
		} else if (meslido == 12) {
			textoMes = "Dezembro";
		} else {
			textoMes = "Mês invalido";
		}
		
		System.out.println("A sua data de nascimento foi a " +
			dialido + " de " + textoMes + " de " + anolido);
	}

}
