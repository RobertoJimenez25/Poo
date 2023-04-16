package Tarea9.Herencias;

public class Automovil extends Vehiculo {
    protected int numeroDePuertas;
    protected int numeroDeAsientos;
    protected String estado;
    protected String Movimiento;

    public Automovil() {
    }

    public Automovil(String marca, String modelo, int anio, int numeroDePuertas, int numeroDeAsientos, String estado, String movimiento) {
        super(marca, modelo, anio);
        this.numeroDePuertas = numeroDePuertas;
        this.numeroDeAsientos = numeroDeAsientos;
        this.estado = estado;
        Movimiento = movimiento;
    }

    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

    public int getNumeroDeAsientos() {
        return numeroDeAsientos;
    }

    public void setNumeroDeAsientos(int numeroDeAsientos) {
        this.numeroDeAsientos = numeroDeAsientos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMovimiento() {
        return Movimiento;
    }

    public void setMovimiento(String movimiento) {
        Movimiento = movimiento;
    }

    @Override
    public void encender(){
        estado = "Encendido";
        System.out.println("EL Automovil ha "+estado);
    }
    @Override
    public void apagar(){
        estado = "Apagado";
        System.out.println("El Automovil se ha "+estado);
    }
    public void Avanzar(){
        Movimiento = "Avanzando...";
        System.out.println("El Automovil esta "+Movimiento);
    }
    public void Reversa(){
        Movimiento = "Retrocediendo...";
        System.out.println("El Automovil esta "+Movimiento);
    }
    public void Neutral(){
        Movimiento = "Neutral";
        System.out.println("El Automovil esta "+Movimiento);
    }
    
}
