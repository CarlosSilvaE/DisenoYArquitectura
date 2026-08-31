package Transportes;

public class LogisticaMaritima extends Logistica{
	public Transporte creaLogisticaYCargo() {
		return new Maritima();
	}
}
