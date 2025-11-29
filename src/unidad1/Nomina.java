
import java.util.Scanner;


public class Nomina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // nómina de 10 empleados
        final int TOTAL_EMPLEADOS = 10;
        int sueldosVip = 0;  //contador sueldos mayores de 300
        int sueldosEquilibrio = 0; //contador sueldos entre 100 y 300
        int sumaSueldos = 0; //suma total

        System.out.println("===Nomina===");
        System.out.println("Ingresa los sueldos de los " + TOTAL_EMPLEADOS + " empleados");
        System.out.println("==============================================");
        System.out.println("REGLA IMPORTANTE: ¡NO PUEDES INGRESAR UN SUELDO MENOR O IGUAL A CERO!");
        System.out.println("==============================================");


        for (int i = 1; i <= TOTAL_EMPLEADOS; i++) {
            double sueldo;
            while (true) {
                System.out.print("Empleado #" + i + " - Ingrese el sueldo: $");
                sueldo = sc.nextDouble();

                if (sueldo > 0) {
                    break; // sueldo válido
                } else {
                    System.out.println(" Error: El sueldo debe ser mayor a 0. Intenta nuevamente.");
                }


            }

            if (sueldo > 300) {
                sueldosVip++;
            } else if (sueldo >= 100 && sueldo <= 300){
                sueldosEquilibrio++;
            }


            sumaSueldos += sueldo;

        }

        double promedio = (double) sumaSueldos / TOTAL_EMPLEADOS;
        System.out.println("=== Resultados ===");
        System.out.println("Suma de sueldos: $" + sumaSueldos);
        System.out.println("Promedio de sueldos: $" + promedio);
        System.out.println("Cantidad de sueldos entre $100 y $300: " + sueldosEquilibrio);
        System.out.println("Cantidad de sueldos mayores a $300: " + sueldosVip);
        System.out.println("=== Fin del programa ===");
        sc.close();
    }
    
}
