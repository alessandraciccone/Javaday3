package pack5;

public class Main5 {
    public static void main(String[] args) {
        Giocatore g1 = new Giocatore("Gaspare");
        g1.Morescore(15);
        g1.Showscore();

        Giocatore g2 = new Giocatore("Gilberto");
        g2.Morescore(10);
        g2.Showscore();

        Giocatore g3 = new Giocatore("Maud");
        g3.Morescore(20);
        g3.Showscore();
        Gioco.mostraPunteggioTotale();
    }
}