package pack4;
import java.util.Random;

public class Libro {
    private int id;
    private String titolo;
    private String autore;
    private int numPagine;


    public Libro(double id, String titolo, String autore, double numPagine) {
        this.id = (int) id;
        this.titolo = titolo;
        this.autore = autore;
        this.numPagine = (int) numPagine;
    }

    public Libro(String titolo, String autore, double numPagine) {
        Random rand = new Random();
        this.id = rand.nextInt(1000);
        this.titolo = titolo;
        this.autore = autore;
        this.numPagine = (int) numPagine;
    }

    public void stampaLibro() {
        System.out.println("ID: " + id);
        System.out.println("Titolo: " + titolo);
        System.out.println("Autore: " + autore);
        System.out.println("Numero di pagine: " + numPagine);
    }
}