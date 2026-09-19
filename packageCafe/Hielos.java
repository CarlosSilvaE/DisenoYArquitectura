package packageCafe;

public class Hielos extends BebidaDecorator{

	public Hielos(Bebida bebida) {
		super(bebida);
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return bebidaProtegida.getDescripcion() +"\n + Hielos";
	}

	@Override
	public double getPrecio() {
		// TODO Auto-generated method stub
		return bebidaProtegida.getPrecio() + 2.00;
	}
	

}
