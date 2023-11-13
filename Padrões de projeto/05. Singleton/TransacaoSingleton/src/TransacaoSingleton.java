import java.util.ArrayList;
import java.util.List;

public class TransacaoSingleton {

    private static TransacaoSingleton instance;
    private List<String> transacao;

    private TransacaoSingleton() {
        transacao = new ArrayList<>();
    }

    public static TransacaoSingleton getInstance() {
        if (instance == null) {
            instance = new TransacaoSingleton();
        }
        return instance;
    }

    public void registrarTransacao(String transacao) {
        this.transacao.add(transacao);
    }

    public List<String> getTransacao() {
        return transacao;
    }
}
