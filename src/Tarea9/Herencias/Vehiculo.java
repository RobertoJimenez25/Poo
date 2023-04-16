package Tarea9.Herencias;

public class Vehiculo {
protected String marca;
protected String modelo;
protected int anio;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                '}';
    }

    public void encender(){
        System.out.println("EL Vehiculo ha encendio");
    }
    public void apagar(){
        System.out.println("El vehiculo se ha apagado");
    }
}
