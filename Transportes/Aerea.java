package Transportes;

public class Aerea implements Transporte{
	private String compania;
	
	public Aerea(String compania) {
		this.compania = compania;
	}
	
	public void TipoEntrega() {
		System.out.println("Tipo de entrega aerea");
	}

    public String getCompania() {
    	return compania;
    }
	
	public double CargoTipoEntrega() {
		return 500.0;
	}
}
