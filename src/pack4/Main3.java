package pack4;
import java.util.Random;

public class Main3 {
    public static void main(String[] args) {
        Libro mioLibro = new Libro(1, "Il nome della rosa", "Umberto Eco", 512);
        mioLibro.stampaLibro();

        Random rand = new Random();
        double idCasuale = rand.nextInt(1000);
        Libro mioLibro2 = new Libro(idCasuale, "Il nome della rosa", "Umberto Eco", 0);        mioLibro2.stampaLibro();
    }//cosa con più difficoltà, non sono riuscita a creare l'istanza con 3 parametri
}



