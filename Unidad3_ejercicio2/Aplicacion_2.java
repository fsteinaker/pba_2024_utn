package Unidad3_ejercicio2;

public class Aplicacion_2 {
    public static void main(String[] args) {
        B objeto1 = new B("Hola");
        B objeto2 = new B("Adios");

        System.out.println("¿objeto1 es mayor que objeto2? " + objeto1.esMayor(objeto2));
        System.out.println("¿objeto1 es menor que objeto2? " + objeto1.esMenor(objeto2));
        System.out.println("¿objeto1 es igual a objeto2? " + objeto1.esIgual(objeto2));
    }
}