package JavaTime;

import java.time.LocalDate;

public class Calendario {
    public static void main(String[] args) {
        //obtener la fecha actual
        LocalDate fecha = LocalDate.now();
        System.out.println("Fecha actual: " + fecha);

        //fecha especifica
        LocalDate fechae = LocalDate.of(2024,4,26);
        System.out.println("Fecha dream: " + fechae);

        //obtener info de fecha
        int diaFecha = fecha.getDayOfMonth();
        System.out.println("Dia: " + diaFecha);
        int mesFecha = fecha.getMonthValue();
        System.out.println("Mes: " + mesFecha);
        int anioFecha = fecha.getYear();
        System.out.println("Año: " + anioFecha);

        //Sumar, restar dias mese años
        LocalDate proxSemana = fecha.plusWeeks(2);
        System.out.println("Fecha prox semana: " + proxSemana);
        LocalDate ultimoMes = fecha.minusMonths(1);
        System.out.println("Fecha prox semana: " + ultimoMes);
    }
}
