import java.util.List;

public class Main {
    public static void main(String[] args) {

        TransacaoSingleton transacao = TransacaoSingleton.getInstance();

        transacao.registrarTransacao("Transferência de R$50 para a conta 55509");
        transacao.registrarTransacao("Depósito de R$400 na conta 55517");

        List<String> transacaoRegistro = transacao.getTransacao();

        for (String transacaoItem : transacaoRegistro) {
            System.out.println(transacaoItem);
        }

    }
}