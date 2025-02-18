/* Pide un número al usuario y muestra los números del 1 hasta ese número */

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        System.out.println("Dime un número ");
        int n1 = leerDatos.nextInt();

        for (int i = 1; i <= n1; i++) {
            System.out.println(i);
        }
        leerDatos.close();
    }
}
