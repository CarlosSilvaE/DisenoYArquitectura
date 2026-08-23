package Instrumentos;


public class App {
	public static void main(String[] args) {
		violin v1  = new violin();
		Saxofon s1 = new Saxofon();
		Guitarra g1 = new Guitarra();
		
		System.out.println("instrumento: " + v1.getTipo());
		v1.formaTocar();
		System.out.println("instrumento: "+ s1.getTipo());
		s1.formaTocar();
		System.out.println("instrumento: "+ g1.getTipo());
		g1.formaTocar();
	}
}
