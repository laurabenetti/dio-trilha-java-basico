public class Main {
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("Aguar as plantas");
        listaTarefa.adicionarTarefa("Estudar");
        listaTarefa.adicionarTarefa("Alimentar pet");
        
        listaTarefa.obterDescricoesTarefas(null);

        System.out.println("O número total de tarefas atual é: " + listaTarefa.obterNumeroTotalTarefas());
    }
}
