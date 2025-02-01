package JavaTime;

import java.time.LocalTime;

public class Tiempo {
    public static void main(String[] args) {
        LocalTime hora = LocalTime.now();
        System.out.println("Hora Actual: " + hora);

        LocalTime horae = LocalTime.of(14,30,3);
        System.out.println("Hora dream: " + horae);
        //31-01
    }
}
