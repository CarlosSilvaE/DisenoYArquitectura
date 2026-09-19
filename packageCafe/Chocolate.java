package packageCafe;

public class Chocolate extends BebidaDecorator {

    public Chocolate(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return bebidaProtegida.getDescripcion()
                + "\n + Chocolate";
    }

    @Override
    public double getPrecio() {
        return bebidaProtegida.getPrecio()
                + 5.00;
    }
}
