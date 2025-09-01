import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Ingresa tu nombre:");
        String nombre = scanner.nextLine();
        System.out.print(" Ingresa tu edad:");
        int edad = scanner.nextInt();
        System.out.print(" Ingresa tu peso:");
        double peso = scanner.nextDouble();
        System.out.print(" Ingresa tu altura:");
        double altura = scanner.nextDouble();

        System.out.println("¡Hola! " + nombre + " Tienes: " + edad + " años, tu peso es: " + peso + " kg y mides: " + altura + " cm.");

        scanner.close();
    }
}






