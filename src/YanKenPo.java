import java.util.Random;
import java.util.Scanner;

public class YanKenPo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random rd = new Random();
        String ele;
        boolean entradaValida;
        String[] opciones = {"piedra", "papel", "tijera"};

        do {
            System.out.println("Elige: piedra, papel o tijera");
            ele = entrada.next().toLowerCase();
            entradaValida = validar(ele, opciones);

            if (!entradaValida) {
                System.out.println("Entrada no válida. Intenta de nuevo.");
            }
        } while (!entradaValida);

        int compu = rd.nextInt(3);
        String ale = opciones[compu];

        System.out.println("La computadora eligió: " + ale);

        if (ele.equals(ale)) {
            System.out.println("Empate... Intenta de nuevo");
        } else if ((ele.equals("piedra") && ale.equals("tijera")) ||
                (ele.equals("papel") && ale.equals("piedra")) ||
                (ele.equals("tijera") && ale.equals("papel"))) {
            System.out.println("¡Player Ganó!");
        } else {
            System.out.println("Compu Ganó");
        }
    }

    public static boolean validar(String eleccion, String[] opciones) {
        for (String opcion : opciones) {
            if (eleccion.equals(opcion)) {
                return true;
            }
        }
        return false;
    }
}
