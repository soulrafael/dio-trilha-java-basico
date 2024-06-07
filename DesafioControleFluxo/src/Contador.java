import java.util.Scanner;
import excecoes.ParametroInvalidosException;
public class Contador {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello! Desafio DIO Controle de Fluxo");
        Scanner entrada = new Scanner(System.in);
        int parametro1 = entrada.nextInt();
        int parametro2 = entrada.nextInt();
        try {
            //chamando metodo contando a logica de contagem 
            contar(parametro1, parametro2);
        
        } catch ( ParametroInvalidosException e) {
            //imprimir a mensagem o primeiro parametro deve ser maior
            System.out.println("tente novamente");
            entrada.close();
        }
    }
    static void contar(int parametro1, int parametro2) throwParametroInvalidosException{
        //validar se parametros é MAIOR que parametro2 e lançar exceção 
    if (parametro1>parametro2) {
        throw new ParametroInvalidosException("mensagem ");
        //Criei minha propria excessão como uma mensagem a ser impressa.
    }
    for(int contagem=0; contagem<1; contagem++){
        System.out.println("imprimindo parametro 1: "+parametro1);
            System.out.println("imprimindo parametro 2: "+parametro2);

        //realizar o for para imprimir os numeros com base na variavel contagem
     }

     
    }
}
