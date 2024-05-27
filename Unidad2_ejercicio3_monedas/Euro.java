package Unidad2_ejercicio3_monedas;

public class Euro extends Moneda {

    public Euro(float valor, float cotizacion) {
        super(valor, cotizacion);
    }
    
    @Override
    public String toString() {
    return "La cotizacion 1 EURO -> Pesos Argentinos: ar$ " + cotizacion + ". Usted ha ingresado: EUROS " + valor;
    }
    
}