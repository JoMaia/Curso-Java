package galoenumerados;

public enum EstadoJogo {
	VitoriaX ("Ganhou o jogador X"),
	VitoriaO ("Ganhou o jogador O"),
	Empate ("Jogo empatado"),
	ADecorrer ("Jogo em andamento");
	
	private String valor;
	
	EstadoJogo(String val){		
		valor =  val;
	}
	public String toString() {
	       return this.valor;
	    }
	
	
}
