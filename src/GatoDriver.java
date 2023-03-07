import java.awt.*;

public class GatoDriver {
    public static void main(String[] args) {
        Gato gato1 = new Gato("Pepito", "Persa",2, Color.ORANGE, "Feliz");
        Gato gato2 = new Gato();
        gato2.setNombre("Juanito");
        gato2.setRaza("Esfinge");
        gato2.setEdad(5);
        gato2.setColor(Color.BLACK);
        gato2.setAnimo("Triste");

        System.out.println(gato1.toString());
        System.out.println(gato2.toString());

        gato1.reganio();
        gato2.alimentar();
        gato2.acariciar();
    }
}
