package Interfaces;

public class Barco implements movel{
	private int velocidade_corrente, numvelas;
	private boolean motorLigado;
	
	public Barco(int numvelasbarco) {
		numvelas = numvelasbarco;
		velocidade_corrente = 0;
		motorLigado = false;
	}
	public void ligarMotor() {
		motorLigado = true;
	}
	public void desligarMotor() {
		motorLigado = false;
	}
	/**
	 * Aumenta a velocidade do barco em 5km/h
	 */
	public void mover() {


	}
	public int obterVelocidade() {
		return velocidade_corrente;
	}
	/**
	 * Mostrar as informacoes do barco
	 */
	public void mostrar() {
		System.out.println("");
		System.out.println("Barco: ");
		System.out.println("Numero de velas -> " + numvelas);
		System.out.println("Estado do motor -> " +
		((motorLigado == true)? "ligado":"desligado"));
		System.out.println("Velocidade -> " + velocidade_corrente);
	}
}
