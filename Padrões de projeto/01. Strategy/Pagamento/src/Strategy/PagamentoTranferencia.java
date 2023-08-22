package Strategy;

public class PagamentoTranferencia implements Pagamento {

    @Override
    public void pagar() {
        System.out.println("Efetuando pagamento via transferência bancária (TED)");
    }
}
