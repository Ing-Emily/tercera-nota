package unidad1;

import java.util.Scanner;
import java.util.Arrays;

public class SumaYPromedio {
    public static void main(String[] args) {
        final int TAMANIO = 10;
        double[] numeros = new double[TAMANIO];
        Scanner scanner = new Scanner(System.in);
        
        // Ingreso de datos
        System.out.println("Ingrese " + TAMANIO + " números:");
        for (int i = 0; i < TAMANIO; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }
        
        // Cálculos usando Arrays
        double suma = Arrays.stream(numeros).sum();
        double promedio = suma / TAMANIO;
        
        // Mostrar resultados
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
        
        scanner.close();
    }
}