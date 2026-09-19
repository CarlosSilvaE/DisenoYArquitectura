package AdapterPractice;

public class ImpresoraBase implements Impresora{
	@Override
	public void imprimir(String texto) {
		System.out.println("Impresión exitosa: " + texto);
	}
}
