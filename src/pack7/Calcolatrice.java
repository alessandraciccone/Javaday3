package pack7;

public class Calcolatrice {
    double somma(double x, double y){
        return x+y;
    }

    double sottrazione(double x, double y){
        return x-y;
    }
    double moltiplicazione(double x, double y){
        return x*y;
    }
     double dividi(double x, double y) {
         if (y == 0) {
             System.out.println("Errore: divisione per zero!");
             return Double.NaN;
         }
        return x / y;
    }

}
