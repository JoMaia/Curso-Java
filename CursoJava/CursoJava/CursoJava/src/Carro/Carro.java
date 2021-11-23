package Carro;

import Interfaces.movel;

public class Carro implements movel {
	protected String marca, matricula;
	protected double velocidade;
	protected String cor;
	protected static int numero_rodas = 4;

	protected static final double CONVERSAO_METROS_SEGUNDO = 3.6;

	public void travar() {
		velocidade = 0;
	}

	public void acelerar() {
		velocidade += 10 / CONVERSAO_METROS_SEGUNDO;
	}

	public void mostrar() {
		System.out.println();
		System.out.println("Marca -> " + marca);
		System.out.println("cor -> " + cor);
		System.out.println("Matricula -> " + matricula);
		System.out.println("Velocidade -> " + (int) (velocidade * CONVERSAO_METROS_SEGUNDO));
		// conversao para km/h
	}

	public Carro(String matricula_carro, String marca_carro, int velocidade_carro) {
		marca = marca_carro;
		matricula = matricula_carro;
		velocidade = velocidade_carro / CONVERSAO_METROS_SEGUNDO;

	}

	public void atribuirVelocidade(int velocidade_recebida) {
		if ((velocidade_recebida >= 0) && (velocidade_recebida <= 50)) {
			// apenas atribuir se a velocidade estiver entre 0 e 50
			velocidade = velocidade_recebida / CONVERSAO_METROS_SEGUNDO;
		}
	}

	public int obterVelocidade() {
		return (int) (velocidade * CONVERSAO_METROS_SEGUNDO);
	}

	/**
	 * Define uma nova cor para o carro
	 * 
	 * @param novacor o nome da cor para o carro
	 */
	public void atribuirCor(String novacor) {
		cor = novacor;
	}

	/**
	 * obtem a cor corrente do carro
	 * 
	 * @return String que representa a cor
	 */
	public String obterCor() {
		return cor;
	}

	/**
	 * Obtem o numero de rodas de um carro
	 * 
	 * @return numero de rodas
	 */
	public static int obterNumeroRodas() {
		return numero_rodas;
	}

	/**
	 * acelera o carro com o valor recebido como parametro desde que esse seja
	 * inferior a 50km/h E tambem feita a conversao para m/s para representacao
	 * interna
	 * 
	 * @param factor o valor que ira acelarar a velocidade
	 */
	public void acelerar(int factor) {
		if (factor < 50) {
			// defenir um valor maximo de acelaracao
			velocidade += factor / CONVERSAO_METROS_SEGUNDO;
		}
	}

	/**
	 * Criar um novo objeto carro sem especificar velocidade, inicializando-a com o
	 * valor 0
	 * 
	 * @param matricula_carro matricula do carro
	 * @param marca_carro     marca do carro
	 */
	public Carro(String matricula_carro, String marca_carro) {
		marca = marca_carro;
		matricula = matricula_carro;
		velocidade = 0;

	}

	public Carro(String matricula_carro, String marca_carro, String cor_carro) {
		marca = marca_carro;
		matricula = matricula_carro;
		velocidade = 0;
		cor = cor_carro;
	}

	/**
	 * Faz o carro mover-se, aumentando a sua velocidade corrente
	 */
	public void mover() {
		acelerar(); // chamada ao acelerar sem parametros que aumenta 10km/h
	}

}
