import Copiadora.Copiadora;
import Copiadora.Xerox;
import Digitalizadora.Digitalizadora;
import Digitalizadora.Scanner;
import Multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional copiadoraXerox = new EquipamentoMultifuncional();
        Digitalizadora em = new EquipamentoMultifuncional();
        em.Digitalizar();
        
        copiadoraXerox.Copiar();
        copiadoraXerox.Digitalizar();
        copiadoraXerox.imprimir();
    }
}
