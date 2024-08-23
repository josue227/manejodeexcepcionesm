import java.util.Scanner;

class NumeroNegativoExcepcion extends Exception {
    public NumeroNegativoExcepcion() {
        System.out.println("Los numeros negativos no pueden ser utilizados.");
    }

    public NumeroNegativoExcepcion(String mensaje) {
        System.out.println(mensaje);
    }
}

// Programa para probar la excepción
public class PruebaExcepcion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        double numero = scanner.nextDouble();

        try {
            // Verifica si el número es negativo
            if (numero < 0) {
                throw new NumeroNegativoExcepcion("el numero ingresado es" + numero + " es un valor negativo.");
            } else {
                // Calcula e imprimi la raíz cuadrada
                double raiz = Math.sqrt(numero);
                System.out.println("La raíz cuadrada del numero " + numero + " es: " + raiz);
            }
        } catch (NumeroNegativoExcepcion e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
