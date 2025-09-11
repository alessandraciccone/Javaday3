package pack6;

public class Animals {
    private String nome;
    private AnimaliFattoria tipo;

    public Animals(String nome, AnimaliFattoria tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }
    public void setNome(String nuovoNome) { //parte con difficoltà
        this.nome = nuovoNome;
    }
    public void description() {
        System.out.println("Buongiorno, sono " + nome + " e sono una " + tipo);
    }
}

