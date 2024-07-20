public class Conta implements Iconta {
    private static  int AGENCIA_PADRAO = 0001;
	private static int SEQUENCIAL = 1;
    // PRIMEIRO DEFINIDO OS ATRIBUTOS DA CONTA
   public int agencia;
   public int numeroConta;
   public Cliente cliente;
   public double saldo;

   public Conta(Cliente cliente) {
    this.agencia = Conta.AGENCIA_PADRAO++;
    this.numeroConta = SEQUENCIAL++;
    this.cliente = cliente;
}

@Override
public void depositar(double valor) {
    saldo+=valor;
    
}

@Override
public void sacar(double valor) {
saldo -= valor;    
}

@Override
public void transferir(double valor, Iconta contaDestino) {
this.sacar(valor);;  
contaDestino.depositar(valor);
}

protected void imprimirInfosComuns() {
    System.out.println("--------EXTRATO--------");
    System.out.println(String.format("Titular: %s", this.cliente.getNome()));
    System.out.println(String.format("Agencia: %d", this.agencia));
    System.out.println(String.format("Numero: %d", this.numeroConta));
    System.out.println(String.format("Saldo: %.2f", this.saldo));
    
}


}
