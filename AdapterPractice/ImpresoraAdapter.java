package AdapterPractice;

public class ImpresoraAdapter implements Impresora{
	private ImpresoraAntigua impresoraAntigua;

    public ImpresoraAdapter(ImpresoraAntigua impresoraAntigua) {
        this.impresoraAntigua = impresoraAntigua;
    }

    @Override
    public void imprimir(String texto) {
    	String[] datos = texto.split(",");
    	
    	String nombre = datos[0];
    	String tipo = datos[1];
    	String justificacion = datos[2];
    	
        impresoraAntigua.imprimirDocumento(nombre, tipo, justificacion);
    }
}
