import java.util.Scanner;

public class TareaString {
    public static void main(String[] args){

        Scanner Teclado = new Scanner(System.in);
        System.out.println("Introduce tu nombre, profesión y Pais: ");
        String Informacion = Teclado.nextLine();
        String[] Separacion = Informacion.split(" ");
        String nombre = Separacion[0];
        String may = nombre.toUpperCase();
        String profesion = Separacion[1];
        String may2 = profesion.toUpperCase();
        String Pais = Separacion[2];
        String may3 = Pais.toUpperCase();
        System.out.println("Nombre: " + may );
        System.out.println("Profesión: " + may2);
        System.out.println("Pais: " + may3);

    }
}
