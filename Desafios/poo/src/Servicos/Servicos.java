
package Servicos;
import Navegador.Navegador;
import ReprodutorMusical.ReprodutorMusical;
import Telefone.Telefone;

public class Servicos implements Telefone, Navegador, ReprodutorMusical{
//implementando TELEFONE,NAVEGADOR,REPRODUTOR MUSICAL
//aplicação de conceito de interface - basico
//implements Telefone
@Override
public String ligar(String numero){
System.out.println("REALIZANDO LIGAÇÃO "+ numero);
return numero;
}
@Override
public void atender(){
    System.out.println("ATENDIDA!!");
}
@Override
public void iniciarCorreioVoz() {
    System.out.println("iniciando CORREIO DE VOZ");
}



//implements navegador
public String exibirPagina(String url){
    url = "https://web.dio.me";
    System.out.println("Navegando na Internet: "+ url);
    return url;
}
public void atualizarPagina(){
    System.out.println("Atualizando pagina");
}
public void adicionarNovaAba(){
    System.out.println("Adicionando Nova aba");
}


//Implementes ReprodutorMusical
public void tocar(){
    System.out.println("Tocando Musica");
    
}
public void pausar(){
    System.out.println("Pausando a Musica");
}
public String selecionarMusica(String musica){
System.out.println("Selecionando musica "+musica);
    return musica;
}


}
