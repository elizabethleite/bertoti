package Strategy;

public class PagamentoPix implements Pagamento {
    @Override
    public void pagar() {
        System.out.println("Efetuando pagamento via PIX");

    }
}
