package Transportes;

public class LogisticaTerrestre extends Logistica{
	public Transporte creaLogisticaYCargo() {
		return new Terrestre();
	}
}
