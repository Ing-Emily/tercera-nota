package unidad1;


import java.util.ArrayList;
import java.util.Scanner;

public class MenuInteractivoMain {
    
    // Productos predefinidos
    private static final String[] PRODUCTOS = {
        "Hamburguesa", 
        "Pizza", 
        "Ensalada", 
        "Refresco", 
        "Postre"
    };
    
    private static final double[] PRECIOS = {
        8.50, 
        12.00, 
        6.75, 
        2.50, 
        4.00
    };
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> carrito = new ArrayList<>();
        ArrayList<Integer> cantidades = new ArrayList<>();
        boolean comprando = true;
        
        System.out.println("¡Bienvenido al Restaurante!");
        System.out.println("===========================");
        
        while (comprando) {
            // Mostrar menú
            System.out.println("\nMENÚ DE PRODUCTOS:");
            System.out.println("==================");
            for (int i = 0; i < PRODUCTOS.length; i++) {
                System.out.printf("%d. %-15s $%.2f%n", 
                    (i + 1), PRODUCTOS[i], PRECIOS[i]);
            }
            System.out.println("6. Finalizar pedido");
            System.out.println("7. Cancelar pedido");
            
            // Solicitar opción
            System.out.print("\nSeleccione una opción: ");
            int opcion = scanner.nextInt();
            
            if (opcion >= 1 && opcion <= 5) {
                // Agregar producto al carrito
                System.out.print("¿Cuántas unidades de " + PRODUCTOS[opcion - 1] + "?: ");
                int cantidad = scanner.nextInt();
                
                if (cantidad > 0) {
                    carrito.add(opcion - 1);
                    cantidades.add(cantidad);
                    System.out.println("✓ " + cantidad + " " + PRODUCTOS[opcion - 1] + "(s) agregado(s) al carrito");
                } else {
                    System.out.println(" La cantidad debe ser mayor a 0");
                }
                
            } else if (opcion == 6) {
                // Finalizar pedido
                comprando = false;
                generarFactura(carrito, cantidades);
                
            } else if (opcion == 7) {
                // Cancelar pedido
                System.out.println(" Pedido cancelado. ¡Hasta pronto!");
                return;
                
            } else {
                System.out.println(" Opción no válida. Intente nuevamente.");
            }
        }
        
        scanner.close();
    }
    
    private static void generarFactura(ArrayList<Integer> carrito, ArrayList<Integer> cantidades) {
        if (carrito.isEmpty()) {
            System.out.println(" El carrito está vacío. No se puede generar factura.");
            return;
        }
        
        System.out.println("\n==========================================");
        System.out.println("               FACTURA");
        System.out.println("==========================================");
        System.out.printf("%-20s %-10s %-10s%n", "Producto", "Cantidad", "Subtotal");
        System.out.println("------------------------------------------");
        
        double total = 0;
        
        for (int i = 0; i < carrito.size(); i++) {
            int productoIndex = carrito.get(i);
            int cantidad = cantidades.get(i);
            double subtotal = PRECIOS[productoIndex] * cantidad;
            total += subtotal;
            
            System.out.printf("%-20s %-10d $%-10.2f%n",
                PRODUCTOS[productoIndex], cantidad, subtotal);
        }
        
        System.out.println("------------------------------------------");
        System.out.printf("%-20s %-10s $%-10.2f%n", "TOTAL", "", total);
        System.out.println("==========================================");
        System.out.println("¡Gracias por su compra! ¡Vuelva pronto!");
    }
}
