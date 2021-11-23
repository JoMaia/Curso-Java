import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeituraFicheiro {
	public static void main(String[] args) {

		File ficheiro = new File("EscritaDados.txt");

		try {
			BufferedReader br = new BufferedReader(new FileReader(ficheiro));
			String texto = br.readLine();

			if (texto == null) {
				System.out.println("Ficheiro vazio");
				return;
			}
			System.out.println("Conteudo do ficheiro:");

			while (texto != null) {
				System.out.println(texto);
				texto = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Ficheiro não existente");
		} catch (IOException e) {
			System.out.println("Erro de leitura do ficheiro");
		}

	}

}
