package Carro;

public class Descapotavel extends Carro {

	public Descapotavel(String matricula_carro, String marca_carro, String cor_carro) {
		super(matricula_carro, marca_carro, cor_carro);
	}

	private boolean estadoCapota;

	/**
	 * Metodo que altera o estado da capota
	 */
	public void abrirFecharCapota() {
		if (estadoCapota == false) {
			estadoCapota = true;
		} else {
			estadoCapota = false;
		}

		/*
		 * A mesma logica feita num operador ternario seria: estadoCapota =
		 * (estadoCapota == true? False : true);
		 */
	}

	/**
	 * Mostrar o estado corrente da capota
	 */
	public void mostrarEstadoCapota() {
		if (estadoCapota == true) {
			System.out.println("Estado da capota : aberta");
		} else {
			System.out.println("Estado da capota : fechada");
		}
	}

	public void mostrar() {
		System.out.println();
		System.out.println("Descapotavel:");
		super.mostrar();
		mostrarEstadoCapota();
	}

	/**
	 * acelera o carro no valor de 20km/h
	 */
	public void acelerar() {
		velocidade += 20 / CONVERSAO_METROS_SEGUNDO;
	}
}
