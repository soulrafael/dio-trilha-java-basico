package list;

import java.util.List;
import java.util.ArrayList;
public class ListaDeTarefa {
    List<Tarefa> listaTarefas;

    public ListaDeTarefa(){
        this.listaTarefas = new ArrayList<>();
    }
        public void adicionarItensTarefas(String task){
            listaTarefas.add(new Tarefa(task));
            
        }
        public int informacaoQuantidadeItens(){
            return listaTarefas.size();
        }
    
}
