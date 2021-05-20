package modelo;

public class AdapterElectrico implements Motor{
	private Electrico motorElectrico;
	
	public AdapterElectrico() {
		motorElectrico=new Electrico();
	}

	@Override
	public void arracar() {
		System.out.println("Encendiendo motor electrico.");
		this.motorElectrico.conectar();
		this.motorElectrico.activar();
	}

	@Override
	public void acelerar() {
		System.out.println("Acelerando motor electrico.");
		this.motorElectrico.moverMasRapido();
	}

	@Override
	public void apagar() {
		System.out.println("Apagando motor electrico");
		this.motorElectrico.detener();
		this.motorElectrico.desconectar();
	}

}
