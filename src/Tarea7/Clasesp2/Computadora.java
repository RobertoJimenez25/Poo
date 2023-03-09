package Tarea7.Clasesp2;

public class Computadora {
    private String tipo;
    private int perifericos;
    private String estado;

    public Computadora() {
        tipo = "";
        perifericos = 0;
        estado = "";
    }

    public Computadora(String tipo, int perifericos, String estado) {
        this.tipo = tipo;
        this.perifericos = perifericos;
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPerifericos() {
        return perifericos;
    }

    public void setPerifericos(int perifericos) {
        this.perifericos = perifericos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "tipo='" + tipo + '\'' +
                ", perifericos=" + perifericos +
                ", estado='" + estado + '\'' +
                '}';
    }
    public void conectarperiferico(){
        perifericos += 1;
        System.out.println("Has conectado un Periferico\n Ahora tinenes " + perifericos + " conectados");
    }
    public void apagar() {
        estado = "Apagada";
        System.out.println("La computadora esta: " + estado);
    }
    public void encender(){
        estado = "Encendida";
        System.out.println("La computadora  esta: " + estado);
    }
}
