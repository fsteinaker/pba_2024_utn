package Unidad2_ejercicio1;

public class Triangulo extends Figura {
    
    private double base;
    private double altura;

    public Triangulo(double base, double altura, String nombre) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    @Override
    public double calcularArea() {
        return (this.base * this.altura) / 2;
    }
    
}
