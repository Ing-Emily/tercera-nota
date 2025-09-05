package unidad1;

import java.util.Scanner;
public class TrianguloRectanguloMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la base del triángulo: ");
        double base = input.nextDouble();
        System.out.print("Ingrese la altura del triángulo: ");
        double altura = input.nextDouble();
        double area = (base * altura) / 2;
        double hipotenusa = Math.hypot(base, altura);
        double perimetro = base + altura + hipotenusa;
        System.out.println("El área del triángulo es: " + area);
        System.out.println("La hipotenusa del triángulo es: " + hipotenusa);
        System.out.println("El perímetro del triángulo es: " + perimetro);
        input.close();
    }
}
