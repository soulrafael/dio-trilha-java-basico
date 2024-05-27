import java.util.Scanner;
import excecoes.PrimeiroParametroexcecao;
public class Contador {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner entrada = new Scanner(System.in);
        int parametro1 = entrada.nextInt();
        int parametro2 = entrada.nextInt();
        try {
            //chamando metodo contando a logica de contagem 
            contar(parametro1, parametro2);
        
        } catch ( PrimeiroParametroexcecao e) {
            //imprimir a mensagem o primeiro parametro deve ser maior
            System.out.println("tente novamente");
            entrada.close();
        }
        
    
    
    }
    static void contar(int parametro1, int parametro2) throws PrimeiroParametroexcecao{
        //validar se parametros é MAIOR que parametro2 e lançar exceção 
    if (parametro1>parametro2) {
        throw new PrimeiroParametroexcecao("mensagem ");
    }
        System.out.println(" o valor do primeiro parametro  "+parametro1);
            System.out.println("O valor do segundo parametro  "+parametro2);

        //realizar o for para imprimir os numeros com base na variavel contagem


    }
}
