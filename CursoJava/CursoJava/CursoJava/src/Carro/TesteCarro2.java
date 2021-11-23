package Carro;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteCarro2 {
	public static void listarCarros(ArrayList<Carro> lista) {
		System.out.println("Lista de Carros");

		for (int i = 0; i < lista.size(); ++i) {
			Carro carrocorrente = lista.get(i);
			carrocorrente.mostrar();
		}
	}

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int opcao = 0;
		ArrayList<Carro> lista = new ArrayList<Carro>();

		while (opcao != 3) {
			System.out.println("\n1 - Inserir Carro");
			System.out.println("2 - Listar Carros");
			System.out.println("3 - Remover Carros");
			System.out.println("4 - Sair");

			opcao = teclado.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Escolha o tipo de Carro que pretende inserir");
				System.out.println("1 - Jipe");
				System.out.println("2 - Descapotavel");
				int tipocarro = teclado.nextInt();

				teclado.nextLine();

				System.out.println("Insira a marca");
				String marca = teclado.nextLine();

				System.out.println("Insira a matricula");
				String matricula = teclado.nextLine();

				System.out.println("Insira a cor");
				String cor = teclado.nextLine();

				if (tipocarro == 1) {
					lista.add(new Jipe(matricula, marca, cor, false));
				} else if (tipocarro == 2) {
					lista.add(new Descapotavel(matricula, marca, cor));
				}
				break;
			case 2:
				listarCarros(lista);
				break;

			case 3:
				System.out.println("Insira o numero do carro a apagar");
				int carroapagar = teclado.nextInt() - 1;

				if ((carroapagar < lista.size()) && (carroapagar >= 0)) {
					lista.remove(carroapagar);
				}
				break;

			}
		}
	}

}
