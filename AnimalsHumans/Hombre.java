package AnimalsHumans;

public class Hombre extends Humano{
	public Hombre(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}
	public double calculaMasaCorporal(double peso, double altura) {
		return peso / (altura*altura);
	}
}
