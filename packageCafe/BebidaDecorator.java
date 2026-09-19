package packageCafe;

public abstract class BebidaDecorator implements Bebida{
	protected Bebida bebidaProtegida;
	
    public BebidaDecorator(Bebida bebida) {
        this.bebidaProtegida = bebida;
    }

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return this.bebidaProtegida.getDescripcion();
	}

	@Override
	public double getPrecio() {
		// TODO Auto-generated method stub
		return this.bebidaProtegida.getPrecio();
	}
    
    
}
