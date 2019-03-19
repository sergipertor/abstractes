package Abstractes_perez_sergi_ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;

public  class Nomina {
		Empleado [] v=new Empleado[4];
		ArrayList<Empleado> empleado= new ArrayList();
		
		public Nomina() {		}
		public void inserixEmpleat(Empleado e) {
			this.empleado.add(e);
		}
		public void  eliminaNeteja() {
			for (Empleado e:empleado) {
				if(e.getClass()==Neteja.class) {
					empleado.remove(e);
				}
			}
		}
		
		public int quantsCornella() {
		int contador=0;
		for (Empleado e:empleado) {
			if(e.getCiudatDOritge()=="Cornella") {
				contador++;
			}
		}
		Iterator it = empleado.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().getClass());
			if(((Empleado) it.next()).getCiudatDOritge() == "Cornella") {
				contador++;
			}
		}
		
		return contador;
		}
		
		public float costNomina() {
			float costNomina = 0.0f;
			for (int i=0;i<empleado.size();i++) {
				costNomina = (float) (costNomina + empleado.get(i).salariDiari());
			}
			return costNomina;
		}
		
		public int quantitatCaixeres() {
			int cantidad = 0;
			for (int i=0;i<v.length;i++) {
				if (empleado.get(i).getLloc()=="Caixer") {
					cantidad++;
				}
			}
			return cantidad;
		}
		
		
		public float souPromig() {
			float souPromig = 0;
			if(empleado.size() !=0) {
				 souPromig = costNomina()/empleado.size();
			}
			return souPromig;
		}		
}