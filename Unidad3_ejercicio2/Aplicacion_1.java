package Unidad3_ejercicio2;

public class Aplicacion_1 {
    public static void main(String[] args) {
        A objeto1 = new A(5);
        A objeto2 = new A(10);

        System.out.println("Objeto1 es mayor que objeto2? " + objeto1.esMayor(objeto2));
        System.out.println("Objeto1 es menor que objeto2? " + objeto1.esMenor(objeto2));
        System.out.println("Objeto1 es igual a objeto2? " + objeto1.esIgual(objeto2));
    }
}