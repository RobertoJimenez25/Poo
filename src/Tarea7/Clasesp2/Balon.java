package Tarea7.Clasesp2;

public class Balon {
    private String tipo;
    private String material;
    private String estado;

    public Balon() {
        tipo = "";
        estado = "";
        estado = "";
    }

    public Balon(String tipo, String material, String estado) {
        this.tipo = tipo;
        this.material = material;
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Balon{" +
                "tipo='" + tipo + '\'' +
                ", material='" + material + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
    public void inflar(){
        estado = "Inflado";
        System.out.println("Inflaste el balon\nEstado: " + estado);
    }
    public void ponchar(){
        estado = "ponchado";
        System.out.println("Ponchaste el balon con una navaja\nEstado: " + estado);
    }
    public void desinflar(){
        estado = "Desinflado";
        System.out.println("Desinflaste el balon\nEstado: " + estado);
    }
}

