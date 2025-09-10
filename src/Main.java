import pack1.Rettangolo;

public class Main {
    public static void main(String[] args) {
        Rettangolo r1 = new Rettangolo(5, 3);//oggetto
            Rettangolo r2 = new Rettangolo(2, 4);//oggetto

        stampaRettangolo(r1);//metodo per stampare il primo
        System.out.println("-----");
        stampaDueRettangoli(r1, r2);//metodo x stampare i due insieme
    }

    public static void stampaRettangolo(Rettangolo r) {
        System.out.println("Area: " + r.calcolaArea());
        System.out.println("Perimetro: " + r.calcolaPerimetro());
    }//stampa i risultati dell'area e del perimetro del primo rettangolo

    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
        System.out.println("Rettangolo 1:");
        stampaRettangolo(r1);

        System.out.println("Rettangolo 2:");
        stampaRettangolo(r2);
//stampa i dati di entrmbi i rettangoli
        double sommaAree = r1.calcolaArea() + r2.calcolaArea();
        double sommaPerimetri = r1.calcolaPerimetro() + r2.calcolaPerimetro();

        System.out.println("Somma delle aree: " + sommaAree);
        System.out.println("Somma dei perimetri: " + sommaPerimetri);
    }
}//stampa le somme dei rettangoli