
package Unidad3_ejercicio2_figurasGeometricas;


public class Cuadrado  extends Figura {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
        }
    }