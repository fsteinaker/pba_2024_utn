package Unidad3_ejercicio3;

public class ArrayReales implements Estadisticas {
    private double[] array;

    // Constructor
    public ArrayReales(double[] array) {
        this.array = array;
    }

    // Implementación del método minimo
    @Override
    public double minimo() {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("El array está vacío o es nulo");
        }
        double min = array[0];
        for (double num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Implementación del método maximo
    @Override
    public double maximo() {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("El array está vacío o es nulo");
        }
        double max = array[0];
        for (double num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Implementación del método sumatorio
    @Override
    public double sumatorio() {
        if (array == null) {
            throw new IllegalArgumentException("El array es nulo");
        }
        double sum = 0.0;
        for (double num : array) {
            sum += num;
        }
        return sum;
    }
}