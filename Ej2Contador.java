/* Pide al usuario un número N y muestra los números del 1 al N. */

import java.util.Scanner;

public class Ej2Contador {
    public static void main (String [] args) {
        Scanner leerDatos = new Scanner(System.in);
        System.out.println("Dame el número que quieras: ");
        int n1 = leerDatos.nextInt();

        for (int i = 1; i <= n1; i++) {
            System.out.println(i);
        }
        leerDatos.close();
    }
}
