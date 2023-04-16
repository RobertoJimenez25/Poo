public class PersonaDriver {
    public static void main(String[] args) {
        Persona person1 = new Persona();
        Persona person2 = new Persona( 19, "Pepe", 1.70, 55, "Masculino");
        person1.setEdad(32);
        person1.setNombre("Guadalupe");
        person1.setEstatura(1.50);
        person1.setPeso(40);
        person1.setGenero("Femenino");

        System.out.println(person1.toString());
        System.out.println(person2.toString());

        person1.Comer();
        person2.Evacuar();
        person1.Estiramiento();
    }
}
