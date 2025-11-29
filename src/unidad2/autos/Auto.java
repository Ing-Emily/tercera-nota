package autos;

public class Auto {
    public String marca;
    public String modelo;



    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }


    public void mostrarInformacion(){

        System.out.println("Marca" + marca);
        System.out.println("Modelo" + modelo);

    }

    
    
}
