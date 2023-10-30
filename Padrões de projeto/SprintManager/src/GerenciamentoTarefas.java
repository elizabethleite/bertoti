public class GerenciamentoTarefas {
    public static void main(String[] args) {
        Tarefa tarefa1 = new TarefaSimples("Tarefa1",2.5);
        Tarefa tarefa2 = new TarefaSimples("Tarefa2",1.5);

        Projeto projeto = new Projeto("Projeto A");
        projeto.adicionarTarefa(tarefa1);
        projeto.adicionarTarefa(tarefa2);

        Tarefa tarefa3 = new TarefaSimples("Tarefa3",3.0);
        Tarefa tarefa4 = new TarefaSimples("Tarefa4",2.0);

        Projeto projeto2 = new Projeto("Projeto B");
        projeto2.adicionarTarefa(tarefa3);
        projeto2.adicionarTarefa(tarefa4);

        Projeto projetoPrincipal = new Projeto("Projeto Principal");
        projetoPrincipal.adicionarTarefa(projeto);
        projetoPrincipal.adicionarTarefa(projeto2);

        double tempoTotalProjeto = projetoPrincipal.getTempoEstimado();

        System.out.println("Tempo estimado para o Projeto Principal: " + tempoTotalProjeto + "horas");

        projeto.removerTarefa(tarefa1);

        tempoTotalProjeto = projetoPrincipal.getTempoEstimado();

        System.out.println("Tempo estimado para o Projeto Principal após a remoção: " + tempoTotalProjeto + "horas");
    }
}