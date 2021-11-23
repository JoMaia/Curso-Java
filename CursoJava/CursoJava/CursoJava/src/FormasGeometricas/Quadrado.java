package FormasGeometricas;

public class Quadrado extends Forma {
	private double lado;

	public Quadrado(double valor) {
		this.lado = valor;
	}

	public double calcularArea() {
		return lado * lado;
	}

	public double calcularPerimetro() {
		return lado * 5;
	}

	public void chamadageometrica() {

	}

	public void mostrarNome() {
		System.out.println("Quadrado");
	}

	public double area() {
		return lado * lado;
	}

	public double perimetro() {
		return (lado * 2) + (lado * 2);
	}

}
