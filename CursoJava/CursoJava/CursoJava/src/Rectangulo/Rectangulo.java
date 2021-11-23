package Rectangulo;

public class Rectangulo {
	int largura, comprimento;

	public Rectangulo(int largura, int comprimento) {
		this.largura = largura;
		this.comprimento = comprimento;
	}

	public int perimetro() {
		return (largura + comprimento) * 2;
	}

	public int area() {
		return largura * comprimento;
	}

	public void mostrar() {
		System.out.println("Largura: " + largura);
		System.out.println("comprimento: " + comprimento);
	}

}
