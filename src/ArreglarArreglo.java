import java.util.Arrays;

public class ArreglarArreglo {
    public static void main(String[] args) {
        /*SE TE DA UN ARREGLO DE 'N' ENTEROS DISTINTOS
        * QUE CONTIENEN TODOS LOS  NUMEROS DEL '0' A UN
        * NUMERO 'N' PERO FALTA UN NUMERO, EL CUAL DEBES
        * ENCONTRAR, APLICA TU LOGICA NECESARIA*/

        int[] arr = new int[]{0, 5, 3, 7, 9, 1, 2, 8, 6, 10};

        int sumaEsp = (arr.length * (arr.length + 1)) / 2;
        int sumaAct = 0;
        for (int numero : arr) {
            sumaAct = sumaAct + numero;
        }

        System.out.println("El arreglo es: " + Arrays.toString(arr));
        System.out.println("Numero faltante es: " + (sumaEsp - sumaAct));
    }
}
