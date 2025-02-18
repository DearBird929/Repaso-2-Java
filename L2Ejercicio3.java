/* Pide al usuario un número N y muestra solo los números pares hasta N. */

import java.util.Scanner;

public class L2Ejercicio3 {
    public static void main (String [] args) {
        Scanner leerDatos = new Scanner(System.in);
        System.out.println("Dame el número ");
        int n1 = leerDatos.nextInt();

        for (int i = 1; i <= n1; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            } 
        }
        leerDatos.close();
    }
}
