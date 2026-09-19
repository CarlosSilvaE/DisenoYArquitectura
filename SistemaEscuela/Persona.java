package SistemaEscuela;

public abstract class Persona {
	protected String nombre;
	protected String correo;
	protected Domicilio domicilio;
	
	public Persona (String nombre, String correo, Domicilio domicilio) {
		this.nombre = nombre;
		this.correo = correo;
		this.domicilio = domicilio;
	}
	
    public abstract void agregarMateria(Materia materia);

    public abstract void mostrarInformacion();
}
