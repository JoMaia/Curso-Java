package formas;

public class TesteFormas {
	public static void main(String[] args) {
						
		Forma[] formas = new Forma[4];
		
		formas[0] = new Quadrado(5); //quadrado de 5 por 5
		formas[1] = new Rectangulo(6,10); //Rectangulo de largura 6 , comprimento 10
		formas[2] = new Triangulo(7,8); //Triangulo de base 3 e altura 8
		formas[3] = new Circulo(4); //Circulo de 4 de raio
		
		for(int i=0;i<4;++i){
			formas[i].mostrarNome();
			System.out.println("Area - " + formas[i].area());
			System.out.println("Perimetro - " + formas[i].perimetro());
			System.out.println(); //deixar uma linha em branco
		}
	}
}
