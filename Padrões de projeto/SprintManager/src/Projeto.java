import java.util.ArrayList;
import java.util.List;

public class Projeto implements Tarefa{
    private String nome;
    private List<Tarefa> tarefas = new ArrayList<>();

    public Projeto(String nome){
        this.nome = nome;
    }

    public void adicionarTarefa(Tarefa tarefa){
        tarefas.add(tarefa);
    }

    public void removerTarefa(Tarefa tarefa){
        tarefas.remove(tarefa);
    }

    @Override

    public double getTempoEstimado(){
        double tempoTotal = 0;
        for(Tarefa tarefa: tarefas) {
            tempoTotal += tarefa.getTempoEstimado();
        }
        return tempoTotal;
    }
}
