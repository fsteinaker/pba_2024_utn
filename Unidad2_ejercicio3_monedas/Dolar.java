
package Unidad2_ejercicio3_monedas;


public class Dolar extends Moneda {

    public Dolar(float valor, float cotizacion) {
        super(valor, cotizacion);
    }
    
    @Override
    public String toString() {
    return "La cotizacion 1 Dolar -> Pesos Argentinos: ar$ " + cotizacion + ". Usted ha ingresado: u$s " + valor;
    }
    
}
