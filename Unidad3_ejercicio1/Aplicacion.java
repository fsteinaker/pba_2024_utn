package Unidad3_ejercicio1;

import java.util.Scanner;

public class Aplicacion {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Crear una INSTANCIA de Auto y Moto antes de comenzar
        // Clase Instancia = new Clase();
        Auto miAuto = new Auto();
        Moto miMoto = new Moto();
        
        // Inicializamos variables booleanas para recorrer los ciclos WHILE
        boolean estadoAutoVerificado = false;
        boolean distanciaVerificada = false;
        
        System.out.println("----------------------------------------------------");
        System.out.println("BIENVENIDOS A LA APLICACION - EJERCICIO 1 - UNIDAD 3");
        System.out.println("----------------------------------------------------");

        // Verificar el estado del auto
        while (!estadoAutoVerificado) {
            // variableLocal = funcion(variableLocal)
            int arranca = menuEncendido(entrada);
            
            if (arranca == 1) {
                System.out.println("");
                // Pasamos el valor BOOLEANO al metodo setEstaAndando() -> de la CLASE Auto
                miAuto.setEstaAndando(true);
                // SALIMOS DEL CICLO -> WHILE
                estadoAutoVerificado = true;
            } else if (arranca == 2) {
                System.out.println("");
                // Pasamos el valor BOOLEANO al metodo setEstaAndando() -> de la CLASE Auto
                miAuto.setEstaAndando(false);
                // SALIMOS DEL CICLO -> WHILE
                estadoAutoVerificado = true;
            } else {
                // EN CASO DE QUE NO SE PRESIONE LA OPCION SOLICITADA
                System.out.println("");
                System.out.println("ERROR: Por favor vuelva a ingresar la opcion solicitada.");
                System.out.print("Presione ENTER para continuar. ");
                entrada.nextLine(); // CAPTURA EL BLANCO QUE QUEDA PENDIENTE
                entrada.nextLine(); // ESPERA QUE EL USUARIO PRESIONE LA TECLA ENTER
            } // SE VUELVA AL PRINCIPIO DEL WHILE
        }

        // Verificar la distancia recorrida por el auto si esta encendido
        if (miAuto.estaAndando()) {
            while (!distanciaVerificada) {
                distanciaVerificada = autoKilometros(miAuto, entrada);
            }
        } else {
            System.out.println("");
            System.out.println("El auto no esta encendido, no se puede conducir.");
        }
        distanciaVerificada = false; // RESET -> para pasar a verificar la moto
        
        // Verificar la distancia recorrida por la moto
        while (!distanciaVerificada) {
            distanciaVerificada = motoKilometros(miMoto, entrada);
        }
        // SE CIERRA EL INPUT -> ENTRADA
        entrada.close();
    }
    
    private static int menuEncendido(Scanner entrada) {
        System.out.println("");
        System.out.println("El auto se encuentra ENCENDIDO?");
        System.out.println("");
        System.out.println("1. Para confirmar SI");
        System.out.println("2. Para confirmar NO");
        System.out.println("");
        System.out.print("Ingrese la opcion: ");
        return entrada.nextInt();
    }
    
    // METODO en caso de que NO SE HAYA INGRESADO LA DISTANCIA SOLICITADA
    private static void mensajeErrorKms(Scanner entrada) {
        System.out.println("");
        System.out.println("ERROR: Por favor vuelva a ingresar la cantidad de kilometros.");
        System.out.print("Presione ENTER para continuar. ");
        entrada.nextLine(); // CAPTURA EL BLANCO QUE QUEDA PENDIENTE
        entrada.nextLine(); // ESPERA QUE EL USUARIO PRESIONE LA TECLA ENTER
    }
    
    // encapsulamiento STATIC (tipo dato) nombreMetodo(Clase INSTANCIA, Scanner nombreVariableScanner)
    private static boolean autoKilometros(Auto miAuto, Scanner entrada) {
        System.out.println("");
        System.out.print("Ingrese la cantidad de kilometros que recorrio el auto: ");
        int kilometros = entrada.nextInt();
        if (kilometros >= 0) {
            miAuto.arrancar();
            miAuto.conducir(kilometros);            
            miAuto.detener();
            return true; // Distancia válida
        } else {
            // Se invoca al metodo mentajeErrorKms(Scanner entrada)
            mensajeErrorKms(entrada);
            return false; // Distancia no válida, repetir WHILE
        }
    }

    // encapsulamiento STATIC (tipo dato) nombreMetodo(Clase INSTANCIA, Scanner nombreVariableScanner)
    private static boolean motoKilometros(Moto miMoto, Scanner entrada) {
        System.out.println("");
        System.out.print("Ingrese la cantidad de kilometros que recorrio la moto: ");
        int kilometros = entrada.nextInt();
        if (kilometros >= 0) {
            miMoto.arrancar();
            miMoto.conducir(kilometros);
            System.out.println("");
            miMoto.detener();
            System.out.println("");
            System.out.print("Presione la tecla ENTER para SALIR DEL SISTEMA. ");
            entrada.nextLine(); // CAPTURA EL BLANCO QUE QUEDA PENDIENTE
            entrada.nextLine(); // ESPERA QUE EL USUARIO PRESIONE LA TECLA ENTER
            return true; // Distancia válida
        } else {
            // Se invoca al metodo mentajeErrorKms(Scanner entrada)
            mensajeErrorKms(entrada);
            return false; // Distancia no válida, repetir WHILE
        }
    }
}