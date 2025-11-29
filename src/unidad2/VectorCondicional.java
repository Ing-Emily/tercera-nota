import java.util.Scanner;

public class VectorCondicional {

    public static void main(String[] args) {
        int[] vector = new int[10];
        int cantidad = leerNumeros(vector);
        mostrarVector(vector, cantidad);
    }

    // Método para leer números hasta llenar el vector o ingresar un número negativo
    public static int leerNumeros(int[] vector) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        System.out.println("Ingrese números enteros (negativo para detener):");
        while (i < vector.length) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            if (numero < 0) {
                break;
            }
            vector[i] = numero;
            i++;
        }scanner.close();
        return i; // cantidad de elementos introducidos
        
    }

    // Método para mostrar solo los elementos introducidos
    public static void mostrarVector(int[] vector, int cantidad) {
        System.out.println("\nElementos introducidos:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + vector[i]);
        }
    }
}