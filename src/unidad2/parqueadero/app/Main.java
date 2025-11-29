package parqueadero.app;

import java.util.List;
import parqueadero.domain.EspacioParqueadero;
import parqueadero.domain.Vehiculo;
import parqueadero.services.GestionParqueadero;

public class Main {
    public static void main(String[] args) {
        GestionParqueadero gestion = new GestionParqueadero();

        gestion.agregarEspacio(new EspacioParqueadero(1, "carro"));
        gestion.agregarEspacio(new EspacioParqueadero(2, "moto"));
        gestion.agregarEspacio(new EspacioParqueadero(3, "carro"));

        Vehiculo v1 = new Vehiculo("ABC123", "carro", "Juan");
        Vehiculo v2 = new Vehiculo("XYZ789", "moto", "Ana");

        gestion.registrarVehiculo(v1);
        gestion.registrarVehiculo(v2);

        gestion.asignarEspacio("ABC123");
        gestion.asignarEspacio("XYZ789");

        List<EspacioParqueadero> disponiblesCarros = gestion.obtenerEspaciosDisponibles("carro");
        for (EspacioParqueadero espacio : disponiblesCarros) {
            System.out.println("Espacio disponible para carro: " + espacio.getNumero());
        }
    }
}