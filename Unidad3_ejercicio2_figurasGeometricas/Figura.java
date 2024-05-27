package Unidad3_ejercicio2_figurasGeometricas;

// Clase abstracta Figura.java
public abstract class Figura implements Relacionable {
    
public abstract double calcularArea();

    @Override
    public boolean esMayor(Object o) {
        if (o instanceof Figura) {
            Figura otra = (Figura) o;
            return this.calcularArea() > otra.calcularArea();
        }
        return false;
    }

    @Override
    public boolean esMenor(Object o) {
        if (o instanceof Figura) {
            Figura otra = (Figura) o;
            return this.calcularArea() < otra.calcularArea();
        }
        return false;
    }

    @Override
    public boolean esIgual(Object o) {
        if (o instanceof Figura) {
            Figura otra = (Figura) o;
            return this.calcularArea() == otra.calcularArea();
        }
        return false;
    }
}