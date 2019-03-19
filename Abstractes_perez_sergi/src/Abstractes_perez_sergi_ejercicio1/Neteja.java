package Abstractes_perez_sergi_ejercicio1;

public class Neteja extends Empleado {
	public static int precio = 0;

	public Neteja(String nom, String ciudatDOritge, String lloc) {
		super(nom, ciudatDOritge, lloc);
		// TODO Auto-generated constructor stub
	}
	
	public void Lloc() {
		System.out.println("Mi lugar de trabajo es Neteja");
	}
	
	public void CiudatDOritge() {
		System.out.println("Mi ciudad de origen es Barcelona");
	}
	
	@Override
	public double salariDiari() {
		// TODO Auto-generated method stub
		double precio=35.00;
		return precio;
	}
}
