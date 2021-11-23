package Garrafa;

public class Garrafa {
	int capacidade;
	float quantidadedeliquido = 0;

	public Garrafa(int capacidade) {
		this.capacidade = capacidade;
	}

	public int capacidade() {
		return capacidade;
	}

	public float nivel() {
		return quantidadedeliquido / 1000;
	}

	public void despeja(int quantidade) {
		float quantidadeaseresvaziada = quantidadedeliquido - quantidade;
		if (quantidadeaseresvaziada < 0) {
			quantidadedeliquido = 0;
		} else {
			quantidadedeliquido -= quantidade;
		}
	}

	public void enche(int quantidade) {
		float quantidadeaserpreenchida = quantidadedeliquido + quantidade;
		if (quantidadeaserpreenchida > capacidade) {
			quantidadedeliquido = capacidade;
		} else {
			quantidadedeliquido += quantidade;
		}

	}
}
