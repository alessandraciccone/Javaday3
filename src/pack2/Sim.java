package pack2;
import java.util.LinkedList;
//classe pubblica
public class Sim {
    //attributi private
    private String numeroTelefono;
    private double credito;
    private LinkedList<Chiamata> chiamate;

    // Classe interna per rappresentare una chiamata
    private static class Chiamata {
        String numeroChiamato;
        int durataMinuti;

//costruttore chiamata
        Chiamata(String numeroChiamato, int durataMinuti) {
            this.numeroChiamato = numeroChiamato;
            this.durataMinuti = durataMinuti;
        }

        public String toString() {
            return "Numero: " + numeroChiamato + ", Durata: " + durataMinuti + " min";
        }
    }

    // Costruttore della sim
    public Sim(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.credito = 0.0;
        this.chiamate = new LinkedList<>();
    }

    // Metodo per aggiungere una chiamata
    public void aggiungiChiamata(String numeroChiamato, int durataMinuti) {

        chiamate.add(new Chiamata(numeroChiamato, durataMinuti));
    }

    // Metodo per stampare i dati della SIM
    public void stampaDati() {
        System.out.println("Numero di telefono: " + numeroTelefono);
        System.out.println("Credito residuo: " + credito + "€");
        System.out.println("Ultime chiamate:");
        if (chiamate.isEmpty()) {
            System.out.println("Nessuna chiamata effettuata.");
        } else {
            for (Chiamata c : chiamate) {
                System.out.println(" - " + c);
            }
        }
    }
}
