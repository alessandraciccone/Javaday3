package pack1;

public class Rettangolo {
    //attributi private
    private double altezza;
    private double larghezza;
//costruttore
    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public double getAltezza() {
        return altezza;
    }

    public double getLarghezza() {
        return larghezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public void setLarghezza(double larghezza) {
        this.larghezza = larghezza;
    }
//calcola area
    public double calcolaArea() {
        return altezza * larghezza;
    }
//calcolo perimetro
    public double calcolaPerimetro() {
        return 2 * (altezza + larghezza);
    }
}