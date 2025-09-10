import pack2.Sim;

public class Main2 {
    public static void main(String[] args) {
        Sim miaSim = new Sim("333-1234567");

        miaSim.aggiungiChiamata("345-9876543", 3);
        miaSim.aggiungiChiamata("320-1112233", 5);
        miaSim.aggiungiChiamata("339-4455667", 2);
        miaSim.aggiungiChiamata("328-9988776", 4);
        miaSim.aggiungiChiamata("331-1122334", 1);
        miaSim.aggiungiChiamata("347-5566778", 6);

        miaSim.stampaDati();
    }
}

