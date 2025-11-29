import java.util.ArrayList;
import java.util.List;

public class Transformador {

    static class Persona {
        String id;
        String nombre;
        int edad;

        public Persona(String id, String nombre, int edad) {
            this.id = id;
            this.nombre = nombre;
            this.edad = edad;
        }

        public String toString() {
            return id + " - " + nombre + " (" + edad + ")";
        }
    }

    public static List<Persona> transformar(List<String> nombres, List<Integer> edades) {
        List<Persona> personas = new ArrayList<>();

        for (int i = 0; i < nombres.size(); i++) {
            String id = String.valueOf(i + 1);
            String nombre = nombres.get(i);
            int edad = edades.get(i);
            personas.add(new Persona(id, nombre, edad));
        }

        return personas;
    }

    public static void main(String[] args) {
        List<String> nombres = List.of("Bruno", "Andrea");
        List<Integer> edades = List.of(20, 19);

        List<Persona> personas = transformar(nombres, edades);

        for (Persona p : personas) {
            System.out.println(p);
        }
    }
}