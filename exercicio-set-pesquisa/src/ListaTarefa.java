import java.util.HashSet;
import java.util.Set;

public class ListaTarefa {
    
    private Set<Tarefa> tarefaSet;

    public ListaTarefa() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        if(!tarefaSet.isEmpty()){
            Set<Tarefa> tarefasParaRemover = new HashSet<>();
            for(Tarefa t : tarefaSet){
                if(t.getDescricao() == descricao){
                    tarefasParaRemover.add(t);
                }
            tarefaSet.removeAll(tarefasParaRemover);

            }
        } else {
            System.out.println("A lista está vazia.");
        }
    }

    public void exibirTarefa(){
        if(!tarefaSet.isEmpty()){
            System.out.println("A lista de tarefa é: ");
            System.out.println(tarefaSet);
        } else {
            System.err.println("A lista está vazia.");
        }
    }

    public void contarTarefa(){
        if(!tarefaSet.isEmpty()){
                 System.out.println("A quantidade de tarefas atual é de: " +tarefaSet.size());
            }
        else {
            System.err.println("A lista está vazia.");
            
        }
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
            for(Tarefa t : tarefaSet){
                if(t.isConclusao()){
                    tarefasConcluidas.add(t);
                }
            }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
         Set<Tarefa> tarefasPendentes = new HashSet<>();
            for(Tarefa t : tarefaSet){
                if(!t.isConclusao()){
                    tarefasPendentes.add(t);
                }
            }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        if(!tarefaSet.isEmpty()){
            for(Tarefa t : tarefaSet){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setConclusao(true);
                }
                else if (t.isConclusao()){
                    System.out.println("Essa tarefa não existe/já está concluída.");
                }
            }
        }
        else {
            System.out.println("A lista está vazia.");
        }

    }

    public void marcarTarefaPendente(String descricao){
        if(!tarefaSet.isEmpty()){
            for(Tarefa t : tarefaSet){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setConclusao(false);
                }
                else if (!t.isConclusao()){
                    System.out.println("Essa tarefa não existe/já está pendente.");
                }
            }
        }
        else {
            System.out.println("A lista está vazia.");
        }
    }

    public void limparListaTarefa(){
        if(!tarefaSet.isEmpty()){
            tarefaSet.clear();
            System.out.println("A lista foi removida com sucesso.");
        }
        else{
            System.out.println("A lista está vazia.");
        }
        
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("Aguar as plantas");
        listaTarefa.adicionarTarefa("Alimentar pet");
        listaTarefa.adicionarTarefa("Estudar");

        listaTarefa.exibirTarefa();

        listaTarefa.marcarTarefaConcluida("Aguar as plantas");
        System.out.println("As tarefas concluídas são: ");
        System.out.println(listaTarefa.obterTarefasConcluidas());

        System.out.println("As tarefas pendentes são: ");
        System.out.println(listaTarefa.obterTarefasPendentes());

        listaTarefa.contarTarefa();
        
        listaTarefa.limparListaTarefa();
        listaTarefa.exibirTarefa();
    }
}
