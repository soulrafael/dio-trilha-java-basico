import Servicos.Servicos;

public class Iphone extends Servicos {
    public static void main(String[] args) {
        Servicos iphone1 = new Servicos();
        iphone1.atender(); //Telefone
        iphone1.ligar("5555-111");
        iphone1.iniciarCorreioVoz();
        iphone1.exibirPagina(null);
        iphone1.atualizarPagina();
        iphone1.adicionarNovaAba();
        iphone1.tocar();
        iphone1.pausar();
        iphone1.selecionarMusica("beatles");

    
    }
}