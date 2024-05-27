package Unidad1_ejercicio1;

import java.util.Scanner;

public class Aplicacion {

    public static void main(String[] args) {
        
        Scanner cargarDato = new Scanner(System.in);
        
        int contadorEmpleados = 0;
        
        empleado emp1 =  new empleado("Juan Jose Alvarez", 35, 650000);
        empleado emp2 =  new empleado("Jesica Gonzalez", 31, 680000);
        
        System.out.println(" Informacion del empleado 1:  " + emp1.getNombre() + ". Su edad: " +emp1.getEdad() + " años. Y su sueldo neto: $ " + emp1.getSueldo());
        contadorEmpleados++;
        System.out.println(" Informacion del empleado 2:  " + emp2.getNombre() + ". Su edad: " +emp2.getEdad() + " años. Y su sueldo neto: $ " + emp2.getSueldo());
        contadorEmpleados++;
        System.out.println("");

        empleado emp3 = new empleado();

        System.out.print("Introduzca el nombre del 3er empleado: ");
        emp3.setNombre(cargarDato.nextLine());
        System.out.println("");

        System.out.print("Introduzca la edad del 3er empleado: ");
        emp3.setEdad(cargarDato.nextInt());
        System.out.println("");

        System.out.print("Introduzca el sueldo del 3er empleado: ");
        emp3.setSueldo(cargarDato.nextInt());
        System.out.println("");

        cargarDato.nextLine();
        
        System.out.println(" Informacion del empleado 3:  " + emp3.getNombre() + ". Su edad: " +emp3.getEdad() + " años. Y su sueldo neto: $ " + emp3.getSueldo());

    }
}