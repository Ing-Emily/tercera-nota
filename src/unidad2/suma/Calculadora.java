package suma;

import java.util.Scanner;

public class Calculadora {

    public int num1;
    public int num2;
    public int numResult;

    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.numResult = 0;
    }

    public void calcular() {
        numResult = num1 + num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();

        Calculadora resultado = new Calculadora(num1, num2);
        resultado.calcular();

        System.out.println("El resultado es: " + resultado.numResult);

        sc.close();
    }
}
