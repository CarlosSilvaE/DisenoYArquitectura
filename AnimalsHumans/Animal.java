package AnimalsHumans;

public class Animal implements AccionesGeneral{
	public String apodo;
	
	public Animal(String apodo) {
		this.apodo = apodo;
	}
	
	public void hablar() {
		System.out.println("....");
	}
	
	public void desplazarse() {
		System.out.println("Caminando...");		
	}
	
	public void jugar() {
		System.out.println("Corriendo...");	
	}
	
	public void alimentarse() {
		System.out.println("Ñam Ñam");	
	}
	
	public void dormir() {
		System.out.println("Zzzzz");	
	}
}
