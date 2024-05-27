package Unidad2_ejercicio3_monedas;

import java.util.Scanner;

public class Aplicacion {

    private static float cotizacionDolar = 0;
    private static float cotizacionEuro = 0;
    private static boolean cotizacionesIngresadas = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Inicializamos la variable BOOLEANA -> en FALSE
        boolean salir = false;

        while (!salir) {
            System.out.println("");
            System.out.println("------------------------------------");
            System.out.println("       Seleccione una opcion:       ");
            System.out.println("------------------------------------");
            System.out.println("1) Ingresar valores de cotizacion");
            System.out.println("2) Convertir a Dolar");
            System.out.println("3) Convertir a Euro");
            System.out.println("4) Convertir a ambas");
            System.out.println("5) Salir");
            
            System.out.println("");
            System.out.print("Seleccione opcion: ");
            int opcion = scanner.nextInt();
            System.out.println("");

            switch (opcion) {
                case 1:
                    ingresarCotizaciones(scanner);
                    break;
                case 2:
                    if (cotizacionesIngresadas) {
                        convertirDolar(scanner);
                    } else {
                        System.out.println("ERROR: primero debe ingresar las cotizaciones.");
                        mensaje(scanner);
                    }
                    break;
                case 3:
                    if (cotizacionesIngresadas) {
                        convertirEuro(scanner);
                    } else {
                        System.out.println("ERROR: primero debe ingresar las cotizaciones.");
                        mensaje(scanner);
                    }
                    break;
                case 4:
                    if (cotizacionesIngresadas) {
                        convertirAmbos(scanner);
                    } else {
                        System.out.println("ERROR: primero debe ingresar las cotizaciones.");
                        mensaje(scanner);
                    }
                    break;
                case 5:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("ERROR: usted no ha seleccionado una opcion disponible.");
                    mensaje(scanner);
            }
        }
        scanner.close();
    }

    private static void mensaje(Scanner scanner) {
        System.out.print("Presione ENTER para continuar. ");
        scanner.nextLine(); // CAPTURA EL BLANCO QUE QUEDA PENDIENTE
        scanner.nextLine(); // ESPERA QUE EL USUARIO PRESIONE LA TECLA ENTER
    }
    
    private static void ingresarCotizaciones(Scanner scanner) {
        System.out.print("Ingrese la cotizacion del Dolar: ");
        cotizacionDolar = scanner.nextFloat();
        System.out.print("Ingrese la cotizacion del Euro: ");
        cotizacionEuro = scanner.nextFloat();
        cotizacionesIngresadas = true;
        System.out.println("Cotizaciones actualizadas.");
        mensaje(scanner);
    }

    private static void convertirDolar(Scanner scanner) {
        System.out.print("Ingrese la cantidad en pesos argentinos: ");
        float pesos = scanner.nextFloat();
        Dolar dolar = new Dolar(pesos / cotizacionDolar, cotizacionDolar);
        System.out.println(dolar);
        mensaje(scanner);
    }

    private static void convertirEuro(Scanner scanner) {
        System.out.print("Ingrese la cantidad en pesos argentinos: ");
        float pesos = scanner.nextFloat();
        Euro euro = new Euro(pesos / cotizacionEuro, cotizacionEuro);
        System.out.println(euro);
        mensaje(scanner);
    }

    private static void convertirAmbos(Scanner scanner) {
        System.out.print("Ingrese la cantidad en pesos argentinos: ");
        float pesos = scanner.nextFloat();
        Dolar dolar = new Dolar(pesos / cotizacionDolar, cotizacionDolar);
        Euro euro = new Euro(pesos / cotizacionEuro, cotizacionEuro);
        System.out.println(dolar);
        System.out.println(euro);
        mensaje(scanner);
    }
}