package pack7;

import java.util.Scanner;

public class Main7 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calcolatrice calc = new Calcolatrice();

        System.out.print("Inserisci il primo numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Inserisci il secondo numero: ");
        double num2 = scanner.nextDouble();

        System.out.println("Scegli operazione: + - * /");
        String operazione = scanner.next();

        double risultato = 0;

        switch (operazione) {
            case "+":
                risultato = calc.somma(num1, num2);
                break;
            case "-":
                risultato = calc.sottrazione(num1, num2);
                break;
            case "*":
                risultato = calc.moltiplicazione(num1, num2);
                break;
            case "/":
                risultato = calc.dividi(num1, num2);
                break;
            default:
                System.out.println("Operazione non valida.");
                return;
        }

        System.out.println("Risultato: " + risultato);
        scanner.close();
    }
}

