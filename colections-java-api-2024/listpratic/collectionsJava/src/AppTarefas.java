import list.ListaDeTarefa;

public class AppTarefas {
    public static void main(String[] args) throws Exception {
        System.out.println("HELLO WORLD!");
        //ATRIBUINDO VARIAVEIS DE INSTANCIAMENTO
        ListaDeTarefa novaTarefa = new ListaDeTarefa();
       novaTarefa.adicionarItensTarefas("terra");
       novaTarefa.adicionarItensTarefas("terra");

       novaTarefa.adicionarItensTarefas("terra");

        System.out.println(novaTarefa.informacaoQuantidadeItens());



    }
}
