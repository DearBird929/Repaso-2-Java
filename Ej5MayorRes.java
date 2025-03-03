public class Ej5MayorRes {
    public static void main(String[] args) {
        int[] numeros = Util.leerArray(5);  // Pide los 5 números
        int mayor = Util.encontrarMayor(numeros);  // Encuentra el mayor
        System.out.println("El número mayor es: " + mayor);
    }
}

