package SistemaEscuela;

import java.util.ArrayList;

public class Estudiante extends Persona {

    private String matricula;
    private int semestre;
    private ArrayList<Materia> materiasCursadas;

    public Estudiante(String nombre,
                      String correo,
                      String matricula,
                      int semestre,
                      Domicilio domicilio,
                      Materia materiaInicial) {

        super(nombre, correo, domicilio);

        this.matricula = matricula;
        this.semestre = semestre;

        materiasCursadas = new ArrayList<>();

        agregarMateria(materiaInicial);
    }

    @Override
    public void agregarMateria(Materia materia) {
        materiasCursadas.add(materia);
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("\n----- ESTUDIANTE -----");

        System.out.println("Nombre: " + nombre);
        System.out.println("Correo: " + correo);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Semestre: " + semestre);
        System.out.println("Domicilio: " + domicilio);

        System.out.println("Materias:");

        for (Materia materia : materiasCursadas) {
            System.out.println("- " + materia);
        }
    }
}
