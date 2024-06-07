package Multifuncional;

import Copiadora.Copiadora;
import Digitalizadora.Digitalizadora;
import Impressora.Impressora;

public class EquipamentoMultifuncional implements Digitalizadora, Copiadora, Impressora{
    
        public void Digitalizar(){
        System.out.println("Digitalizando");
    }
    public void Copiar() {
        System.out.println("COPIANDO!!");
    } 
    public void imprimir(){
        System.out.println("IMPRIMINDO");
    }
    
}
