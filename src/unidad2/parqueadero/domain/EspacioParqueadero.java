package parqueadero.domain;

public class EspacioParqueadero {
    private int numero;
    private String tipoPermitido;
    private boolean disponible;
    private Vehiculo vehiculo;

    public EspacioParqueadero(int numero, String tipoPermitido) {
        this.numero = numero;
        this.tipoPermitido = tipoPermitido;
        this.disponible = true;
    }

    public boolean asignarVehiculo(Vehiculo vehiculo) {
        if (disponible && vehiculo.getTipo().equalsIgnoreCase(tipoPermitido)) {
            this.vehiculo = vehiculo;
            this.disponible = false;
            return true;
        }
        return false;
    }

    public void liberarEspacio() {
        this.vehiculo = null;
        this.disponible = true;
    }

    public boolean estaDisponible() {
        return disponible;
    }

    public String getTipoPermitido() {
        return tipoPermitido;
    }

    public int getNumero() {
        return numero;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
}
