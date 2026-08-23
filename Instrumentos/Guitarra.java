package Instrumentos;


public class Guitarra extends Instrumento{
	public Guitarra() {
		setTipo("Guitarra");
	}
	@Override
	public void formaTocar() {
		System.out.println("Tocale la guitarra pa");
	}
}
