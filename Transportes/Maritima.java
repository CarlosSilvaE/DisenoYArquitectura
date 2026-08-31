package Transportes;

public class Maritima implements Transporte{
	public void TipoEntrega() {
		System.out.println("Tipo de entrega via maritima");
	}
	
	public double CargoTipoEntrega() {
		return 0;
	}
}
