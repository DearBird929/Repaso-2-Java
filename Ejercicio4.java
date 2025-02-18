/* Genera un número aleatorio entre 1 y 10 y deja que el usuario intente adivinarlo */

import java.util.Scanner;

public class Ejercicio4 {
    public static void main (String [] args) {
        Scanner leerDatos = new Scanner(System.in);
        System.out.println("Introduce el primer número ");
        int n1 = (int)(Math.random() * 10) + 1;
        int n2 = leerDatos.nextInt();

        while (n1 != n2) {
            if (n1 > n2) {
                System.out.println("Fallo, el número es mayor, prueba de nuevo");
            } else {
                System.out.println("Fallo, el número es menor, prueba de nuevo");
            }
            n2 = leerDatos.nextInt();
        }
        System.out.println("Lo has adivinado, el número era " + n1);
        leerDatos.close();
    }
}
