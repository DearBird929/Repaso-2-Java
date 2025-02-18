/* Pide al usuario 5 números y guárdalos en un array. Luego, muéstralos. */

import java.util.Scanner; // SIN TERMINAR

public class Ej4Lista {
    public static void main (String [] args) {
        Scanner leerDatos = new Scanner(System.in);
        int[] n1 = new int[5];

        for (int i = 1; i < n1.length; i++)
        {
            System.out.println("Dame un número ");
            n1[i] = leerDatos.nextInt();
        }
        leerDatos.close();
    }
}
