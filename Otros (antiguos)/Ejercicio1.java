/* Crea un programa que pida al usuario su nombre y lo salude */
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        System.out.println("Dime como te llamas");
        
        String nombre = leerDatos.nextLine();

        System.out.println("Buenas " + nombre + ", ten un buen dia.");
        leerDatos.close();
    }
}