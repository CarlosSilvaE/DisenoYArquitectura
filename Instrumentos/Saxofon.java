package Instrumentos;


public class Saxofon extends Instrumento{
	public Saxofon() {
		setTipo("Saxofon");
	}
	@Override
	public void formaTocar() {
		System.out.println("Tocale el saxofon pa");
	}
}
