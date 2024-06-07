
package Servicos;
import Navegador.Navegador;
import ReprodutorMusical.ReprodutorMusical;
import Telefone.Telefone;

public class Servicos implements Telefone, Navegador, ReprodutorMusical{
//implementando TELEFONE,NAVEGADOR,REPRODUTOR MUSICAL
//aplicação de conceito de interface - basico
private String teste = "Sucess!!"; //Conceito de encapsulamento utilizando private

public void ligar(){
System.out.println("REALIZANDO LIGAÇÃO");
System.out.println(teste);
}
public void desligar(){
System.out.println("Desligando ligação");
System.out.println(teste);
}
public void browser(){
    System.out.println("Navegando na Internet");
    System.out.println(teste);
}
public void tocarMusica(){
    System.out.println("Tocando Musica");
    System.out.println(teste);
}
}
