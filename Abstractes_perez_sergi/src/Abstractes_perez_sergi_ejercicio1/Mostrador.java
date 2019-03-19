package Abstractes_perez_sergi_ejercicio1;

public class Mostrador extends Empleado {
	public static int precio = 0, porcentaje = 15;
	
	public static float persentatge;
	protected double Vendes;

	public Mostrador(String nom, String ciudatDOritge, String lloc, double vendes) {
		super(nom, ciudatDOritge, lloc);
		this.Vendes = vendes;
	}

	public double getVendes() {
		return Vendes;
	}

	public void setVendes(double vendes) {
		Vendes = vendes;
	}
	
	public void Lloc() {
		System.out.println("Mi lugar de trabajo es Monstrador");
	}
	
	public void CiudatDOritge() {
		System.out.println("Mi ciudad de origen es Barcelona");
	}
	
	@Override
	public double salariDiari() {
		// TODO Auto-generated method stub
		double precio=50.00;
		persentatge=(float) ((precio*100)/porcentaje);
		return precio;
	}
}