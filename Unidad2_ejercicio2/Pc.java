package Unidad2_ejercicio2;

public class Pc extends Computadora {

    public Pc(String marca, String modelo) {
        super(marca, modelo);
    }
    
    @Override
    public String toString() {
    return "PC: " + marca + " - Modelo: " + modelo;
    }
}
