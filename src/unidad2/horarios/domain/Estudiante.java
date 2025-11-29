package domain;

import java.util.HashMap;
import java.util.Map;

public class Estudiante {
    private String nombre;
    private String id;
    private Map<Materia, String> materiasInscritas;

    public Estudiante(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.materiasInscritas = new HashMap<>();
    }

    public boolean inscribirMateria(Materia materia, String horario) {
        for (String inscritas : materiasInscritas.values()) {
            if (inscritas.equals(horario)) {
                return false;
            }
        }
        materiasInscritas.put(materia, horario);
        return true;
    }

    public void mostrarHorarioCompleto() {
        for (Map.Entry<Materia, String> entry : materiasInscritas.entrySet()) {
            System.out.println(entry.getKey().getNombre() + " - " + entry.getValue());
        }
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
}