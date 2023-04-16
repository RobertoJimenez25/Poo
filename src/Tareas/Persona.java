public class Persona {
    private int edad;
    private String nombre;
    private double estatura;
    private double peso;
    private String genero;

    public Persona() {
        edad = 0;
        nombre = "";
        estatura = 0.0;
        peso = 0.0;
        genero = "";
    }

    public Persona(int edad, String nombre, double estatura, double peso, String genero) {
        this.edad = edad;
        this.nombre = nombre;
        this.estatura = estatura;
        this.peso = peso;
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", estatura=" + estatura +
                ", peso=" + peso +
                ", genero='" + genero + '\'' +
                '}';
    }
    public void Comer() {
        peso += 5;
        System.out.println(nombre + " se comio un pollito asado y subio 5 kg\n Ahora su peso es de: " + peso + "Kg" );
    }
    public void Evacuar() {
        peso -= 5;
        System.out.println(nombre + " le cayo mal la comida y tuvo que ir a evacuar rapidamente\n Ahora su peso es de: "  + peso + "Kg");
    }
    public void Estiramiento() {
        estatura += 0.10;
        System.out.println(nombre + " se estiro y crecio 10 cm ¡wow! \n Su estatura actual es: " + estatura + "m");
    }

}
