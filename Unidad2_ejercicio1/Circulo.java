
package Unidad2_ejercicio1;

public class Circulo extends Figura {
    
    private final double PI = Math.PI;
    private double radio;

    public Circulo(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }
   
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getPI() {
        return PI;
    }

    @Override
    public double calcularArea() {
        return this.PI*this.radio*this.radio;
    }
    
}
