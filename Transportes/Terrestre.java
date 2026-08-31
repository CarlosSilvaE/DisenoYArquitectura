package Transportes;

public class Terrestre implements Transporte{
	public void TipoEntrega() {
		System.out.println("Tipo de entrega terrestre");
	}
	
	public double CargoTipoEntrega() {
		return 0;
	}
}
