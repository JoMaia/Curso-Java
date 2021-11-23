
public class TesteCofre {

	public static void main(String[] args) {
		Cofre c1 = new Cofre(new int[]{4,2,1,4,5});
		c1.mostrarEstado(); // Fechado
		System.out.println(c1.numerosInseridos()); // 0
		c1.inserirNumero(3);
		c1.inserirNumero(2);
		c1.inserirNumero(1);
		c1.inserirNumero(4);
		c1.inserirNumero(5);
		System.out.println(c1.numerosInseridos()); // 5
		c1.inserirNumero(6);
		c1.inserirNumero(7);
		System.out.println(c1.numerosInseridos()); // 7
		c1.inserirNumero(1);
		c1.inserirNumero(4);
		c1.inserirNumero(5);
		c1.inserirNumero(4);
		c1.inserirNumero(2);
		System.out.println(c1.numerosInseridos()); // 12
		System.out.println(c1.tentarAbrir()); // True
		c1.mostrarEstado(); // Aberto
		System.out.println(c1.numerosInseridos()); // 0
		
		
		Cofre c2 = new Cofre(new int[]{1,2,2,4,5});
		c2.inserirNumero(4);
		c2.inserirNumero(5);
		System.out.println(c2.numerosInseridos()); // 2
		c2.cancelarAbertura();
		System.out.println(c2.numerosInseridos()); // 0
		c2.inserirNumero(1);
		c2.inserirNumero(2);
		c2.inserirNumero(2);
		c2.inserirNumero(4);
		c2.inserirNumero(5);
		System.out.println(c2.numerosInseridos()); // 5
		System.out.println(c2.tentarAbrir()); // True
		c2.mostrarEstado(); // Aberto
		System.out.println(c2.numerosInseridos()); // 0
	}
}
