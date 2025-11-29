package parqueadero.services;

import parqueadero.domain.Vehiculo;
import parqueadero.domain.EspacioParqueadero;
import java.util.List;
import java.util.ArrayList;

public class GestionParqueadero {
    private List<Vehiculo> vehiculos;
    private List<EspacioParqueadero> espacios;

    public GestionParqueadero() {
        vehiculos = new ArrayList<>();
        espacios = new ArrayList<>();
    }

    public void agregarEspacio(EspacioParqueadero espacio) {
        espacios.add(espacio);
    }

    public void registrarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public List<EspacioParqueadero> obtenerEspaciosDisponibles(String tipoVehiculo) {
        List<EspacioParqueadero> disponibles = new ArrayList<>();
        for (EspacioParqueadero espacio : espacios) {
            if (espacio.estaDisponible() && espacio.getTipoPermitido().equalsIgnoreCase(tipoVehiculo)) {
                disponibles.add(espacio);
            }
        }
        return disponibles;
    }

    public boolean asignarEspacio(String placa) {
        Vehiculo vehiculo = null;
        for (Vehiculo v : vehiculos) {
            if (v.getPlaca().equalsIgnoreCase(placa)) {
                vehiculo = v;
                break;
            }
        }
        if (vehiculo == null) return false;

        for (EspacioParqueadero espacio : espacios) {
            if (espacio.estaDisponible() && espacio.getTipoPermitido().equalsIgnoreCase(vehiculo.getTipo())) {
                return espacio.asignarVehiculo(vehiculo);
            }
        }
        return false;
    }
}