package Unidad3_ejercicio3;

import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos del arreglo: ");
        int n = scanner.nextInt();

        double[] valores = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            valores[i] = scanner.nextDouble();
        }

        ArrayReales arrayReales = new ArrayReales(valores);

        boolean salir = false;
        while (!salir) {
            System.out.println("\nSeleccione una opcion:");
            System.out.println("1. Calcular minimo");
            System.out.println("2. Calcular maximo");
            System.out.println("3. Calcular sumatorio");
            System.out.println("4. Salir");
            System.out.println("");
            System.out.print("Opcion: ");
            int opcion = scanner.nextInt();
            System.out.println("");
            
            switch (opcion) {
                case 1:
                    System.out.println("Minimo: " + arrayReales.minimo());
                    System.out.print("Presione ENTER para continuar ");
                    // Espera a que el usuario presione la tecla ENTER
                    scanner.nextLine(); 
                    scanner.nextLine();
                    break;
                case 2:
                    System.out.println("Maximo: " + arrayReales.maximo());
                    System.out.print("Presione ENTER para continuar ");
                    // Espera a que el usuario presione la tecla ENTER
                    scanner.nextLine(); 
                    scanner.nextLine();
                    break;
                case 3:
                    System.out.println("Sumatorio: " + arrayReales.sumatorio());
                    System.out.print("Presione ENTER para continuar ");
                    // Espera a que el usuario presione la tecla ENTER
                    scanner.nextLine(); 
                    scanner.nextLine();
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("");
                    System.out.println("Opcion no valida. Por favor, intente de nuevo.");
                    System.out.println("");
            }
        }

        scanner.close();
        System.out.println("");
        System.out.println("Aplicacion finalizada.");
        System.out.println("");
    }
}
