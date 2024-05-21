import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args)  {
       /** TODO:
           1 Conhecer e importar a classe Scanner;
           2 Exibir mensagem para o Usuario;
           3 obter pela Scanner resultados obtidos pelo terminal;
           4 Exibir mensagem ao Usuario.
       */
        Scanner entrada = new Scanner(System.in);
        String agencia;
        String usuarioConta;
        int numeroConta;
        double saldoConta=2400.50;
            System.out.println("Seja Bem Vindo ao BANKT");
                System.out.println("Antes de inicia, Precisamos de algumas informações");
                System.out.println("Informe Seu nome de usuario");
                usuarioConta = entrada.next();
                    System.out.println("Informe o numero da sua agencia");
                        agencia=entrada.next();
                        System.out.println("Informe o numero da sua conta");
                        numeroConta=entrada.nextInt();
                 
    System.out.println("Seja bem vindo! ");
    System.out.println("--------------------");
    System.out.println("Usuario: "+usuarioConta);
    System.out.println("Nº Conta: "+numeroConta);
    System.out.println("Agencia: "+agencia);
    System.out.println("Saldo Atual:"+saldoConta);
    System.out.println("------------------------");
    System.out.println("-------------------- ---");



    }
}
