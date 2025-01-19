package Paquete2;

import Paquete1.Animal;

public class Gato{
    public static void main(String[] args) {
        Animal g1 = new Animal();
        g1.camina();
        g1.maulla();
        System.out.println("Nombre: " + g1.nombre);
    }
}
