package Abstractes_perez_sergi_ejercicio1;

public class Caixer extends Empleado {
	public static int precio = 0;
	protected double HoresTreballades;

	public Caixer(String nom, String ciudatDOritge, String lloc, double horesTreballades) {
		super(nom, ciudatDOritge, lloc);
		this.HoresTreballades = horesTreballades;
	}
	
	public double getHoresTreballades() {
		return HoresTreballades;
	}

	public void setHoresTreballades(double horesTreballades) {
		HoresTreballades = horesTreballades;
	}
	
	public void Lloc() {
		System.out.println("Mi lugar de trabajo es Caixer");
	}
	
	public void CiudatDOritge() {
		System.out.println("Mi ciudad de origen es Barcelona");
	}
	
	
	@Override
	public double salariDiari() {
		// TODO Auto-generated method stub
		double precio =15.00;
		precio = precio*this.HoresTreballades;
		return precio;
	}
}