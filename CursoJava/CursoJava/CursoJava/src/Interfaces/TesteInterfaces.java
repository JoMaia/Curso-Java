package Interfaces;

import Carro.Carro;
import poo.Pessoa;


public class TesteInterfaces {
	public static void main(String[] args) {
		movel[] objetosmoveis =new movel[3];
		
		objetosmoveis[0] = new Carro ("35-12-FL","Audi");
		objetosmoveis[1] = new Barco(2);
		objetosmoveis[2] = new Pessoa("Jo�o Gouveia","Rua dom loren�o de almada 1",910834068);
		
		for (int i = 0;i < objetosmoveis.length;++i) {
			objetosmoveis[i].mover();
			System.out.println("Velocidade ap�s mover :" + objetosmoveis[i].obterVelocidade());
		}
	}

}
