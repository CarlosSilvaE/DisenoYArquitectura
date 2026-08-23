package AnimalsHumans;

public class Humano implements AccionesGeneral, AccionesHumano{
	public String nombre;
	
	public Humano(String nombre) {
		this.nombre = nombre;
	}
	
	public void hablar() {
		System.out.println("Estoy hablando");
	}
	
	public void desplazarse() {
		System.out.println("Moviendome...");
	}
	
	public void jugar() {
		System.out.println("Play game");
	}
	
	public void alimentarse() {
		System.out.println("Ñam Ñam");
	}
	
	public void dormir() {
		System.out.println("Zzzz");
	}
	
	public void tocarInstrumento() {
		System.out.println("Tocando...");
	}
	
	public void estudiar() {
		System.out.println("Estudiando...");
	}
	
	public void trabajar() {
		System.out.println("Trabajando...");
	}
}
