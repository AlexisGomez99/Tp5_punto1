package modelo;

public class Electrico {
	
	private boolean conectado= false;
	
	public Electrico() {
		System.out.println("Creando motor.");
		conectado=false;
	}
	
	public void conectar() {
		conectado=true;
		System.out.println("Motor conectado.");
	}
	public void activar() {
		System.out.println("Activando motor.");
	}
	public void moverMasRapido() {
		System.out.println("Acelerando motor.");
	}
	public void detener() {
		System.out.println("Deteniendo motor.");
	}
	public void desconectar(){
		conectado=false;
		System.out.println("Motor desconectado.");
	}
}
