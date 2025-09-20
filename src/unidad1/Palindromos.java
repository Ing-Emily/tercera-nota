package unidad1;

import java.util.Scanner;

public class Palindromos {
    public static boolean esPalindromo(String texto) {
        texto = texto.toLowerCase().replaceAll("[^a-z0-9]", "");
        int izquierda = 0;
        int derecha = texto.length() - 1;
        
        while (izquierda < derecha) {
            if (texto.charAt(izquierda) != texto.charAt(derecha)) {
                return false;
            }
            izquierda++;
            derecha--;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa una palabra o frase: ");
        String texto = scanner.nextLine();
        
        if (esPalindromo(texto)) {
            System.out.println("¡Es un palíndromo!");
        } else {
            System.out.println("No es un palíndromo");
        }
        
        scanner.close();
    }
}