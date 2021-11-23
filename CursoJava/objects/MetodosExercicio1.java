import java.util.Scanner;

//classe que recebe o um preco de um produto e uma quantidade e que
//considerando uma taxa de iva a 23% devolve o valor final desta compra
//O calculo final corresponde ao calculo normal de uma loja => Quantidade x Preco  aplicando 23% sobre o ultimo resultado
public class MetodosExercicio1 {
	public static final double TAXA_IVA = 0.23;
		
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);	
		
		System.out.println("Insira o preço do produto");
		double preco = teclado.nextDouble();				
		
		System.out.println("Insira a quantidade que pretende levar deste produto");
		int quantidade = teclado.nextInt();
		
		double precofinal = preco * quantidade * (1+TAXA_IVA); 
		
		System.out.println("O preço final do produto com iva é " + precofinal + "€");
	}
}