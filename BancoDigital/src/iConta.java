
public interface iConta {
	void saque(double valor);
	void deposito(double valor);
	void transferencia(double valor, Conta contaDeposito);
	
}
