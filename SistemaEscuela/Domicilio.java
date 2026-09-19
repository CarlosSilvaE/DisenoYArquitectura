package SistemaEscuela;

public class Domicilio {
	private String calle;
	private String numero;
	private String colonia;
	private String ciudad;
	private String CodigoPostal;
	
	public Domicilio(
			String calle, 
			String numero, 
			String colonia, 
			String ciudad, 
			String CodigoPostal) {
		this.calle = calle;
		this.numero = numero;
		this.colonia = colonia;
		this.ciudad = ciudad;
		this.CodigoPostal = CodigoPostal;
	}
	
	public String toString() {
		return calle + "#" + numero + 
				", " + colonia + 
				", " + ciudad + 
				", " + CodigoPostal;
	}
}
