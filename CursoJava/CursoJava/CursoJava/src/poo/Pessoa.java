package poo;

import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import Interfaces.movel;

public class Pessoa implements movel {
	private long telefone;
	private String nome, morada;
	private int velocidade_corrente;
	private Date datanascimento;
	private Sexo sexo;
	private Habilitacoes habilitacoes;

	public void definirDataNasc(int dia, int mes, int ano) {
		Calendar cal = Calendar.getInstance();
		cal.set(ano, mes - 1, dia);
		datanascimento = cal.getTime();
	}

	/**
	 * Devolve a idade atrav�s da diferen�a da data corrente e da data de nascimento
	 * 
	 * @return idade em anos
	 */
	public Long obterIdade() {
		Date agora = new Date();
		long diferenca = agora.getTime() - datanascimento.getTime();

		return diferenca / 1000 / 60 / 60 / 24 / 30 / 12;
	}

	/**
	 * Defina a datanascimento convertendo uma string para a respetiva data
	 * 
	 * @param data texto que contem a data a interpretar
	 * @throws ParseException
	 */
	public void definirDataNasc(String data) throws ParseException {
		SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
		datanascimento = formato.parse(data);
	}

	public void mostrarDados() {
		System.out.println(nome);
		System.out.println(morada);
		System.out.println(telefone);
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMorada() {
		return morada;
	}

	public void setMorada(String morada) {
		this.morada = morada;
	}

	/**
	 * Parte a string recebida por espa�os e devolve apenas o primeiro e ultimo nome
	 * 
	 * @return String que representa o primeiro e ultimo nome
	 */
	public String primeiroUltimoNome() {
		String[] nomes = nome.split(" "); // dividir o nome pelos espacos guardando num array de Strings
		return nomes[0] + " " + nomes[nomes.length - 1]; // retornar o primeiro seguido de espa�o seguido do ultimo
	}

	@Override
	public void mover() {
		velocidade_corrente += 1;
	}

	@Override
	public int obterVelocidade() {
		return velocidade_corrente;
	}

	public Pessoa(String nome, String morada, long telefone) {
		this.nome = nome;
		this.morada = morada;
		this.telefone = telefone;
	}

	public Pessoa(String nome_pessoa, String morada_pessoa, long telefone_pessoa, String datanascimento_pessoa)
			throws ParseException {
		this.nome = nome_pessoa;
		this.morada = morada_pessoa;
		this.telefone = telefone_pessoa;

		definirDataNasc(datanascimento_pessoa);
	}

	public Pessoa(String nome, String morada, long telefone, String datanascimento, Sexo sexo,
			Habilitacoes habilitacoes) throws ParseException {
		this.telefone = telefone;
		this.nome = nome;
		this.morada = morada;
		definirDataNasc(datanascimento);
		this.sexo = sexo;
		this.habilitacoes = habilitacoes;
	}

	public void escreverFicheiro(PrintWriter pw) {
		pw.write(nome + ";");
		pw.write(morada + ";");
		pw.write(telefone + ";");

		SimpleDateFormat fmt = new SimpleDateFormat("dd-MM-yyyy");

		pw.write(fmt.format(datanascimento) + "\n");
	}

	public String toString() {
		SimpleDateFormat fmt = new SimpleDateFormat("dd-MM-yyyy");
		return "nome:" + nome + "\nmorada:" + morada + "\ntelefone:" + telefone + "\ndata nascimento:"
				+ fmt.format(datanascimento) + "\nsexo:" + sexo + "\nHabilitacoesLiterarias:" + habilitacoes;
	}

}
