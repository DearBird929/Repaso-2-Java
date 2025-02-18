/* Pide al usuario un número N y muestra solo los números pares hasta N. */

import java.util.Scanner; // Importamos el scanner

public class Ej3Pares { //Nombre del projecto
    public static void main (String [] args) {
        Scanner leerDatos = new Scanner(System.in); // creamos el scanner y le asignamos un nombre
        System.out.println("Dame el número "); 
        int n1 = leerDatos.nextInt();

        for (int i = 1; i <= n1; i++) { //Creamos un bucle en el que cremos una nueva variable, si esa variable es menor o igual a 1 le sumamos 1
            if (i % 2 == 0) { //Si el número asignado es dividido entre 2 y el resto da 0 pasa algo, si no no
                System.out.println(i);
            } 
        }
        leerDatos.close(); //Cerramos el Scanner
    }
}
