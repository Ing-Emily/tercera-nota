import java.util.Scanner;

public class NotasAlumno {

    public static void main(String[] args) {
        double[] notas = new double[5];

        leerNotas(notas);
        mostrarNotas(notas);
        System.out.println("Nota media: " + calcularMedia(notas));
        System.out.println("Nota más alta: " + obtenerMaxima(notas));
        System.out.println("Nota más baja: " + obtenerMinima(notas));
    }

    // Método para leer las notas desde el teclado
    public static void leerNotas(double[] notas) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 5 notas entre 0 y 10:");
        for (int i = 0; i < notas.length; i++) {
            double nota;
            do {
                System.out.print("Nota " + (i + 1) + ": ");
                nota = scanner.nextDouble();
                if (nota < 0 || nota > 10) {
                    System.out.println(" La nota debe estar entre 0 y 10. Intente de nuevo.");
                }
            } while (nota < 0 || nota > 10);
            notas[i] = nota;
        }
        scanner.close();
    }

    // Método para mostrar todas las notas
    public static void mostrarNotas(double[] notas) {
        System.out.println("\nNotas ingresadas:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }
    }

    // Método para calcular la nota media
    public static double calcularMedia(double[] notas) {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    // Método para obtener la nota más alta
    public static double obtenerMaxima(double[] notas) {
        double max = notas[0];
        for (double nota : notas) {
            if (nota > max) {
                max = nota;
            }
        }
        return max;
    }

    // Método para obtener la nota más baja
    public static double obtenerMinima(double[] notas) {
        double min = notas[0];
        for (double nota : notas) {
            if (nota < min) {
                min = nota;
            }
        }
        return min;
    }
}