
package Unidad3_ejercicio1;

public class Moto implements Conducible {

@Override
    public void arrancar() {
        // EJEMPLO DE POLIMORFISMO: MetodoPadre(vacio) -> MetodoHijo(modificado)
        System.out.println("");
        System.out.println("La moto ARRANCO.");
        System.out.println("");
    }

    @Override
    public void conducir(int distancia) {
        // EJEMPLO DE POLIMORFISMO: MetodoPadre(vacio) -> MetodoHijo(modificado)
        System.out.println("La moto condujo una distancia de " + distancia + " km's");
    }    

    @Override
    public void detener() {
        // EJEMPLO DE POLIMORFISMO: MetodoPadre(vacio) -> MetodoHijo(modificado)
        System.out.println("La moto SE DETUVO.");
    } 
    
}