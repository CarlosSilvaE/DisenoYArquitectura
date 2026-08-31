package AdapterExample;

public class DispositivoAdapter implements USB{
	public DispositivoExterno dispositivo;
	
	public DispositivoAdapter(DispositivoExterno dispositivo) {
		this.dispositivo = dispositivo;
	}
	
	public void conectarUSB() {
		dispositivo.conectarDispositivo();
	}
}
