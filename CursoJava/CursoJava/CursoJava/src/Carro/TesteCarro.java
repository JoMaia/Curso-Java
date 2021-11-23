package Carro;

public class TesteCarro {

	public static void main(String[] args) {
		Carro carro1 = new Carro("35-12-FL", "Audi", 50);
		Carro carro2 = new Carro("82-49-RM", "Citroen", 35);
		Carro carro3 = new Carro("73-59-AP", "Mercedes", 75);

		carro1.atribuirCor("verde");
		System.out.println("Nova cor do carro1 - " + carro1.obterCor());
		carro1.atribuirVelocidade(30);
		carro1.mostrar();
		carro2.mostrar();
		carro3.mostrar();
		Carro carro4 = new Carro("61-44-ZA", "Renault");
		carro4.mostrar();
		Carro carro5 = new Carro("47-12-OF", "Opel", "Verde");
		carro5.mostrar();

		System.out.println("Numero de rodas de um Carro " + Carro.obterNumeroRodas());

		carro1.acelerar();
		System.out.println("Nova velocidade do carro1 " + carro1.obterVelocidade());
		carro1.acelerar();
		System.out.println("Nova velocidade do carro1 " + carro1.obterVelocidade());

		carro1.acelerar(30);
		System.out.println("Nova velocidade do carro1 " + carro1.obterVelocidade());

		Carro desc1 = new Descapotavel("74-83-KY", "Mazda", "Azul");
		desc1.mostrar();

		Carro jipe1 = new Jipe("59-12-TK", "Land Rover", "Castanho", true);
		jipe1.mostrar();

		Carro[] carros = new Carro[6];

		carros[0] = carro1;
		carros[1] = carro2;
		carros[2] = carro3;
		carros[3] = carro4;
		carros[4] = desc1;
		carros[5] = jipe1;

		for (int i = 0; i < 6; ++i) {
			System.out.println(carros[i].obterVelocidade());
		}

		System.out.println("Carros depois de serem acelerados:");

		for (int i = 0; i < 6; ++i) {
			carros[i].acelerar();
			System.out.println(carros[i].obterVelocidade());
		}

	}

}
