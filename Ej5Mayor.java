/* Pide al usuario 5 números y muestra cuál es el mayor. */

import java.util.Scanner;

public class Ej5Mayor {
    public static void main (String [] args) {
        Scanner leerDatos = new Scanner(System.in);
            int[] n1 = new int[5];

            for (int i = 0; i < n1.length; i++) {
                System.out.println("Dame el " + (i + 1) + "º número");
                n1[i] = leerDatos.nextInt();
            }

            int mayor = n1[0];
            for (int i = 1; i < n1.length; i++) {
                if (n1[i] > mayor) {
                    mayor = n1[i];
                }
            }
            System.out.println("El número mayor es: " + mayor);
        leerDatos.close(); //no tenia ni puta idea de lo que estoy haciendo asi que lo pase por la ia xd
    }
}