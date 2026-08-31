package AdapterExample;

public class App {

	public static void main(String[] args) {
		Dispositivo d = new Dispositivo();
		DispositivoExterno d2 = new DispositivoExterno();
		
		DispositivoAdapter da = new DispositivoAdapter(d2);
		
		d.conectarUSB();
		da.conectarUSB();
	}

}
