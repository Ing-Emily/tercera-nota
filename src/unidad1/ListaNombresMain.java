package unidad1;
import java.util.Scanner;
public class ListaNombresMain {
        public static void   main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nombres = new String[3];
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese el nombre " + (i + 1) + ": ");
            nombres[i] = input.nextLine();
        }
        System.out.println("Lista de nombres:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        input.close();
    }
}
