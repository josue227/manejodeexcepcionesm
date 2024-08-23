import java.util.Scanner;

public class Main {

    public static char caracterEn(String cadena, int posicion) throws Exception {
        if (posicion >= 0 && posicion < cadena.length()) {
            return cadena.charAt(posicion);
        } else {
            throw new Exception("La edentidad " + posicion + " está fuera del rango que permite la cadena.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Agregue un texto: ");
        String lectTeclado = scanner.nextLine();

        try {
            char resultado = caracterEn(lectTeclado, 7);
            System.out.println("El caracter en el lugar numero 7 es: " + resultado);
        } catch (Exception e) {
            System.out.println("Has intentado recuperar una posición de la cadena de caracteres que no existe.");
        }

        scanner.close();
    }
}