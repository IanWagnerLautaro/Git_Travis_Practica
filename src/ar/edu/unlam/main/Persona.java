package ar.edu.unlam.main;

public class Persona {

	private Imaquina Maquina;
	
	Persona (Imaquina maquina){
		
		this.Maquina=maquina;
	}
	
	public void mostrar() {
		
		Maquina.mostrar();
	}
}
