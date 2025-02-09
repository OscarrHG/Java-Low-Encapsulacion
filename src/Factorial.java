public class Factorial {
    public static void main(String[] args) {
        int number = 5; // Cambia este número para calcular el factorial de otro valor
        int result = factorial(number);
        System.out.println("El factorial de " + number + " es " + result);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1; // Caso base: el factorial de 0 es 1
        } else {
            return n * factorial(n - 1); // Llamada recursiva
        }

    }
    }
