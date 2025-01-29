package Inmutabilidad;

//definir clase con final para hacerla inmutable
public final class Persona {
    private final String nombre; // Atributos inmutable
    private final int edad;
    private final double sueldo;

    public Persona(String nombre, int edad, double sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public double getSueldo(){
        return  sueldo;
    }

    public static void main(String[] args) {

    }
}
