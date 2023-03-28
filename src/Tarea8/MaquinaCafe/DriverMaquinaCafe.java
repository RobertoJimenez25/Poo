package Tarea8.MaquinaCafe;

public class DriverMaquinaCafe {
    public static void main(String[] args) {

        MaquinaCafe machine = new MaquinaCafe();

        while (true) {
            machine.Americano();
            machine.Expreso();
            machine.Capuchino();
            if (machine.getAgua() < 180 ) {
                break;
            }

        }

        machine.MostrarInventario();
        machine.TotalCafes();
    }
}

