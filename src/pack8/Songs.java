package pack8;

public class Songs {
    private String titolo;
    private String artista;
    private int secondi;

    public Songs(String titolo, String artista, int secondi) {
        this.titolo = titolo;
        this.artista = artista;
        this.secondi = secondi;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getSecondi() {
        return secondi;
    }

    public String getArtista() {
        return artista;
    }
}