package Carro;

public class Jipe extends Carro {
	private boolean tracaoligado;
	private boolean luzestejadilho;

	public Jipe(String matricula_carro, String marca_carro, String cor_carro, boolean luzestejadilho_carro) {
		super(matricula_carro, marca_carro, cor_carro);
		tracaoligado = false;
		luzestejadilho = luzestejadilho_carro;
	}

	/**
	 * Alterna o estado da tracao
	 */
	public void ligarDesligarTracao() {
		if (tracaoligado == true) {
			tracaoligado = false;
		} else {
			tracaoligado = true;
		}
	}

	/**
	 * Mostrar o estado corrente da tracao do jipe
	 */
	public void mostrarEstadoTracao() {
		System.out.println("Estado da tracao: " + (tracaoligado == true ? "ligada" : "Desligada"));
	}

	/**
	 * Mostrar os atributos do Jipe invocando o bloco de atributos comuns da classe
	 * base (Carro)
	 */
	public void mostrar() {
		System.out.println();
		System.out.println("Jipe:");
		super.mostrar();
		mostrarEstadoTracao();

		if (luzestejadilho == true) {
			System.out.println("Luzes de Tejadilho : Tem");
		} else {
			System.out.println("Luzes de Tejadilho : Não tem");
		}
	}

	/**
	 * acelera o carro no valor de 10km/h
	 */
	public void acelerar() {
		velocidade += 10 / CONVERSAO_METROS_SEGUNDO;
	}

}
