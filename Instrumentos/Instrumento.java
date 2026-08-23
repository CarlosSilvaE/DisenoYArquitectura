package Instrumentos;

public abstract class Instrumento {
	private String tipo;
	
	public abstract void formaTocar();
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
