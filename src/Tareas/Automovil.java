import java.awt.*;

public class Automovil {
     private String marca;
     private String subMarca;
     private byte modelo;
     private Color color;
     private String estado;

    public Automovil() {
        marca = "";
        subMarca ="";
        modelo = 0;
        color = Color.RED;
        estado = "";
    }

    public Automovil(String marca, String subMarca, byte modelo, Color color, String estado) {
        this.marca = marca;
        this.subMarca = subMarca;
        this.modelo = modelo;
        this.color = color;
        this.estado = estado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSubMarca() {
        return subMarca;
    }

    public void setSubMarca(String subMarca) {
        this.subMarca = subMarca;
    }

    public byte getModelo() {
        return modelo;
    }

    public void setModelo(byte modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", subMarca='" + subMarca + '\'' +
                ", modelo=" + modelo +
                ", color=" + color +
                ", estado=" + estado +
                '}';
    }

    public void apagar() {
        estado = "Apagado";
        System.out.println("El Automovil esta: " + estado);
    }
    public void encender(){
        estado = "Encendido";
        System.out.println("El Automovil esta: " + estado);
    }
    public void park(){
        estado = "Parqueado";
        System.out.println("El Automovil esta: " + estado);
    }
}
