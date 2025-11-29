package domain;

import java.util.ArrayList;
import java.util.List;

public class Materia {
    private String nombre;
    private String codigo;
    private int creditos;
    private List<String> horariosDisponibles;

    public Materia(String nombre, String codigo, int creditos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
        this.horariosDisponibles = new ArrayList<>();
    }

    public void agregarHorario(String horario) {
        horariosDisponibles.add(horario);
    }

    public List<String> mostrarHorariosDisponibles() {
        return horariosDisponibles;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCreditos() {
        return creditos;
    }
}