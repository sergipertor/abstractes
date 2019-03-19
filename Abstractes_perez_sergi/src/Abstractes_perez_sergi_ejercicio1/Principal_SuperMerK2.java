package Abstractes_perez_sergi_ejercicio1;

public class Principal_SuperMerK2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Nomina n= new Nomina();
			Empleado e;
			e =new Mostrador("Carlos", "Barcelona", "Monstrador", 100);
			System.out.println(e.getClass());
			n.inserixEmpleat(e);
			e =new Mostrador("Ruben", "Barcelona", "Monstrador", 500);
			n.inserixEmpleat(e);
			e =new Mostrador("Carla", "Cornella", "Monstrador", 400);
			n.inserixEmpleat(e);
			e =new Mostrador("Anna", "Cornella", "Monstrador", 200);
			n.inserixEmpleat(e);
			e =new Caixer("Pepe", "Cornella", "Caixer", 8);
			n.inserixEmpleat(e);
			e =new Caixer("Carla", "Cornella", "Caixer", 2);
			n.inserixEmpleat(e);
			System.out.println(n.quantsCornella());
			System.out.println(n.souPromig());
			
			Caixer l=new Caixer("adrian", "cornella", "Cajero", 10);
			System.out.println("El trabajo de Caixer");
			System.out.println("el nom del empleado: "+l.getNom());
			System.out.println("el origen del empleado: "+l.CiudatDOritge);
			System.out.println("lloc: "+l.Lloc);
			System.out.println("precio: "+l.precio);
			System.out.println("horas: "+l.getHoresTreballades());
			System.out.println("salario: "+l.salariDiari());
		
			System.out.println("-------------------------------------------------");
			
			Neteja ne=new Neteja("juan","espluges","Torre");
			System.out.println("El trabajo de Neteja");
			System.out.println("el nom del empleado: "+ne.getNom());
			System.out.println("el origen del empleado: "+ne.CiudatDOritge);
			System.out.println("lloc: "+ne.Lloc);
			System.out.println("precio: "+ne.precio);
			System.out.println("salario: "+ne.salariDiari());
			
			System.out.println("-------------------------------------------------");
			
			Mostrador mostr=new Mostrador("pepe","sant just","luz",5);
			System.out.println("El trabajo de Mostrador");
			System.out.println("el nom del empleado: "+mostr.getNom());
			System.out.println("el origen del empleado: "+mostr.CiudatDOritge);
			System.out.println("lloc: "+mostr.Lloc);
			System.out.println("precio: "+mostr.precio);
			System.out.println("porcentaje: "+mostr.porcentaje);
			System.out.println("vendes: "+mostr.getVendes());
			System.out.println("salario: "+mostr.salariDiari());
			System.out.println("persentatge: "+mostr.persentatge);
	
	}

}
