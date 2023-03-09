package Tarea7.Clasesp2;

public class Libro {
    private String nombre;
    private String autor;
    private int cantPaginas;
    private int pagina;

    public Libro() {
        nombre = "";
        autor = "";
        cantPaginas = 0;
        pagina = 0;
    }
    public Libro(String nombre, String autor, int cantPaginas, int pagina) {
        this.nombre = nombre;
        this.autor = autor;
        this.cantPaginas = cantPaginas;
        this.pagina = pagina;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCantPaginas() {
        return cantPaginas;
    }

    public void setCantPaginas(int cantPaginas) {
        this.cantPaginas = cantPaginas;
    }

    public int getPagina() {
        return pagina;
    }

    public void setPagina(int pagina) {
        this.pagina = pagina;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", cantPaginas=" + cantPaginas +
                ", pagina=" + pagina +
                '}';
    }
    public void abrirlibro(){
        pagina = 0;
        System.out.println("Haz abierto " + nombre + " para leerlo");
    }
    public void pasarPagina(){
        pagina += 1;
        System.out.println("Pasaste la pagina\nAhora estas en la pagina: " + pagina);
    }
    public void regresarPagina(){
        pagina -=1;
        System.out.println("Regresaste de pagina\nAhora estas en la paina: "+ pagina);
    }
}
