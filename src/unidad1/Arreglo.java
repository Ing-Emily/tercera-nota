package unidad1;

import java.util.ArrayList;
import java.util.Scanner;

public class Arreglo {
    public static void main(String[] args) {
        ArrayList<Double> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese números (escriba 'fin' para terminar):");
        
        while (true) {
            System.out.print("Número: ");
            if (scanner.hasNextDouble()) {
                numeros.add(scanner.nextDouble());
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("fin")) {
                    break;
                }
                System.out.println("Entrada no válida. Intente nuevamente.");
            }
        }
        
        // Calcular suma y promedio
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        
        double promedio = numeros.isEmpty() ? 0 : suma / numeros.size();
        
        // Mostrar resultados
        System.out.println("\nResultados:");
        System.out.println("Cantidad de números: " + numeros.size());
        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + promedio);
        
        scanner.close();
    }
}