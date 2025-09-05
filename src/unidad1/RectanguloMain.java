package unidad1;

import java.util.Scanner;

public class RectanguloMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la base del rectángulo: ");
        double base = input.nextDouble();
        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = input.nextDouble();
        double area = base * altura;
        double perimetro = 2 * (base + altura);
        System.out.println("El área del rectángulo es: " + area);
        System.out.println("El perímetro del rectángulo es: " + perimetro);
        input.close();
    }

}
