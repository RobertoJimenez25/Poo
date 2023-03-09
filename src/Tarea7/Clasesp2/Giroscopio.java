package Tarea7.Clasesp2;

public class Giroscopio {
    private double tamanioAltura;
    private String Estado;
    private String tipo;

    public Giroscopio() {
        tamanioAltura = 0.0;
        Estado = "";
        tipo = "";
    }

    public Giroscopio(double tamanioAltura, String estado, String tipo) {
        this.tamanioAltura = tamanioAltura;
        Estado = estado;
        this.tipo = tipo;
    }

    public double getTamanioAltura() {
        return tamanioAltura;
    }

    public void setTamanioAltura(double tamanioAltura) {
        this.tamanioAltura = tamanioAltura;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Giroscopio{" +
                "tamanioAltura=" + tamanioAltura +
                ", Estado='" + Estado + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
    public void girar() {
        Estado = "Girando";
        System.out.println("El giroscopio esta: " + Estado);
    }

    public void reposo(){
        Estado = "Reposo";
        System.out.println("El giroscopio esta en: " + Estado);
    }
}
