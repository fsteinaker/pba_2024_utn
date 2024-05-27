package Unidad2_ejercicio2;

public class NoteBook extends Computadora {
    private float pesoNoteBook;

    public NoteBook(float pesoNoteBook, String marca, String modelo) {
        super(marca, modelo);
        this.pesoNoteBook = pesoNoteBook;
    }

    public float getPesoNoteBook() {
        return pesoNoteBook;
    }

    public void setPesoNoteBook(float pesoNoteBook) {
        this.pesoNoteBook = pesoNoteBook;
    }
    
    @Override
    public String toString() {
        return "Notebook: " + getMarca() + " - Modelo: " + getModelo() + ". Su peso: " + getPesoNoteBook() + " kg's";
    }
}