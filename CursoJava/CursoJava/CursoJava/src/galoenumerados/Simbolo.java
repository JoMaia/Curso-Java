package galoenumerados;

public enum Simbolo {
	x ("X"),
	o ("O"),
	Vazio (" ");
	
	private String valor;
	
	Simbolo(String val){		
		valor =  val;
	}
	
	@Override
	public String toString() {
		return valor;
	}

}
