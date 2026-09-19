package packageCafe;

public class Leche extends BebidaDecorator {

    private TipoLeche tipoLeche;

    public Leche(Bebida bebida, TipoLeche tipoLeche) {
        super(bebida);
        this.tipoLeche = tipoLeche;
    }

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
        return bebidaProtegida.getDescripcion()
                + "\n + Leche " + tipoLeche;
	}

	@Override
	public double getPrecio() {
        return bebidaProtegida.getPrecio()
                + tipoLeche.getPrecio();
	}


}