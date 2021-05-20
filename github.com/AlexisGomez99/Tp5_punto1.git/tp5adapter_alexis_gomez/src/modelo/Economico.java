package modelo;

public class Economico implements Motor{
	
	

	@Override
	public void arracar() {
		System.out.println("Arrancar motor.");
		
	}

	@Override
	public void acelerar() {
		System.out.println("Acelerando motor.");
		
	}

	@Override
	public void apagar() {
		System.out.println("Apagando motor,");
		
	}

	
}
