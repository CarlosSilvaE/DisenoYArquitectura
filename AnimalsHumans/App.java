package AnimalsHumans;

public class App {

	public static void main(String[] args) {
		Hombre h = new Hombre("Carlos");
		Mujer m = new Mujer("Heidi");
		Gato g = new Gato("Aria");
		Perro p = new Perro("Lucas");
		
		System.out.println("===Hombre===");
		System.out.println(h.nombre);
		System.out.println(h.calculaMasaCorporal(120, 1.83));
		h.hablar();
		
		System.out.println("");
		
		System.out.println("===Mujer===");
		System.out.println(m.nombre);
		m.hijos();
		
		System.out.println("");
		
		System.out.println("===Gato===");
		System.out.println(g.apodo);
		System.out.println(g.añosdeEdad(3));
		g.alimentarse();
		
		System.out.println("");
		
		System.out.println("===Perro===");
		System.out.println(p.apodo);
		p.dormir();
	}

}
