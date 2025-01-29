public class Vehiculos {
    private String marca = "audi";
    private int anio = 2025;

    void datosVehiculo(){
        System.out.println("Marca: " + marca +
                        "\nAño: " + anio);
    }

    public static void main(String[] args) {
        Vehiculos auto = new Vehiculos();
        auto.datosVehiculo();
    }
}
