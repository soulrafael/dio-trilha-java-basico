import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner entrada = new Scanner(System.in);
        int parametro1 = entrada.nextInt();
        int parametro2 = entrada.nextInt();
        try {
            //chamando metodo contando a logica de contagem 
            for(int x=parametro1; x>2;x=x-parametro2){
            contar(parametro1, parametro2);
        }
        } catch (Exception e) {
            // TODO: handle exception
            //imprimir a mensagem o primeiro parametro deve ser maior
        }
        
    
    
    }
    static void contar(int parametro1, int parametro2){
        //validar se parametros é MAIOR que parametro2 e lançar exceção 
        System.out.println(" o valor "+parametro1);
            System.out.println("O valor do parametro 2 "+parametro2);

        //realizar o for para imprimir os numeros com base na variavel contagem


    }
}
