import java.util.Random;

public class VectorNumeros {

    public static void main(String[] args) {
        int[] vector = new int[10];

        inicializarVector(vector);
        mostrarResultados(vector);
    }

    // Método para inicializar el vector con valores aleatorios del 1 al 10
    public static void inicializarVector(int[] vector) {
        Random rand = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rand.nextInt(10) + 1; // valores entre 1 y 10
        }
    }

    // Método para mostrar cada número con su cuadrado y su cubo
    public static void mostrarResultados(int[] vector) {
        System.out.println("Número\tCuadrado\tCubo");
        for (int numero : vector) {
            int cuadrado = calcularCuadrado(numero);
            int cubo = calcularCubo(numero);
            System.out.println(numero + "\t" + cuadrado + "\t\t" + cubo);
        }
    }

    // Método para calcular el cuadrado de un número
    public static int calcularCuadrado(int numero) {
        return numero * numero;
    }

    // Método para calcular el cubo de un número
    public static int calcularCubo(int numero) {
        return numero * numero * numero;
    }
}