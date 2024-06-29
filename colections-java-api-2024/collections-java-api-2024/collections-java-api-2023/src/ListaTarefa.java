import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
     private List<Tarefa> tarefaList;
     



    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        if (!tarefaList.isEmpty()) {
          for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
              tarefasParaRemover.add(t);
            }
          }
          tarefaList.removeAll(tarefasParaRemover);
        } else {
          System.out.println("A lista está vazia!");
        }
    }
    public int obterNumeroTotalTarefas(){
      return  tarefaList.size();
    }
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) throws Exception {
        ListaTarefa novatarefa = new ListaTarefa();
        System.out.println("Hello, World!");
        novatarefa.adicionarTarefa("coco");
        novatarefa.obterDescricoesTarefas();
        

    }
}
