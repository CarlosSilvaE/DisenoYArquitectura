package Transportes;

public class LogisticaAerea extends Logistica{
	private String compania;
	
	public LogisticaAerea(String compania) {
		this.compania = compania;
	}
	
	public Transporte creaLogisticaYCargo() {
		return new Aerea(compania);
	}
}
