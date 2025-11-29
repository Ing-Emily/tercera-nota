package app;

import domain.Estudiante;
import domain.Materia;
import services.GestionHorarios;

public class Main {
    public static void main(String[] args) {
        GestionHorarios gestion = new GestionHorarios();

        Materia mate1 = new Materia("Matemáticas", "MAT101", 3);
        mate1.agregarHorario("Lunes 8-10");
        mate1.agregarHorario("Miércoles 10-12");

        Materia mate2 = new Materia("Programación", "PRG201", 4);
        mate2.agregarHorario("Lunes 8-10");
        mate2.agregarHorario("Martes 14-16");

        gestion.registrarMateria(mate1);
        gestion.registrarMateria(mate2);

        Estudiante estudiante1 = new Estudiante("Laura", "2023001");
        gestion.inscribirEstudiante(estudiante1);

        boolean inscribir1 = gestion.inscribirMateriaEstudiante("2023001", "MAT101", "Lunes 8-10");
        boolean inscribir2 = gestion.inscribirMateriaEstudiante("2023001", "PRG201", "Lunes 8-10");
        boolean inscribir3 = gestion.inscribirMateriaEstudiante("2023001", "PRG201", "Martes 14-16");

        System.out.println("Inscripción MAT101: " + inscribir1);
        System.out.println("Inscripción PRG201 (conflicto): " + inscribir2);
        System.out.println("Inscripción PRG201 (sin conflicto): " + inscribir3);

        estudiante1.mostrarHorarioCompleto();
    }
}