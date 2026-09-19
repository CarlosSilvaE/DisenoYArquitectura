package packageCafe;

public class CremaBatida extends BebidaDecorator {
	
    public CremaBatida(Bebida bebida) {
        super(bebida);
    }

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return bebidaProtegida.getDescripcion() + "\n + Crema Batida";
	}

	@Override
	public double getPrecio() {
		// TODO Auto-generated method stub
		return bebidaProtegida.getPrecio()+ 5.00;
	}
	

}
