import java.util.Scanner;

public class MedodosExercicio1 {
    
    public static double soma(double valorProduto, int quantidade) { 
        double iva = valorProduto + (valorProduto * 0.23); 
        return quantidade * iva;
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira o valor do produto");
        double valorProduto = teclado.nextInt();

        System.out.println("Insira a quantidade do produto");
        int quantidade = teclado.nextInt();

        double resultado = soma(valorProduto, quantidade); 
        
        System.out.println("O valor total com iva " + resultado); 

    }
    
}