package AdapterExample;

public class Dispositivo implements USB {

	@Override
	public void conectarUSB() {
		System.out.println("Dispositivo cargando...");
	}

}
