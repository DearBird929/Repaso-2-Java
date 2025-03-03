/* Crea una matriz 3x3 y muestra su 
versión transpuesta (intercambiando 
filas por columnas). */

import java.util.Scanner;
import java.util.Random;

public class Ej8MatrizTranspuesta {
    public static void main (String [] args) {
        int[][] matriz = new int[3][3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = random.nextInt(100) + 1;
            }
        }

        System.out.println("Matriz generada: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Matriz invertida: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[j][i] + "\t");
            }
            System.out.println();
        }
    }
}
