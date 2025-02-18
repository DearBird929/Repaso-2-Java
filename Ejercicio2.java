/* Pide al usuario un número y dile si es par o impar */
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        System.out.println("Introduce el número: ");

        int numero = leerDatos.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Si, el número " + numero + " es par");
        } else {
            System.out.println("No, el número " + numero + " es impar");
        }
        leerDatos.close();
    }
}
