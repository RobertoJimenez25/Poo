public class MonitorDriver {
    public static void main(String[] args) {
        Monitor mon1 = new Monitor(22.6, "Samsung", "LF22T35", "LED", 2149.90, "Apagado");
        Monitor mon2 = new Monitor();
        mon2.setPulgadas(27.6);
        mon2.setMarca("Samsung");
        mon2.setModelo("LC27R500FHLXZX");
        mon2.setTipo("LED");
        mon2.setPrecio(4999.00);
        mon2.setEstado("Encendido");

        System.out.println(mon1.toString());
        System.out.println(mon2.toString());

        mon1.encender();
        mon1.reposo();
        mon2.apagar();
    }
}
