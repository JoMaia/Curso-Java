
public class CiclosArrays {

	public static void main(String[] args) {
		int[] arraynumeros = new int[300];
		
		//mostrar array
		for(int contador = 0; contador < 300; contador++) {
			arraynumeros[contador] = contador;
			}
		//transformar o array no seu dobro
		for(int contador = 0; contador < 300; contador++) {
			arraynumeros[contador] = arraynumeros[contador]*2;
			}
		
		for(int contador = 0; contador < 300; contador++) {
			arraynumeros[contador] = contador;
			}
		
		//mostrar array
		for(int contador = 0; contador < 300; contador++) {
			System.out.println(arraynumeros[contador]);
		}
	
	}

}
