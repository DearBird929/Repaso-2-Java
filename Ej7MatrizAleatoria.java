/* Crea una matriz 3x3, llénala con números 
aleatorios y muéstrala en pantalla. */

import java.util.Random; //hecho con ia

public class Ej7MatrizAleatoria {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3]; // Matriz 3x3
        Random random = new Random(); // Generador de números aleatorios

        // Llenar la matriz con números aleatorios del 1 al 100
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = random.nextInt(100) + 1;
            }
        }

        // Mostrar la matriz en pantalla
        System.out.println("Matriz generada:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t"); // Tabulación para separar los números
            }
            System.out.println(); // Salto de línea después de cada fila
        }
    }
}

