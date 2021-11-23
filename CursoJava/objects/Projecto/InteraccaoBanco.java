package gestaobancaria;

import java.util.ArrayList;

import contas.Conta;

public abstract class InteraccaoBanco {

	protected static Cliente cli; //À medida que os menus avançam o cliente a ser usado é guardado nesta variavel
	protected static Conta con;//À medida que os menus avançam a conta a ser usada é guardada nesta variavel
	
	/**
	 * Este metodo está em repetição a mostrar o menu de operações disponiveis numa conta.
	 * Para cada uma das opções existentes e através de um switch solicita a informação
	 * necessaria ao utilizador e invoca os metodos correspondentes.
	 */
	protected static void processaMenuConta(){
		//implementar o codigo deste método
	}
	
	/**
	 * Este metodo está em repetição a mostrar o menu de contas disponiveis do cliente.
	 * De notar que APENAS AS CONTAS ACTIVAS são mostradas.
	 * Após ser seleccionada uma conta é invocado o metodo processaMenuConta referente à conta escolhida
	 * @param contascliente Cliente sobre o qual se quer visualizar as contas
	 */
	protected static void processaMenuContas(ArrayList<Conta> contascliente) {
		//implementar o codigo deste método
	}	
}
