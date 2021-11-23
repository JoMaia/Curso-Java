package poo;

import java.text.ParseException;

public class TestePessoaEnumerados {

	public static void main(String[] args) throws ParseException {
		Pessoa p1 = new Pessoa("João Filipe Costa", "Rua das Oliveiras nº33", 212223344, "19-02-1986", Sexo.Masculino,
				Habilitacoes.PosGraduacao);
		System.out.println(p1);
		System.out.println();
		Pessoa p2 = new Pessoa("Ana Silva Santos", "Rua dos Cantaros nº46", 213334455, "24-07-2001", Sexo.Feminino,
				Habilitacoes.Ano12);
		System.out.println(p2);
	}

}
