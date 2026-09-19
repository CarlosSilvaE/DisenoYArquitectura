package AdapterPractice;

public class App {

	public static void main(String[] args) {
		ImpresoraBase im = new ImpresoraBase();
		ImpresoraAntigua antigua = new ImpresoraAntigua();

        Impresora impresora = new ImpresoraAdapter(antigua);
        
        im.imprimir("Hola como tas");
        impresora.imprimir("Galletas de BTS, Comida, tengo hambre");
	}
}