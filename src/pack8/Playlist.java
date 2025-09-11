package pack8;

public class Playlist {
    private Songs[] canzone;

    public Playlist() {
        canzone = new Songs[3];
        canzone[0] = new Songs("Take me home, Country road", "John Denver", 300);
        canzone[1] = new Songs("Anna e Marco", "Lucio Dalla", 200);
        canzone[2] = new Songs("Sweet Child O' Mine", "Guns N' Roses", 500);
    }

    public void TitoloCanzone() {
        System.out.println("La mia playlist:");
        for (Songs s : canzone) {
            System.out.println("- " + s.getTitolo());
        }
    }

    public void DurataCazone() {
        System.out.println("Le canzoni durano rispettivamente:");
        for (Songs s : canzone) {
            System.out.println("- " + s.getSecondi() + " secondi");
        }
    }

    public void NomeArtista() {
        System.out.println("Gli artisti sono ");
        for (Songs s : canzone) {
            System.out.println("- " + s.getArtista());
        }
    }
}