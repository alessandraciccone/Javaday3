package pack8;

public class Playlist {
    private final Songs[] canzone; //il final lo ha suggerito l'editor

    public Playlist() {
        canzone = new Songs[3];
        canzone[0] = new Songs("Take me home, Country road", "John Denver", 300);
        canzone[1] = new Songs("Anna e Marco", "Lucio Dalla", 200);
        canzone[2] = new Songs("Sweet Child O' Mine", "Guns N' Roses", 500);
    }

    public void TitoloCanzone() {
        System.out.println("La mia playlist:");
    }

    public void DurataCazone() {

    }

    public void NomeArtista() {

        for (Songs s : canzone) {
            System.out.println("- " + s.getTitolo() + " di " + s.getArtista() + " e dura " + s.getSecondi() +" secondi");
        }
    }
}