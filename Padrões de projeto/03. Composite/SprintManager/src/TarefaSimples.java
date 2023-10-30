public class TarefaSimples implements Tarefa{
    private String nome;
    private double tempoEstimado;

    public TarefaSimples(String nome, double tempoEstimado){
        this.nome = nome;
        this.tempoEstimado = tempoEstimado;
    }

    @Override

    public double getTempoEstimado(){
        return tempoEstimado;
    }

    public String getNome(){
        return nome;
    }
}
