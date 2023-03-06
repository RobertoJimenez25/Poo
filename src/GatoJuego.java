import java.util.Scanner;
    public class GatoJuego {
        public static void main(String[] args){

            Scanner teclado = new Scanner(System.in);
            System.out.print("Introduce la cadena de 9 caracteres utilizando solamente (X, O, _):");
            String Caracter = teclado.nextLine();

            if (Caracter.length() != 9) {
                System.out.println("La cadena debe tener exactamente 9 caracteres.");
                return;
            }

            for (char c : Caracter.toCharArray()) {
                if (c != 'X' && c != 'O' && c != '_') {
                    System.out.println("La cadena solo puede contener los caracteres X, O, _.");
                    return;
                }
            }
            System.out.println(Caracter);
            System.out.println("_____");
            System.out.println("|" + Caracter.charAt(0) + Caracter.charAt(1) + Caracter.charAt(2) + "|");
            System.out.println("|" + Caracter.charAt(3) + Caracter.charAt(4) + Caracter.charAt(5) + "|");
            System.out.println("|" + Caracter.charAt(6) + Caracter.charAt(7) + Caracter.charAt(8) + "|");
            System.out.println("-----");
        }
    }

