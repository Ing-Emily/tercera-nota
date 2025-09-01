package unidad1;

import java.util.Scanner;

public class RetiroMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese saldo inicial: $");
        double saldo = scanner.nextDouble();
        
        System.out.print("Ingrese retiro semanal: $");
        double retiroSemanal = scanner.nextDouble();
        
        System.out.print("Ingrese número de semanas: ");
        int semanas = scanner.nextInt();  //

        double saldoFinal = saldo - (retiroSemanal * semanas);

        System.out.println("=== SIMULACIÓN DE RETIROS BANCARIOS ===");
        System.out.printf("Saldo inicial: $%.2f%n", saldo);
        System.out.printf("Retiro semanal: $%.2f%n", retiroSemanal);
        System.out.printf("Número de semanas: %d%n", semanas);
        System.out.println("-----------------------------------");
        System.out.printf("Saldo final: $%.2f%n", saldoFinal);
        
        scanner.close();
    }
}