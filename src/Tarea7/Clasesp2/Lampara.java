package Tarea7.Clasesp2;

public class Lampara {
    private String tipo;
    private String estado;
    private double tamanio;

    public Lampara() {
        tipo = "";
        estado = "";
        tamanio = 0.0;
    }

    public Lampara(String tipo, String estado, double tamanio) {
        this.tipo = tipo;
        this.estado = estado;
        this.tamanio = tamanio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Lampara{" +
                "tipo='" + tipo + '\'' +
                ", estado='" + estado + '\'' +
                ", tamanio=" + tamanio +
                '}';
    }
    public void apagar() {
        estado = "Apagada";
        System.out.println("La lampara esta: " + estado);
    }
    public void encender(){
        estado = "Encendida";
        System.out.println("La lampara  esta: " + estado);
    }
}
