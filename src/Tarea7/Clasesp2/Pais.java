package Tarea7.Clasesp2;

public class Pais {
    private String nombre;
    private String capital;
    private int poblacion;
    private int territorio;

    public Pais() {
        nombre = "";
        capital = "";
        poblacion = 0;
        territorio = 0;
    }

    public Pais(String nombre, String capital, int poblacion, int territorio) {
        this.nombre = nombre;
        this.capital = capital;
        this.poblacion = poblacion;
        this.territorio = territorio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public int getTerritorio() {
        return territorio;
    }

    public void setTerritorio(int territorio) {
        this.territorio = territorio;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", capital='" + capital + '\'' +
                ", poblacion=" + poblacion +
                ", territorio=" + territorio +
                '}';
    }
    public void guerra(){
        poblacion -= 30000;
        System.out.println(nombre + " entro en guerra y perdio \n Ahora tu poblacion es de: " + poblacion);
    }
    public void InvasiondePais(){
        territorio -= 390500 ;
        System.out.println("¡¡¡¡ Invadieron a " + nombre + "!!!!\n Ahora tu territorio es de: " + territorio);

    }

}

