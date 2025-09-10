package pack3;

import java.time.LocalDate;

public class Commerce {

    // Classe Articolo
    public static class Articolo {
        private String codice;
        private String descrizione;
        private double prezzo;
        private int pezziDisponibili;

        public Articolo(String codice, String descrizione, double prezzo, int pezziDisponibili) {
            this.codice = codice;
            this.descrizione = descrizione;
            this.prezzo = prezzo;
            this.pezziDisponibili = pezziDisponibili;
        }

        public String getCodice() { return codice; }
        public String getDescrizione() { return descrizione; }
        public double getPrezzo() { return prezzo; }
        public int getPezziDisponibili() { return pezziDisponibili; }
        public void setPezziDisponibili(int pezziDisponibili) {
            this.pezziDisponibili = pezziDisponibili;
        }
    }

    // Classe Cliente
    public static class Cliente {
        private String codiceCliente;
        private String nome;
        private String cognome;
        private String email;
        private LocalDate dataIscrizione;

        public Cliente(String codiceCliente, String nome, String cognome, String email, LocalDate dataIscrizione) {
            this.codiceCliente = codiceCliente;
            this.nome = nome;
            this.cognome = cognome;
            this.email = email;
            this.dataIscrizione = dataIscrizione;
        }

        public String getCodiceCliente() { return codiceCliente; }
        public String getNome() { return nome; }
        public String getCognome() { return cognome; }
        public String getEmail() { return email; }
        public LocalDate getDataIscrizione() { return dataIscrizione; }
    }

    // Classe Carrello
    public static class Carrello {
        private Cliente clienteAssociato;
        private Articolo[] articoli = new Articolo[20];
        private int[] quantita = new int[20];
        private int size = 0;
        private double totale = 0.0;

        public Carrello(Cliente clienteAssociato) {
            this.clienteAssociato = clienteAssociato;
        }

        public Cliente getClienteAssociato() { return clienteAssociato; }
        public double getTotale() { return totale; }
        public Articolo[] getArticoli() { return articoli; }
        public int[] getQuantita() { return quantita; }
        public int getSize() { return size; }

        public void aggiungiArticolo(Articolo articolo, int qta) {

        }

        private int trovaIndiceArticolo(Articolo a) {
            return -1;
        }
    }
}