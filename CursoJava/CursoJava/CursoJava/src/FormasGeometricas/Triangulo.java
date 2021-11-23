package FormasGeometricas;

public class Triangulo extends Forma {
	double base;
	double altura;

	public double getBase() {
		return base = 3;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura = 8;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Triangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public void chamadageometrica() {

	}

	public void mostrarNome() {
		System.out.println("Triângulo");

	}

	@Override
	public double area() {
		return base * altura / 2;
	}

	@Override
	public double perimetro() {
		return base + (altura + altura);
	}

}
