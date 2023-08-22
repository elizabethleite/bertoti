package Strategy;

public class Cliente {

    private Pagamento pagamento;

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void realizarPagamento(){
        this.pagamento.pagar();
    }
}
