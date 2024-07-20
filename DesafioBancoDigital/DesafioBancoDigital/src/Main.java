public class Main {
    public static void main(String[] args) throws Exception {
        Cliente novoCliente = new Cliente();
        Cliente outroCliente = new Cliente();
        novoCliente.setNome("Gustavo Guanabeira");
        outroCliente.setNome("Adriano Suzuki");

        ContaCorrente cc = new ContaCorrente(novoCliente);
        ContaPoupanca cp = new ContaPoupanca(outroCliente);
        
        cp.depositar(1500);
        cp.sacar(0.75);
        cc.depositar(1800.50);
        cc.transferir(1200, cp);

   cc.imprimirInfosComuns();
   cp.imprimirInfosComuns();
        

      
    }
}
