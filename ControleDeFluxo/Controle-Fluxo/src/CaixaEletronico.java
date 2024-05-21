import java.util.Scanner;
import ContaBanco.ContaBanco;
import ContaBanco.ContaBanco;
//Controle de Fluxo Simples até as 8:50
public class CaixaEletronico{
public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);// Entrada de dados via terminal
    ContaBanco usuarioAtual = new ContaBanco();
    usuarioAtual.Usuario = entrada.nextLine();
    usuarioAtual.agencia = entrada.next();
    usuarioAtual.numeroConta = entrada.nextInt();

System.out.println("Teste :" + usuarioAtual.Usuario + usuarioAtual.agencia+ usuarioAtual.numeroConta);







    /*double saldo =  25.0;
    double valorSolicitado=17.0;
    if (valorSolicitado<saldo) {
        saldo= saldo-valorSolicitado;
        System.out.println("saldo atual "+ saldo);
    }*/
}



}