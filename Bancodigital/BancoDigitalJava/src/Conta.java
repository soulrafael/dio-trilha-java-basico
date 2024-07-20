

public abstract class Conta implements iConta {
	private static int AGENCIA_PADRAO = 1;
	protected static  int SEQUENCIAL = 1;
	// Atributos da conta
	protected int agencia;
	protected int numeroConta;
	protected double saldo;
	// atributos
	//implementação Agencia
	 public Conta() {
		this.agencia =	AGENCIA_PADRAO;
		this.numeroConta = SEQUENCIAL++; 
	 }

		
	
	// implementação de metodos
	@Override
	public void saque(double valor) {
		this.saldo-=valor;
	}
	@Override
	public void deposito(double valor) {
				this.saldo +=valor;
	}
	@Override
	public void transferencia(double valor, Conta contaDeposito) {
		this.saque(valor);
		contaDeposito.deposito(valor);	
	}
protected void imprimirExtrato() {
	//System.out.println(String.format("nome cliente: %s",this.clientes.getCliente()));
	System.out.println(String.format("AGENCIA: %d", this.agencia));
	System.out.println(String.format("Numero da Conta: %d", this.numeroConta));
	System.out.println(String.format("Saldo Atual %.2f", this.saldo));
}

}
