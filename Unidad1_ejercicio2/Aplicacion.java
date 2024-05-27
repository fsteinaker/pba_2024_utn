package Unidad1_ejercicio2;

import java.util.Scanner;

public class Aplicacion {
    //ENCAPSULAMIENTO static Clase->empleado[] NombreArray;
    private static empleado[] Empleados; // Declaramos el array donde se almacena empleados

    public static void main(String[] args) {
        Scanner cargarDato = new Scanner(System.in); // Iniciamos el SCANNER

        System.out.print("Introduzca el numero maximo de empleados: ");
        // tipoDato NombreVariable = nombreMetodoScanner.metodoJava();
        int maximoEmpleados = cargarDato.nextInt();
        System.out.println("");
        // NombreArray = NEW Clase->empleado[valor NombreVariable]
        Empleados = new empleado[maximoEmpleados]; // Inicializar el array estático

        int i = 0; // Iniciamos el contador
        
        while (i < maximoEmpleados) {
            empleado emp = new empleado(); // CREAMOS UN NUEVO OBJETO EMPLEADO
            cargarDato.nextLine(); // Consumir la nueva línea

            System.out.print("Introduzca el nombre del empleado: ");
            String nombre = cargarDato.nextLine();
            // if -> nombreVariable.metodoJava() -> esta vacio?
            if (nombre.isEmpty()) {
                System.out.println("");
                System.out.println("------------------------------------------------------");
                System.out.println("ERROR: No puede introducir valores vacios en el nombre");
                System.out.println("------------------------------------------------------");
                break;
            }
            // VariableEmpleado.metodoSetClaseEmpleado(valorVariable_Ingresada_Nombre)
            emp.setNombre(nombre);
            System.out.println("");

            System.out.print("Introduzca la edad del empleado: ");
            int edad = cargarDato.nextInt();
            if (edad < 0 ) {
                System.out.println("-------------------------------------------------------");
                System.out.println("ERROR: No puede introducir valores negativos en la edad");
                System.out.println("-------------------------------------------------------");
                break;
            }
            // VariableEmpleado.metodoSetClaseEmpleado(valorVariable_Ingresada_Edad)
            emp.setEdad(edad);
            System.out.println("");

            System.out.print("Introduzca el sueldo del empleado: ");
            int sueldo = cargarDato.nextInt();
            if (sueldo < 0) {
                System.out.println("---------------------------------------------------------");
                System.out.println("ERROR: No puede introducir valores negativos en el sueldo");
                System.out.println("---------------------------------------------------------");
                break;
            }
            // VariableEmpleado.metodoSetClaseEmpleado(valorVariable_Ingresada_Sueldo)
            emp.setSueldo(sueldo);
            System.out.println("");

            // NombreArray[Indice] = variableEmpleado
            Empleados[i] = emp;
            // Se llama al metodo (abajo) mostrarEmpleado(indice)
            mostrarEmpleado(i);
            //Acomulamos valor indice
            i++;
        }
        cargarDato.close(); // Cerrar el Scanner
    }

    // Metodo -> mostrarEmpleado(indice)
    public static void mostrarEmpleado(int i) {
        empleado emp = Empleados[i];
        System.out.println("Informacion del empleado " + (i + 1) + ": " + emp.getNombre() + ". Su edad: " + emp.getEdad() + " anios. Y su sueldo neto: $ " + emp.getSueldo());
    }
}