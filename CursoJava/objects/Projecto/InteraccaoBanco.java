package gestaobancaria;

import java.util.ArrayList;

import contas.Conta;

public abstract class InteraccaoBanco {

	protected static Cliente cli; //� medida que os menus avan�am o cliente a ser usado � guardado nesta variavel
	protected static Conta con;//� medida que os menus avan�am a conta a ser usada � guardada nesta variavel
	
	/**
	 * Este metodo est� em repeti��o a mostrar o menu de opera��es disponiveis numa conta.
	 * Para cada uma das op��es existentes e atrav�s de um switch solicita a informa��o
	 * necessaria ao utilizador e invoca os metodos correspondentes.
	 */
	protected static void processaMenuConta(){
		//implementar o codigo deste m�todo
	}
	
	/**
	 * Este metodo est� em repeti��o a mostrar o menu de contas disponiveis do cliente.
	 * De notar que APENAS AS CONTAS ACTIVAS s�o mostradas.
	 * Ap�s ser seleccionada uma conta � invocado o metodo processaMenuConta referente � conta escolhida
	 * @param contascliente Cliente sobre o qual se quer visualizar as contas
	 */
	protected static void processaMenuContas(ArrayList<Conta> contascliente) {
		//implementar o codigo deste m�todo
	}	
}
