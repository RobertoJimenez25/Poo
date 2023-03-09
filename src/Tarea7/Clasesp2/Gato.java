package Tarea7.Clasesp2;
import java.awt.*;

public class Gato {
    private String nombre;
    private String raza;
    private int edad;
    private Color color;
    private String animo;

    public Gato() {
        nombre = "";
        raza = "";
        edad = 0;
        color = Color.ORANGE;
        animo = "";
    }

    public Gato(String nombre, String raza, int edad, Color color, String animo) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.color = color;
        this.animo = animo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getAnimo() {
        return animo;
    }

    public void setAnimo(String animo) {
        this.animo = animo;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", edad=" + edad +
                ", color=" + color +
                ", animo='" + animo + '\'' +
                '}';
    }
    public void alimentar(){
        animo = "Feliz";
        System.out.println(nombre + " esta " + animo + " porque le diste de comer");
    }

    public void acariciar(){
        animo = "Contento";
        System.out.println(nombre + " esta " + animo + " porque lo acarciaste");
    }
    public void reganio(){
        animo = "Triste";
        System.out.println(nombre  + " esta " + animo + " porque lo regañaste");
    }
}
