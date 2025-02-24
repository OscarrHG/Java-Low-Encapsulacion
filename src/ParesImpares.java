import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ParesImpares {
    public static void main(String[] args) {
        /*Escribe un programa en Java que pida al usuario un número entero N
        y luego imprima todos los números pares e impares desde 0 hasta N.

        Requisitos:
        Usa Scanner para leer el número desde la consola.
        Usa un bucle for para recorrer los números del 0 a N.
        Usa un condicional if para separar los pares e impares.*/

        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        System.out.print("Ingresa un numero: ");
        int limite = entrada.nextInt();
        entrada.close();

        for (int i = 0; i <= limite; i++) {
            if (i%2 == 0) pares.add(i);
            else impares.add(i);
        }

        System.out.println("Numeros Pares hasta " + limite + ": " + pares);
        System.out.println("Numeros Impares hasta " + limite + ": " + impares);
    }
}
