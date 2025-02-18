/* Pide al usuario dos números y una operación (+, -, *, /) y muestra el resultado */
import java.util.Scanner;

public class L2Ejercicio1 {
    public static void main (String [] args) {
        Scanner leerDatos = new Scanner(System.in);

        System.out.println("Dame el primer número");
        int n1 = leerDatos.nextInt();
        System.out.println("Dame el segundo número");
        int n2 = leerDatos.nextInt();

        System.out.println("Ahora elige que prefieres hacer \n 1. Sumar \n 2. Restar \n 3. Multiplicar \n 4. Dividir");
        int opcion = leerDatos.nextInt();

        switch (opcion) {
            case 1:
                int n3 = n1+n2;
                System.out.println("El resultado de sumar " + n1 + " + " + n2 + " es = " + n3);
                break;
            case 2:
                int n4 = n1-n2;
                System.out.println("El resultado de restar " + n1 + " - " + n2 + " es = " + n4);
                break;
            case 3:
                int n5 = n1*n2;
                System.out.println("El resultado de multiplicar " + n1 + " * " + n2 + " es = " + n5);
                break;
            case 4:
                int n6 = n1/n2;
                int n7 = n1%n2;
                System.out.println("El resultado de dividir " + n1 + " / " + n2 + " es = " + n6 + " y su resto es = " + n7);
                break;
            default:
            System.out.println("No es una opción valida");
                break;
        }
        leerDatos.close();
    }
}
