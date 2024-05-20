import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args)  {
       /* System.out.println("Hello, World! Bem Vindo ao BANKT");
        String agencia = args[0];
        String usuarioConta = args[2];
        String numeroConta = args[2];*/
        Scanner entrad = new Scanner(System.in);
        String agencia;
        String usuarioConta;
        int numeroConta;
        double saldoConta=2400.50;
            System.out.println("Seja Bem Vindo ao BANKT");
                System.out.println("Antes de inicia, Precisamos de algumas informações");
                System.out.println("Informe Seu nome de usuario");
                usuarioConta = entrad.next();
                    System.out.println("Informe o numero da sua agencia");
                        agencia=entrad.next();
                        System.out.println("Informe o numero da sua conta");
                        numeroConta=entrad.nextInt();
                        System.out.println(".>");
                        System.out.println(".>");
                        System.out.println(".>");
                        System.out.println(".>");
                        System.out.println(".>");
                        System.out.println(".>");
                        System.out.println(".>");
                        System.out.println(".>");
                        System.out.println(".>");
                        System.out.println(".>");
                        System.out.println(".>");
                        System.out.println(".>");
                        System.out.println(".>");
                        System.out.println("--------------------");


                 
    System.out.println("Seja bem vindo! ");
    System.out.println("--------------------");
    System.out.println("--------------------");

    System.out.println(usuarioConta);
    System.out.println(numeroConta);
    System.out.println(agencia);
    System.out.println(saldoConta);
    System.out.println("------------------------");
    System.out.println("-------------------- ---");



    }
}
