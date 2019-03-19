package Abstractes_perez_sergi_ejercicio1;

public abstract class Empleado {
	protected String Nom;
	protected String CiudatDOritge;
	protected String Lloc;
	
	public Empleado(String nom, String ciudatDOritge, String lloc) {
		super();
		this.Nom = nom;
		this.CiudatDOritge = ciudatDOritge;
		this.Lloc = lloc;
	}
	
	
	public String getNom() {
		return Nom;
	}


	public void setNom(String nom) {
		Nom = nom;
	}


	public String getCiudatDOritge() {
		return CiudatDOritge;
	}


	public void setCiudatDOritge(String ciudatDOritge) {
		CiudatDOritge = ciudatDOritge;
	}


	public String getLloc() {
		return Lloc;
	}


	public void setLloc(String lloc) {
		Lloc = lloc;
	}


	public abstract double salariDiari();
	
	
	
	
}
