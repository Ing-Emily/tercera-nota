import java.util.Arrays;
import java.util.Random;

public class OrdenarVector {

    public static void main(String[] args) {
        int[] vector = new int[10];

        inicializarVector(vector);
        System.out.println("Vector original:");
        mostrarVector(vector);

        ordenarVector(vector);
        System.out.println("\nVector ordenado de menor a mayor:");
        mostrarVector(vector);
    }

    // Método para inicializar el vector con valores aleatorios del 1 al 100
    public static void inicializarVector(int[] vector) {
        Random rand = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rand.nextInt(100) + 1; // valores entre 1 y 100
        }
    }

    // Método para mostrar el contenido del vector
    public static void mostrarVector(int[] vector) {
        for (int num : vector) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Método para ordenar el vector de menor a mayor
    public static void ordenarVector(int[] vector) {
        Arrays.sort(vector);
    }
}