
package Unidad3_ejercicio1;

public class Auto implements Conducible {
    public String marca;
    public String modelo;
    public boolean estaAndando;

    @Override
    public void arrancar() {
        // EJEMPLO DE POLIMORFISMO: MetodoPadre(vacio) -> MetodoHijo(modificado)
        System.out.println("");
        System.out.println("El auto ARRANCO.");
        System.out.println("");
    }

    @Override
    public void conducir(int distancia) {
        // EJEMPLO DE POLIMORFISMO: MetodoPadre(vacio) -> MetodoHijo(modificado)
        System.out.println("El auto condujo una distancia de " + distancia + " km's");
        System.out.println("");
    }

    @Override
    public void detener() {
        // EJEMPLO DE POLIMORFISMO: MetodoPadre(vacio) -> MetodoHijo(modificado)
        System.out.println("El auto SE DETUVO.");
    } 
    
    public boolean estaAndando() {
        return estaAndando;
    }

    // METODO AUTONOMO -> NO HEREDADO (no es polimorfismo)
    // Se agregó el método setEstaAndando para cambiar el estado del auto y para imprimir el estado.
    public void setEstaAndando(boolean estaAndando) {
        this.estaAndando = estaAndando;
        if (estaAndando) {
            // VALOR TRUE
            System.out.println("El auto ESTA ANDANDO.");
        } else {
            // VALOR FALSE
            System.out.println("El auto NO ESTA ANDANDO.");
        }
    }
}