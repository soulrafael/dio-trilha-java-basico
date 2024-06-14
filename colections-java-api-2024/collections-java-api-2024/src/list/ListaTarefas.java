package list;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    //lista com generic , chamada tarefa
    private List<Tarefas> tarefalista;
    // criar um construtor para sempre que precisa chamar
// objeto do tipo lista tarefa para 

// O array vazio 
   public ListaTarefas(){
    this.tarefalista = new ArrayList<>();
   }

    public void adicionarTarefa(String descricao){
            tarefalista.add(new Tarefas(descricao));
    }// adicionar

    public void removerTarefa(String descricao){
        tarefalista.remove(new Tarefas(descricao));
    }
    public int obterDescricaoTarefa(){

return tarefalista.size();
    }
public static void main(String[] args) {
    ListaTarefas listaTarefa =new ListaTarefas();
    listaTarefa.adicionarTarefa("teste");
    System.out.println("Você tem " + listaTarefa.obterDescricaoTarefa() + " tarefas na lista:");}



}



