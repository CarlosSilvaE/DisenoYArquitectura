package Transportes;

public class Main {
	
	public Logistica logis1;
	
	public static void main(String[] args) {
		Main main = new Main();
		
		main.logis1 = new LogisticaAerea("Mexico AeroBus");
		
		Aerea a = new Aerea("AeroMexico");
		
		System.out.println(a.getCompania());
		
		Transporte t = main.logis1.creaLogisticaYCargo();
		
		t.TipoEntrega();
		
		System.out.println("Cargo:" + t.CargoTipoEntrega());
	}

}
