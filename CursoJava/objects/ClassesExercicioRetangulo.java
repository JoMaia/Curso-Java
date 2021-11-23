public class ClassesExercicioRetangulo {
	public static void main(String[] args) {
		Rectangulo rec = new Rectangulo(6,5);

		System.out.println("Informacoes do Rectangulo: ");
		rec.mostrar();
		
		System.out.println("Perimetro do rectangulo: " + rec.perimetro());
		System.out.println("Area do rectangulo: " + rec.area());				
	}
}
