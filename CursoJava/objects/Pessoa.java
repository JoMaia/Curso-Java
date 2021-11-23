package poo;
public class Pessoa {
	public long telefone;
	public String nome, morada;
	
	/**
	 * Parte a string recebida por espaços e devolve apenas o primeiro e ultimo nome
	 * @return String que representa o primeiro e ultimo nome
	 */
	public String primeiroUltimoNome(){
		String[] nomes = nome.split(" "); //dividir o nome pelos espacos guardando num array de Strings 
		return nomes[0] + " " + nomes[nomes.length-1]; //retornar o primeiro seguido de espaço seguido do ultimo
	}		
}
