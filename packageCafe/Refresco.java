package packageCafe;

public class Refresco implements Bebida {

    private SaborRefresco sabor;

    public Refresco(SaborRefresco sabor) {
        this.sabor = sabor;
    }

    @Override
    public String getDescripcion() {
        return "Refresco " + sabor;
    }

    @Override
    public double getPrecio() {
        return 25.00;
    }
}