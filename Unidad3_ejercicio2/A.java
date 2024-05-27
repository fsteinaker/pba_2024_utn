package Unidad3_ejercicio2;

// EN ESTA APLICACION SE UTILIZA LOS OPERADORES COMPARATIVOS TRADICIONALES >, >=, <, <=, ==

public class A implements Relacionable {
 private int valor;

    public A(int valor) {
        this.valor = valor;
    }

    // POLIMORFISMO -> implementa los metodos de la INTERFAZ -> Relacionable
    @Override
   // se define el tipo de dato que se quiere obtener por el metodo esMayor(se pasa un OBJETO nombreObjeto -> o)
    public boolean esMayor(Object o) {
        // Se compara los valores-> nombreObjeto recorrePorMetodo a la Clase A
        if (o instanceof A) {
            // SE INSTANCIA la variable-> otro
            A otro = (A) o;
            return this.valor > otro.valor;
        }
        return false;
    }

    // POLIMORFISMO -> implementa los metodos de la INTERFAZ -> Relacionable
    @Override
    // se define el tipo de dato que se quiere obtener por el metodo esMenor(se pasa un OBJETO nombreObjeto -> o)
    public boolean esMenor(Object o) {
        // Se compara los valores-> nombreObjeto recorrePorMetodo a la Clase A
        if (o instanceof A) {
            // SE INSTANCIA la variable-> otro
            A otro = (A) o;
            return this.valor < otro.valor;
        }
        return false;
    }

    // POLIMORFISMO -> implementa los metodos de la INTERFAZ -> Relacionable
    @Override
    // se define el tipo de dato que se quiere obtener por el metodo esIgual(se pasa un OBJETO nombreObjeto -> o)
    public boolean esIgual(Object o) {
        // Se compara los valores-> nombreObjeto recorrePorMetodo a la Clase A
        if (o instanceof A) {
            // SE INSTANCIA la variable-> otro
            A otro = (A) o;
            return this.valor == otro.valor;
        }
        return false;
    }
}