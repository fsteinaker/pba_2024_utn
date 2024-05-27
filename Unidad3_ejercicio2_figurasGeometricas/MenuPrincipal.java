package Unidad3_ejercicio2_figurasGeometricas;

// MenuPrincipal.java
import java.util.ArrayList;
import java.util.Scanner;

public class MenuPrincipal {
    private ArrayList<Figura> listaFiguras = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        MenuPrincipal menu = new MenuPrincipal();
        menu.mostrarMenu();
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("");
            System.out.println("--------------------------------");
            System.out.println("--        Menu Principal      --");
            System.out.println("--------------------------------");
            System.out.println("");
            System.out.println("1. Cargar Figura");
            System.out.println("2. Mostrar Figuras");
            System.out.println("3. Borrar Ultima Figura");
            System.out.println("4. Ver si hay figuras iguales");
            System.out.println("5. Figura de mayor area");
            System.out.println("6. Figura de menor area");
            System.out.println("7. Figuras de areas iguales");
            System.out.println("8. Salir");
            System.out.println("");
            System.out.println("--------------------------------");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            System.out.println("--------------------------------");
            
            switch (opcion) {
                case 1:
                    cargarFigura();
                    break;
                case 2:
                    mostrarFiguras();
                    break;
                case 3:
                    borrarUltimaFigura();
                    break;
                case 4:
                    verificarFigurasIguales();
                    break;
                case 5:
                    figuraMayorArea();
                    break;
                case 6:
                    figuraMenorArea();
                    break;
                case 7:
                    figurasAreasIguales();
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    System.out.println("");
                    break;
                default:
                    System.out.println("Opcion invalida. Por favor, seleccione una opcion valida.");
                    System.out.print("Presione la tecla ENTER para CONTINUAR ");
                    
                    // Espera a que el usuario presione la tecla ENTER
                    scanner.nextLine(); 
                    scanner.nextLine();
            }
        } while (opcion != 8);
    }

    private void cargarFigura() {
        System.out.println("Seleccione el tipo de figura a cargar:");
        System.out.println("1. Circulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triangulo");
        int tipoFigura = scanner.nextInt();

        switch (tipoFigura) {
            case 1:
                System.out.print("Ingrese el radio del circulo: ");
                double radio = scanner.nextDouble();
                Circulo circulo = new Circulo(radio);
                listaFiguras.add(circulo);
                break;
            case 2:
                System.out.print("Ingrese el lado del cuadrado: ");
                double lado = scanner.nextDouble();
                Cuadrado cuadrado = new Cuadrado(lado);
                listaFiguras.add(cuadrado);
                break;
            case 3:
                System.out.print("Ingrese la base del triangulo: ");
                double base = scanner.nextDouble();
                System.out.print("Ingrese la altura del triangulo: ");
                double altura = scanner.nextDouble();
                Triangulo triangulo = new Triangulo(base, altura);
                listaFiguras.add(triangulo);
                break;
            default:
                System.out.println("Tipo de figura no valido.");
        }
    }

    private void mostrarFiguras() {
        if (listaFiguras.isEmpty()) {
            System.out.println("No hay figuras para mostrar.");
            return;
        }

        for (Figura figura : listaFiguras) {
            System.out.println(figura.toString());
        }
    }

    private void borrarUltimaFigura() {
        if (!listaFiguras.isEmpty()) {
            listaFiguras.remove(listaFiguras.size() - 1);
            System.out.println("Ultima figura borrada.");
        } else {
            System.out.println("No hay figuras para borrar.");
        }
    }

    private void verificarFigurasIguales() {
        if (listaFiguras.size() < 2) {
            System.out.println("No hay suficientes figuras para comparar.");
            return;
        }

        for (int i = 0; i < listaFiguras.size(); i++) {
            for (int j = i + 1; j < listaFiguras.size(); j++) {
                if (listaFiguras.get(i).esIgual(listaFiguras.get(j))) {
                    System.out.println("Las figuras en las posiciones " + (i + 1) + " y " + (j + 1) + " son iguales.");
                }
            }
        }
    }

    private void figuraMayorArea() {
        if (listaFiguras.isEmpty()) {
            System.out.println("No hay figuras para comparar.");
            return;
        }

        Figura mayor = listaFiguras.get(0);
        for (Figura figura : listaFiguras) {
            if (figura.esMayor(mayor)) {
                mayor = figura;
            }
        }

        System.out.println("La figura con mayor area es: " + mayor.toString());
    }

    private void figuraMenorArea() {
        if (listaFiguras.isEmpty()) {
            System.out.println("No hay figuras para comparar.");
            return;
        }

        Figura menor = listaFiguras.get(0);
        for (Figura figura : listaFiguras) {
            if (figura.esMenor(menor)) {
                menor = figura;
            }
        }

        System.out.println("La figura con menor area es: " + menor.toString());
    }

    private void figurasAreasIguales() {
        if (listaFiguras.size() < 2) {
            System.out.println("No hay suficientes figuras para comparar.");
            return;
        }

        for (int i = 0; i < listaFiguras.size(); i++) {
            for (int j = i + 1; j < listaFiguras.size(); j++) {
                if (listaFiguras.get(i).esIgual(listaFiguras.get(j))) {
                    System.out.println("Las figuras en las posiciones " + (i + 1) + " y " + (j + 1) + " tienen areas iguales.");
                }
            }
        }
    }
}