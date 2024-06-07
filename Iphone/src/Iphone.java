import Navegador.Navegador;
import ReprodutorMusical.ReprodutorMusical;
import Servicos.Servicos;
import Telefone.Telefone;


public class Iphone implements Telefone,Navegador,ReprodutorMusical {
    public static void main(String[] args) {
        Servicos iphone1 = new Servicos();
        iphone1.ligar();
        iphone1.browser();
        iphone1.tocarMusica();
        Aplicador();
        System.out.println("  ");
        iphoneeInterface();
}
//aplicando conceito de herança
public static void Aplicador(){
    Servicos tocador = new Servicos();
    System.out.println("       ");
    System.out.println("utilizando aplicador!!!!!!!!");
    tocador.ligar();
    tocador.desligar();
    tocador.browser();
    tocador.tocarMusica();
}
public static void iphoneeInterface(){
    Iphone iphone2 = new Iphone();
    iphone2.ligar();
    iphone2.desligar();
    iphone2.browser();
    iphone2.tocarMusica();

}
// APlicação se utilizando da mesma interface de Telefone 
//para demonstra aplicação do conceito de polimorfismo...
public void ligar(){
System.out.println("REALIZANDO LIGAÇÃO IPHONE");
}
public void desligar(){
System.out.println("Desligando ligação a partir iphone");
}
public void browser(){
    System.out.println("Navegando na Internet apartir iphone");
}
public void tocarMusica(){
    System.out.println("Tocando Musica apartir iphone");
}
}
