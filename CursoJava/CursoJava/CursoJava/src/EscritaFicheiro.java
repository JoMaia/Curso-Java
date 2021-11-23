import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscritaFicheiro {
	public static void listFiles() {
		try {
			System.out.println("Ficheiros na diretoria corrente:");

			File flist = new File("..");
			String[] listaFicheiros = flist.list();

			for (int i = 0; i < listaFicheiros.length; i++) {
				System.out.println(listaFicheiros[i]);
			}
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

	public static void main(String[] args) {

		File ficheiro = new File("EscritaDados.txt");

		try {
			if (ficheiro.exists()) {
				ficheiro.delete();
			} else {
				FileWriter fw = new FileWriter("EscritaDados.txt", true);
				PrintWriter pw = new PrintWriter(fw);
				pw.println("Este é um exemplo de escrita de dados");
				pw.println("em ficheiros");
				pw.println("de texto");
				pw.println("mais texto");
				pw.flush();
				pw.close();
			}

		} catch (FileNotFoundException e) {
			System.out.println("Erro : " + e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();

		}
		listFiles();
	}
}
