public class Main {
    public static void main(String[] args) throws Exception {
        Cliente novoCliente = new Cliente();
        Cliente outroCliente = new Cliente();
        novoCliente.setNome("Gustavo");
        outroCliente.setNome("Adriano");

        ContaCorrente cc = new ContaCorrente(novoCliente);
        ContaPoupanca cp = new ContaPoupanca(outroCliente);

        cc.transferir(1200, cp);
        
   cc.imprimirInfosComuns();
   cp.imprimirInfosComuns();
        

      
    }
}
