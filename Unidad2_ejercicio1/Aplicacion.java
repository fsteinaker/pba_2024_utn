
package Unidad2_ejercicio1;

public class Aplicacion {

    public static void main(String[] args) {
        Circulo c1 = new Circulo(44.55, "Mi círculo");
        Rectangulo r1 = new Rectangulo(30, 40, "Mi rectángulo");
        Triangulo t1 = new Triangulo(50, 70, "Mi triángulo");
        
        Figura figuras[] = new Figura[100];
        
        figuras[0]=c1;
        figuras[1]=r1;
        figuras[2]=t1;
        
        for(int i=0; i<3; i++)
            System.out.println("El área de " + figuras[i].getNombre() + " es " + figuras[i].calcularArea());
        
        /* el for de arriba reemplaza este código comentado
        System.out.println("El área de " + c1.getNombre() + " es " + c1.calcularArea());
        System.out.println("El área de " + r1.getNombre() + " es " + r1.calcularArea());
        System.out.println("El área de " + t1.getNombre() + " es " + t1.calcularArea());
        */
    }
    
}
