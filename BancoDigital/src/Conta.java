
public abstract class Conta implements iConta {
	private static int AGENCIA_PADRAO = 1;
	protected static  int SEQUENCIAL = 1;
	protected int agencia;
	protected int numeroConta;
	protected double saldo;
	
	 public void conta() {
		 this.agencia=AGENCIA_PADRAO;
		 this.numeroConta=SEQUENCIAL++;
		 
	 }
	
	
	@Override
	public void saque(double valor) {
		// TODO Auto-generated method stub
		this.saldo-=valor;
		
		
	}
	@Override
	public void deposito(double valor) {
		// TODO Auto-generated method stub
		this.saldo +=valor;
	}
	@Override
	public void transferencia(double valor, Conta contaDeposito) {
		// TODO Auto-generated method stub
		this.saque(valor);
		contaDeposito.deposito(valor);
		
	}
protected void imprimirExtrato() {
	System.out.println(String.format("AGENCIA: %d", this.agencia));
	System.out.println(String.format("Numero da Conta: %d", this.numeroConta));
	System.out.println(String.format("Saldo Atual %.2f", this.saldo));
}

 
 
 
 
}
