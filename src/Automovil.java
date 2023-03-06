import java.awt.*;

public class Automovil {
     private String marca;
     private String subMarca;
     private byte modelo; //2000 + byte
     private Color color;
     private int velocidad;

    public Automovil() {
        marca = "";
        subMarca ="";
        modelo = 0;
        color = Color.RED;
        velocidad = 0;
    }

    public Automovil(String marca, String subMarca, byte modelo, Color color, int velocidad) {
        this.marca = marca;
        this.subMarca = subMarca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = velocidad;
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

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", subMarca='" + subMarca + '\'' +
                ", modelo=" + modelo +
                ", color=" + color +
                ", velocidad=" + velocidad +
                '}';
    }

    public void acelerar() {
        velocidad += 10;
        System.out.println("EL automovil acelero. \n Velocidad actual: " + velocidad);
    }
    public void frenar() {
        velocidad -= 10;
        System.out.println("El automovil freno. \n Velocidad actual: " + velocidad);
    }
    public void cambiarVelocidad(int nuevaVelocidad) {
        velocidad = nuevaVelocidad;
        System.out.println("Se cambio la velocidad del automovil a " + velocidad);
    }
}
