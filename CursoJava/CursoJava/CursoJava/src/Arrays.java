
public class Arrays {

	public static void main(String[] args) {
		
		String[] listaDeStrings = new String[3];
		
		listaDeStrings[0] = "Primeira posicao do array";
		listaDeStrings[1] = "Segunda posicao do array";
		listaDeStrings[2] = "Terceira posicao do array";
		
		System.out.println(listaDeStrings[0]);
		System.out.println(listaDeStrings[1]);
		System.out.println(listaDeStrings[2]);
		
		int[] saldos = new int[3];
		
		saldos[0]= 500;
		saldos[1]= 350;
		saldos[2]= 430;
		
		System.out.println("Posicao 0 mais a posicao 1 - " + (saldos[0] + saldos[1]));
		System.out.println("Posicao 0 menos a posicao 2 - " + (saldos[0] + saldos[2]));
		System.out.println("tamanho do array saldos - " + saldos.length);
		
	
	} // main

} //Arrays
