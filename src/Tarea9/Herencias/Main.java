package Tarea9.Herencias;

public class Main {
    public static void main(String[] args) {

        Taxi taxi1 = new Taxi("Nissa", "Tsuru", 2010, 4, 5, "Apagado", "Neutral", "A-6867-A", "Jose Lopez", 0);
        Taxi taxi2 = new Taxi("Chevrolet", "Chevy Monza", 2012, 2, 5, "Encendido", "Retrocediendo...", "A-0108-J", "Calos Perez", 4);

        System.out.println("");
        System.out.println(taxi1.toString());
        System.out.println("");
        System.out.println(taxi2.toString());
        System.out.println("");

        taxi1.encender();
        System.out.println("");
        taxi2.apagar();
        System.out.println("");
        taxi1.Avanzar();
        System.out.println("");
        taxi1.Reversa();
        System.out.println("");
        taxi2.Neutral();
        System.out.println("");
        taxi1.subirPasajeros();
        System.out.println("");
        taxi2.bajarPasajeros();
    }
}