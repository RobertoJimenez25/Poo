package Tarea10.Interfaz;

public class Motocicleta implements Vehiculo {
    private int centimetrosCubicos;
    private String Marca;

    public Motocicleta() {
    }

    public Motocicleta(int centimetrosCubicos, String marca) {
        this.centimetrosCubicos = centimetrosCubicos;
        Marca = marca;
    }

    public int getCentimetrosCubicos() {
        return centimetrosCubicos;
    }

    public void setCentimetrosCubicos(int centimetrosCubicos) {
        this.centimetrosCubicos = centimetrosCubicos;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "centimetrosCubicos=" + centimetrosCubicos +
                ", Marca='" + Marca + '\'' +
                '}';
    }
    public void hacerCaballito(){
        System.out.println("Haciendo un caballito para romperme un hueso...");
    }

    @Override
    public boolean encender() {
        System.out.println("Encendiendo la motocicleta marca "+this.Marca);
        return true;
    }

    @Override
    public boolean apagar() {
        System.out.println("Apagando la motocicleta marca "+this.Marca);
        return true;
    }

    @Override
    public void avanzar() {
        System.out.println("Avanzando la motocicleta de "+this.centimetrosCubicos+" C.C.");

    }

    @Override
    public void frenar() {
        System.out.println("Frenando la motocicleta de "+this.centimetrosCubicos+" C.C.");

    }
}
