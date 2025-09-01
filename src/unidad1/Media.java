package unidad1;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar los tres números al usuario
        System.out.print("Introduce el primer número: ");
        double numero1 = scanner.nextDouble();
        
        System.out.print("Introduce el segundo número: ");
        double numero2 = scanner.nextDouble();
        
        System.out.print("Introduce el tercer número: ");
        double numero3 = scanner.nextDouble();
        
        // Calcular la media
        double media = (numero1 + numero2 + numero3) / 3;
        
        // Mostrar el resultado
        System.out.println("La media de " + numero1 + ", " + numero2 + " y " + numero3 + " es: " + media);
        
        scanner.close();
    }
}