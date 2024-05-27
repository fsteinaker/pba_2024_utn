package Unidad2_ejercicio2;

import java.util.Scanner;

public class Aplicacion {

    public static void main(String[] args) {
        
        Scanner cargarDato = new Scanner(System.in);
        
        // Solicitar y cargar el peso, la marca y el modelo de la notebook
        System.out.println("Introduzca el peso de la notebook: ");
        float pesoNotebook = cargarDato.nextFloat();
        cargarDato.nextLine(); // Consumir la nueva línea después de leer un float
        System.out.println("");
        
        System.out.println("Introduzca la marca de la Notebook: ");
        String marcaNotebook = cargarDato.nextLine();
        System.out.println("");

        System.out.println("Introduzca el modelo de la notebook: ");
        String modeloNotebook = cargarDato.nextLine();
        System.out.println("");        

        // Crear una instancia de la clase NoteBook con los datos proporcionados
        NoteBook notebook = new NoteBook(pesoNotebook, marcaNotebook, modeloNotebook);
        
        System.out.println("Introduzca la marca de la PC: ");
        String marcaPc = cargarDato.nextLine();
        System.out.println("");

        System.out.println("Introduzca el modelo de la notebook: ");
        String modeloPc = cargarDato.nextLine();
        System.out.println("");  
        
        // Crear una instancia de la clase PC con los datos proporcionados
        Pc pc = new Pc(marcaPc, modeloPc);
        
        // Imprimir la información de la notebook
        System.out.println(notebook.toString());
        // Imprimir la información de la PC
        System.out.println(pc.toString());
        
        cargarDato.close(); // Cerrar el Scanner
    }    
}