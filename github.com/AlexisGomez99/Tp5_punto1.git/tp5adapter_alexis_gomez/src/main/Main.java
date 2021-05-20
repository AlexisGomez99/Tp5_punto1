package main;

import modelo.AdapterElectrico;
import modelo.Comun;
import modelo.Economico;
import modelo.Motor;

public class Main {

	public static void main(String[] args) {
		
		Motor comun= new Comun();
		System.out.println("Motor comun: ");
		prueba(comun);
		Motor economico= new Economico();
		System.out.println("Motor economico: ");
		prueba(economico);
		System.out.println("Motor electrico: ");
		Motor electrico= new AdapterElectrico();
		prueba(electrico);
	}
	
	private static void prueba(Motor motor) {
		motor.arracar();
		motor.acelerar();
		motor.apagar();
		System.out.println("-----------------------");
	}
}
