
package Unidad2_ejercicio3_monedas;

abstract class Moneda {
    protected float valor;
    protected float cotizacion;

    public Moneda(float valor, float cotizacion) {
        this.valor = valor;
        this.cotizacion = cotizacion;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(float cotizacion) {
        this.cotizacion = cotizacion;
    }


    
}