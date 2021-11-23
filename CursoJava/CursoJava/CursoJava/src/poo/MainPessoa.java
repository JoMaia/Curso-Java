package poo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainPessoa {
	private static void escreveMenu() {
		System.out.println("1 - Adicionar Pessoa");
		System.out.println("2 - Remover Pessoa");
		System.out.println("3 - Listar Pessoas");
		System.out.println("4 - Carregar Pessoas do ficheiro");
		System.out.println("5 - Escrever Pessoas do ficheiro");
		System.out.println("6 - Listar Pessoas pelo nome proprio determinado");
		System.out.println("7 - sair");
	}

	private static void adicionarPessoa(ArrayList<Pessoa> lista) {
		try {
			teclado.nextLine();
			System.out.println("Insira o seu nome");
			String nome = teclado.nextLine();
			System.out.println("Insira a morada");
			String morada = teclado.nextLine();
			System.out.println("Insira a sua data de nascimento, (dd-mm-aaaa) ");
			String data_nasc = teclado.nextLine();
			System.out.println("Insira o telefone");
			long telefone = teclado.nextLong();

			Pessoa p = new Pessoa(nome, morada, telefone, data_nasc);
			lista.add(p);
		} catch (Exception e) {
			System.out.println("Dados incorretos!Não é possivel de adicionar a Pessoa");
		}

	}

	public static void listarPessoas(ArrayList<Pessoa> lista) {
		for (Pessoa p : lista) {
			System.out.println(p.toString());
		}
	}

	public static void gravarPessoas(ArrayList<Pessoa> lista) {
		try {
			PrintWriter pw = new PrintWriter("Pessoas.csv");
			for (Pessoa p : lista) {
				p.escreverFicheiro(pw);
			}
			pw.flush();
			pw.close();
		} catch (Exception e) {
			System.out.println("Erro de escrita no ficheiro");
		}

	}

	public static void carregarPessoas(ArrayList<Pessoa> lista) {
		lista.clear();
		File ficheiro = new File("Pessoas.csv");

		try {
			BufferedReader br = new BufferedReader(new FileReader(ficheiro));
			String texto = br.readLine();

			while (texto != null) {
				String[] dadosficheiro = texto.split(";");
				String nome = dadosficheiro[0];
				String morada = dadosficheiro[1];
				long telefone = Long.parseLong(dadosficheiro[2]);
				String texto_data = dadosficheiro[3];
				Pessoa pessoalida = new Pessoa(nome, morada, telefone, texto_data);
				lista.add(pessoalida);
				texto = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Ficheiro n�o existente");
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println("Erro de leitura do Ficheiro");
		} catch (ParseException e) {
			System.out.println("Erro na leitura das datas do Ficheiro");
		}
	}

	public static void removerPessoa(ArrayList<Pessoa> lista) {
		System.out.println("Qual a pociçao desejada para remoção");
		try {
			int posicao = teclado.nextInt();

			if (posicao > lista.size() || posicao < 0) {
				System.out.println("Posição não encontrada tente de novo!");
				return;
			}

			lista.remove(posicao - 1);
			System.out.println("Pessoa removida com sucesso!");

		} catch (InputMismatchException e) {
			System.out.println("Posição inválida");
		}

	}

	public static void nomePoprioPessoas(ArrayList<Pessoa> lista) {

		teclado.nextLine();
		System.out.println("Qual o nome próprio para listar?");
		String nome = teclado.nextLine();

		for (Pessoa p : lista) {
			if (p.getNome().startsWith(nome)) {
				System.out.println(p.toString());
			}
		}
	}

	private static Scanner teclado;

	public static void main(String[] args) {
		ArrayList<Pessoa> listapessoas = new ArrayList<Pessoa>();
		teclado = new Scanner(System.in);

		int opcao = 6;

		do {
			escreveMenu();

			try {
				opcao = teclado.nextInt();

			} catch (Exception e) {
				teclado.nextLine();
				System.out.println("Por favor insira um numero");
				opcao = 0;
			}
			switch (opcao) {
			case 1:
				adicionarPessoa(listapessoas);
				break;
			case 2:
				removerPessoa(listapessoas);
				break;
			case 3:
				listarPessoas(listapessoas);
				break;
			case 4:
				carregarPessoas(listapessoas);
				break;
			case 5:
				gravarPessoas(listapessoas);
				break;
			case 6:
				nomePoprioPessoas(listapessoas);
				break;
			case 7:
				System.out.println("A sair...");
				break;
			default:
				System.out.println("Opcao inválida, escolha outra");
				break;
			}
		} while (opcao != 7);
	}

}
