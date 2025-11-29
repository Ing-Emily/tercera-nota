package services;

import domain.Estudiante;
import domain.Materia;
import java.util.ArrayList;
import java.util.List;

public class GestionHorarios {
    private List<Materia> materias;
    private List<Estudiante> estudiantes;

    public GestionHorarios() {
        materias = new ArrayList<>();
        estudiantes = new ArrayList<>();
    }

    public void registrarMateria(Materia materia) {
        materias.add(materia);
    }

    public void inscribirEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public boolean inscribirMateriaEstudiante(String idEstudiante, String codigoMateria, String horario) {
        Estudiante estudiante = null;
        for (Estudiante studiante : estudiantes) {
            if (studiante.getId().equals(idEstudiante)) {
                estudiante = studiante;
                break;
            }
        }
        
        if (estudiante == null) return false;

        Materia materia = null;
        for (Materia clase : materias) {
            if (clase.getCodigo().equals(codigoMateria)) {
                materia = clase;
                break;
            }
        }
        if (materia == null) return false;

        if (!materia.mostrarHorariosDisponibles().contains(horario)) return false;

        return estudiante.inscribirMateria(materia, horario);
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }
}