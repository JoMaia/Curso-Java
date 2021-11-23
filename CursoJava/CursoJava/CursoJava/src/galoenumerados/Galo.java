package galoenumerados;

import java.util.Scanner;

public class Galo {
	static Simbolo[][] tabuleiro;

	public static void inicializacaoTabuleiro() {
		// cria e defina o tamanho do array
		tabuleiro = new Simbolo[3][3];
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				tabuleiro[linha][coluna] = Simbolo.Vazio;
			}
		}
	}

	public static void mostraTabuleiro() {
		for (int linha = 0; linha < 3; linha++) {
			System.out.println("------------");
			System.out.print("| ");

			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.print(tabuleiro[linha][coluna] + " | ");
			}
			System.out.println();
		}
		System.out.println("------------");
	}

	public static boolean fazerJogada(Simbolo simboloCorrente) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Insira a linha onde quer jogar");
		int linha = teclado.nextInt();
		if (linha < 1 || linha > 3) {
			// linha invalida
			return false;
		}
		System.out.println("Insira a coluna onde quer jogar");
		int coluna = teclado.nextInt();
		if (coluna < 1 || coluna > 3) {
			// coluna invalida
			return false;
		}

		if (tabuleiro[linha - 1][coluna - 1] != Simbolo.Vazio) {
			// quadricula já preenchida
			return false;
		}
		// guardar a jogada que foi feita
		tabuleiro[linha - 1][coluna - 1] = simboloCorrente;
		return true; // devolver sucesso
	}

	public static EstadoJogo obterEstado() {
		// linhas
		for (int i = 0; i < 3; ++i) {
			if (tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][1] == tabuleiro[i][2]) {
				if (tabuleiro[i][0] == Simbolo.x) {
					return EstadoJogo.VitoriaX;
				} else if (tabuleiro[i][0] == Simbolo.o) {
					return EstadoJogo.VitoriaO;
				}
			}
		}
		// colunas
		for (int i = 0; i < 3; ++i) {
			if (tabuleiro[0][i] == tabuleiro[1][i] && tabuleiro[1][i] == tabuleiro[2][i]) {
				if (tabuleiro[0][i] == Simbolo.x) {
					return EstadoJogo.VitoriaX;
				} else if (tabuleiro[0][i] == Simbolo.o) {
					return EstadoJogo.VitoriaO;
				}
			}
		}

		// diagonal esquerda
		if (tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2]) {
			if (tabuleiro[0][0] == Simbolo.x) {
				return EstadoJogo.VitoriaX;
			} else if (tabuleiro[0][0] == Simbolo.o) {
				return EstadoJogo.VitoriaO;
			}
		}

		// diagonal direita
		if (tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0]) {
			if (tabuleiro[0][2] == Simbolo.x) {
				return EstadoJogo.VitoriaX;
			} else if (tabuleiro[0][2] == Simbolo.o) {
				return EstadoJogo.VitoriaO;
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (tabuleiro[i][j] == Simbolo.Vazio) {
					return EstadoJogo.ADecorrer;
				}
			}
		}
		
		return EstadoJogo.Empate;
		
	}

	public static void main(String[] args) {
		inicializacaoTabuleiro();
		Simbolo simboloCorrente = Simbolo.x;

		while (true) {
			inicializacaoTabuleiro();
			boolean jogadaValida = fazerJogada(simboloCorrente);
			while (jogadaValida == false) {
				System.out.println("Jogada inválida, jogue de novo");
				jogadaValida = fazerJogada(simboloCorrente);
			}
			if (simboloCorrente == Simbolo.x) {
				simboloCorrente = Simbolo.o;
			} else {
				simboloCorrente = Simbolo.x;
			}

			mostraTabuleiro();

			EstadoJogo estado = obterEstado();
			if (estado != EstadoJogo.ADecorrer) {
					estado.toString();
					break; // terminar o while
				}
			}
		}
}
