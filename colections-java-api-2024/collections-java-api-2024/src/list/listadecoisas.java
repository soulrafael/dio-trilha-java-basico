package list;

import java.util.List;
import java.util.ArrayList;
public class listadecoisas {
    private static List<Coisas> ListC;// Criação com generic type
    

    public listadecoisas(){
        this.ListC = new ArrayList<>();
    }// crio uma array vazio

    public static void adicionarCoisas(String coista){
        ListC.add(new Coisas(coista));
    } 
    public int Contrudo(){
      return  ListC.size();
    }
 public static void main(String[] args) {
    listadecoisas novacoisa = new listadecoisas();
    novacoisa.adicionarCoisas("2");
    System.out.println(novacoisa.Contrudo());

 }
}
