package unidad1;

import java.util.Scanner;

public class DescuentosMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Precios originales
        double camiseta = 25.0;
        double pantalon = 30.0;
        
        System.out.println("=== TIENDA DE ROPA ===");
        System.out.println("Precios originales:");
        System.out.println("Camiseta: $" + camiseta);
        System.out.println("Pantalón: $" + pantalon);
        System.out.println("Descuento: 15% en todas las prendas");
        System.out.println("Descuento extra: 5% en segunda camiseta");
        System.out.println("=========================");
        
        // Aplicar descuento del 15% a cada prenda
        double camisetaDescuento = camiseta * 0.85; // 100% - 15% = 85%
        double pantalonDescuento = pantalon * 0.85;
        
        System.out.println("\nPrecios con descuento del 15%:");
        System.out.printf("1 camiseta: $%.2f%n", camisetaDescuento);
        System.out.printf("1 pantalón: $%.2f%n", pantalonDescuento);
        
        // Calcular precio de 1 camiseta + 1 pantalón
        double total1 = camisetaDescuento + pantalonDescuento;
        System.out.printf("\nTotal por 1 camiseta + 1 pantalón: $%.2f%n", total1);
        
        // Calcular con segunda camiseta (5% adicional)
        double segundaCamiseta = camisetaDescuento * 0.95; // 5% adicional
        double total2 = camisetaDescuento + segundaCamiseta + pantalonDescuento;
        
        System.out.println("\n=== CON SEGUNDA CAMISETA ===");
        System.out.printf("Primera camiseta: $%.2f%n", camisetaDescuento);
        System.out.printf("Segunda camiseta (5%% extra): $%.2f%n", segundaCamiseta);
        System.out.printf("Pantalón: $%.2f%n", pantalonDescuento);
        System.out.printf("TOTAL: $%.2f%n", total2);
        
        scanner.close();
    }
}