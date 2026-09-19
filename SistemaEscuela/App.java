package SistemaEscuela;

public class App {
    public static void main(String[] args) {

        // Materias
        Materia programacion =
                new Materia("02569", "Programación", 5);

        Materia basesDatos =
                new Materia("06987", "Bases de Datos", 5);

        Materia diseño =
                new Materia("65465", "Diseño y Arquitectura de Software", 4);


        // Domicilios
        Domicilio domicilioEstudiante =
                new Domicilio(
                        "Plaza Manual Acuña",
                        "846",
                        "Saltillo 2000",
                        "Saltillo",
                        "25115"
                );

        Domicilio domicilioProfesor =
                new Domicilio(
                        "Universidad",
                        "450",
                        "República",
                        "Saltillo",
                        "25280"
                );


        // Crear estudiante
        Estudiante estudiante =
                new Estudiante(
                        "Carlos Silva",
                        "silva_c@uadec.edu.mx",
                        "20046004",
                        5,
                        domicilioEstudiante,
                        programacion
                );

        estudiante.agregarMateria(basesDatos);
        estudiante.agregarMateria(diseño);


        // Crear profesor
        Profesor profesor =
                new Profesor(
                        "Juan Pérez",
                        "juan@uadec.edu.mx",
                        "EMP001",
                        "Sistemas",
                        domicilioProfesor,
                        programacion
                );

        profesor.agregarMateria(diseño);


        /*
         * POLIMORFISMO
         */

        Persona persona1 = estudiante;
        Persona persona2 = profesor;

        Persona[] personas = {
                persona1,
                persona2
        };

        for (Persona persona : personas) {
            persona.mostrarInformacion();
        }
    }
}