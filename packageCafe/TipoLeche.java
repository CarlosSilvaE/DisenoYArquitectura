package packageCafe;

public enum TipoLeche {
    ENTERA(5.50),
    DESCREMADA(5.50),
    DESLACTOSADA(7.00),
    ALMENDRA(10.00),
    AVENA(9.00);

    private double precio;

    TipoLeche(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }
}
