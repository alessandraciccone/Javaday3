package pack5;

public class Giocatore {
    private String nome;
    private int score;

    public Giocatore(String nome){
        this.nome= nome;
        this.score=0;
    }
public void Morescore(int punti){
        this.score += punti;
        Gioco.punteggioTotale+= punti;//cosa con + difficoltà
}

public void Showscore(){
    System.out.println(nome + " ha " + score + " punti");
}

}
