package poo;

public enum Habilitacoes {

Ano9("9° Ano"),
Ano10("10° Ano"),
Ano11("11° Ano"),
Ano12("12° Ano"),
CursoTecnologicoProfissional("Curso Tecnologico Proficional"),
Bacharelato("Bacharelato"),
Licenciatur("Licenciatura"),
PosGraduacao("Pos Graduacao"),
Mestrad("Mestrado"),
Doutorament("Doutoramento");

private String valor;
	
	Habilitacoes(String val){		
		valor =  val;
	}
	public String toString() {
	       return this.valor;
	    }

}
