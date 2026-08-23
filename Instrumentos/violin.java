package Instrumentos;


public class violin extends Instrumento{
	public violin() {
		setTipo("Violin");
	}
	@Override
	public void formaTocar() {
		System.out.println("Tocale el violin pa");
	}
}
