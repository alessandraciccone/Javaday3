package pack6;

public class Main6 {
    public static void main(String[]args){
        Animals A1 = new Animals ( "Luna", AnimaliFattoria.PECORA);
        Animals A2 = new Animals( "Gianna", AnimaliFattoria.MUCCA);
        A1.description();
        A2.description();
        A1.setNome("Polpetta");
        A1.description();
        A2.setNome("Felix");
        A2.description();
    }
}
