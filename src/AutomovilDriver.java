import java.awt.*;

public class AutomovilDriver {
    public static void main(String[] args) {
        Automovil auto1 = new Automovil();
        Automovil auto2 = new Automovil("Chevrolet", "Camaro", (byte) 2020, Color.RED, 60);
        auto1.setMarca("Ford");
        auto1.setSubMarca("Mustang");
        auto1.setModelo((byte) 2019);
        auto1.setColor(Color.yellow);
        auto1.setVelocidad(50);

        System.out.println(auto1.toString());
        System.out.println(auto2.toString());

        auto1.acelerar();
        auto2.frenar();
        auto1.cambiarVelocidad(70);
    }
}
