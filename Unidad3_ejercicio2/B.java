package Unidad3_ejercicio2;

// EN ESTA APLICACION SE UTILIZA LOS OPERADORES COMPARATIVOS compareTo, equalsTo

public class B implements Relacionable {
    private String nombre;

    public B(String nombre) {
        this.nombre = nombre;
    }

    // POLIMORFISMO -> implementa los metodos de la INTERFAZ -> Relacionable
    @Override
    // se define el tipo de dato que se quiere obtener por el metodo esMayor(se pasa un OBJETO nombreObjeto -> o)
    public boolean esMayor(Object o) {
        // Se compara los valores-> nombreObjeto recorrePorMetodo a la Clase B
        if (o instanceof B) {
            // SE INSTANCIA la variable-> otro
            B otro = (B) o;
            // Devolvemos valor true/false al utilizar el metodo comareTo
            return this.nombre.compareTo(otro.nombre) > 0;
        }
        return false;
    }

    // POLIMORFISMO -> implementa los metodos de la INTERFAZ -> Relacionable
    @Override
    public boolean esMenor(Object o) {
        // Se compara los valores-> nombreObjeto recorrePorMetodo a la Clase B
        if (o instanceof B) {
            // SE INSTANCIA la variable-> otro
            B otro = (B) o;
            // Devolvemos valor true/false al utilizar el metodo comareTo
            return this.nombre.compareTo(otro.nombre) < 0;
        }
        return false;
    }

    // POLIMORFISMO -> implementa los metodos de la INTERFAZ -> Relacionable
    @Override
    public boolean esIgual(Object o) {
        // Se compara los valores-> nombreObjeto recorrePorMetodo a la Clase B
        if (o instanceof B) {
            // SE INSTANCIA la variable-> otro
            B otro = (B) o;
            // Devolvemos valor true/false al utilizar el metodo equals
            return this.nombre.equals(otro.nombre);
        }
        return false;
    }
}