package unidad1;

import java.util.Scanner;

public class CirculoMain {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Ingrese el radio del círculo: ");
    double radio = input.nextDouble();

   double area = (Math.PI*radio*radio);
   double circunferencia = (2*Math.PI*radio);
    System.out.println("El área del círculo es: " + area);
    System.out.println("La circunferencia del círculo es: " + circunferencia);
    input.close();
}
}
