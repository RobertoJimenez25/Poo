package Tarea9.Herencias;

public class Taxi extends Automovil {
    private String  matricula;
    private String  Conductor;
    private int numeroDePasajeros;

    public Taxi() {
    }

    public Taxi(String marca, String modelo, int anio, int numeroDePuertas, int numeroDeAsientos, String estado, String movimiento, String matricula, String conductor, int numeroDePasajeros) {
        super(marca, modelo, anio, numeroDePuertas, numeroDeAsientos, estado, movimiento);
        this.matricula = matricula;
        Conductor = conductor;
        this.numeroDePasajeros = numeroDePasajeros;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getConductor() {
        return Conductor;
    }

    public void setConductor(String conductor) {
        Conductor = conductor;
    }

    public int getNumeroDePasajeros() {
        return numeroDePasajeros;
    }

    public void setNumeroDePasajeros(int numeroDePasajeros) {
        this.numeroDePasajeros = numeroDePasajeros;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "matricula='" + matricula + '\'' +
                ", Conductor='" + Conductor + '\'' +
                ", numeroDePasajeros=" + numeroDePasajeros +
                ", numeroDePuertas='" + numeroDePuertas + '\'' +
                ", numeroDeAsientos='" + numeroDeAsientos + '\'' +
                ", estado='" + estado + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                '}';
    }
    @Override
    public void encender(){
        estado = "Encendido.";
        System.out.println("EL Taxi de "+Conductor+ " ha "+estado);
    }
    @Override
    public void apagar(){
        estado = "Apagado.";
        System.out.println("El Taxi de "+Conductor+ " se ha "+estado);
    }
    @Override
    public void Avanzar(){
        Movimiento = "Avanzando...";
        System.out.println("El Taxi de "+Conductor+ " esta "+Movimiento);
    }
    @Override
    public void Reversa(){
        Movimiento = "Retrocediendo...";
        System.out.println("El Taxi de "+Conductor+ "  esta "+Movimiento);
    }
    @Override
    public void Neutral(){
        Movimiento = "Neutral.";
        System.out.println("El Taxi de "+Conductor+ " esta "+Movimiento);
    }
    public void subirPasajeros(){
        numeroDePasajeros = 4;
        System.out.println("Se han subido cuatro pasajeros al taxi de "+Conductor+"\nAhora hay "+numeroDePasajeros+" pasajeros.");
    }
    public void bajarPasajeros(){
        numeroDePasajeros = 0;
        System.out.println("El taxi de "+Conductor+ " ha llegado a su destino y han decendido los pasajeros"+"\nAhora hay "+numeroDePasajeros+ " pasajeros.");
    }
}
