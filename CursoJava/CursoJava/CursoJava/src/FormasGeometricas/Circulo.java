package FormasGeometricas;

public class Circulo extends Forma {

	private double raio = 4;
	final private double pi = 3.14;

	public Circulo(double raio) {
		this.raio = raio;
	}

	public void chamadageometrica() {

	}

	public void mostrarNome() {
		System.out.println("Circulo");
	}

	public double area() {
		return (raio * raio) * pi;
	}

	public double perimetro() {
		return 6.28 * raio;
	}

}
