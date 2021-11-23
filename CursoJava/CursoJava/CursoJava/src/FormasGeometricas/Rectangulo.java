package FormasGeometricas;

public class Rectangulo extends Forma {
	private double comprimento = 10;
	private double largura = 6;

	public Rectangulo(double comprimento, double largura) {
		super();
		this.comprimento = comprimento;
		this.largura = largura;
	}

	public Rectangulo() {

	}

	public void setAltura(double comprimento) {
		this.comprimento = comprimento;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return comprimento;
	}

	public double getLargura() {
		return largura;
	}

	public void chamadageometrica() {

	}

	public void mostrarNome() {
		System.out.println("Rectangulo");
	}

	public double area() {
		return largura * comprimento;
	}

	public double perimetro() {
		return (comprimento + largura) * 2;
	}

}
