import java.util.Scanner;

public class VectorCadenas {

    public static void main(String[] args) {
        String[] original = new String[5];
        String[] invertido;

        leerCadenas(original);
        invertido = invertirVector(original);
        mostrarVector(invertido);
    }

    // Método para leer cadenas desde el teclado
    public static void leerCadenas(String[] vector) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 5 cadenas de texto:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Cadena " + (i + 1) + ": ");
            vector[i] = scanner.nextLine();
        }
    }

    // Método para invertir el vector
    public static String[] invertirVector(String[] vector) {
        String[] invertido = new String[vector.length];
        for (int i = 0; i < vector.length; i++) {
            invertido[i] = vector[vector.length - 1 - i];
        }
        return invertido;
    }

    // Método para mostrar el vector
    public static void mostrarVector(String[] vector) {
        System.out.println("\nVector en orden inverso:");
        for (String cadena : vector) {
            System.out.println(cadena);
        }
    }
    scanner.close();
} 