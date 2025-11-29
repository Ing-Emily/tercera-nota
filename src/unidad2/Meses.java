import java.util.Scanner;

public class Meses {


    public static String[] inicializarNombresMeses() {
        return new String[] {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };
    }

    public static int[] inicializarDiasMeses() {
        return new int[] {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };
    }

    public static int pedirNumeroMes() {
        Scanner scanner = new Scanner(System.in);
        int numero = -1;

        
            System.out.print("Ingrese el número del mes (1-12): ");
            numero = scanner.nextInt();
    
            scanner.close();
        

        return numero;
    }

    public static void mostrarInformacionMes(int numeroMes, String[] nombres, int[] dias) {
        if (numeroMes >= 1 && numeroMes <= 12) {
            String nombreMes = nombres[numeroMes - 1];
            int diasMes = dias[numeroMes - 1];
            System.out.println(nombreMes + " tiene " + diasMes + " días.");
        } else {
            System.out.println("Número de mes inválido. Debe estar entre 1 y 12.");
        }
    }
    
    public static void main(String[] args) {
        String[] nombresMeses = inicializarNombresMeses();
        int[] diasMeses = inicializarDiasMeses();

        int numeroMes = pedirNumeroMes();
        mostrarInformacionMes(numeroMes, nombresMeses, diasMeses);
    }
}