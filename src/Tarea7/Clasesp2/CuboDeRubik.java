package Tarea7.Clasesp2;

public class CuboDeRubik {
    private String cantidad;
    private String estado;
    private String tipoDeMovimiento;

    public CuboDeRubik() {
        cantidad = "";
        estado = "";
        tipoDeMovimiento = "";
    }

    public CuboDeRubik(String cantidad, String estado, String tipoDeMovimiento) {
        this.cantidad = cantidad;
        this.estado = estado;
        this.tipoDeMovimiento = tipoDeMovimiento;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipoDeMovimiento() {
        return tipoDeMovimiento;
    }

    public void setTipoDeMovimiento(String tipoDeMovimiento) {
        this.tipoDeMovimiento = tipoDeMovimiento;
    }

    @Override
    public String toString() {
        return "CuboDeRubik{" +
                "cantidad='" + cantidad + '\'' +
                ", estado='" + estado + '\'' +
                ", tipoDeMovimiento='" + tipoDeMovimiento + '\'' +
                '}';
    }
    public void mezclar(){
        estado = "Mezclado";
        System.out.println("El cubo se ha Mezclado");
    }
    public void girarderecha(){
        tipoDeMovimiento = "Giro a la derecha";
        System.out.println("Haz girado a la derecha");
    }
}
