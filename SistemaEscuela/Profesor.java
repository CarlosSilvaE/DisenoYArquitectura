package SistemaEscuela;

import java.util.ArrayList;

public class Profesor extends Persona {

    private String numeroEmpleado;
    private String departamento;
    private ArrayList<Materia> materiasImpartidas;

    public Profesor(String nombre,
                    String correo,
                    String numeroEmpleado,
                    String departamento,
                    Domicilio domicilio,
                    Materia materiaInicial) {

        super(nombre, correo, domicilio);

        this.numeroEmpleado = numeroEmpleado;
        this.departamento = departamento;

        materiasImpartidas = new ArrayList<>();

        agregarMateria(materiaInicial);
    }

    @Override
    public void agregarMateria(Materia materia) {
        materiasImpartidas.add(materia);
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("\n----- PROFESOR -----");

        System.out.println("Nombre: " + nombre);
        System.out.println("Correo: " + correo);
        System.out.println("Número empleado: " + numeroEmpleado);
        System.out.println("Departamento: " + departamento);
        System.out.println("Domicilio: " + domicilio);

        System.out.println("Materias que imparte:");

        for (Materia materia : materiasImpartidas) {
            System.out.println("- " + materia);
        }
    }
}