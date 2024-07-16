
public class BancoDigital {

	
	public static void main(String[] args) {
		Clientes cliente= new Clientes();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca contaP = new ContaPoupanca();
	cc.conta();
	contaP.conta();
	cc.conta();
	contaP.conta();
		cc.deposito(1200);
		cc.transferencia(1200, contaP);
		cc.imprimirExtrato();
	
		contaP.saque(222);
		contaP.imprimirExtrato();
		contaP.transferencia(45, cc);
		cc.imprimirExtrato();
	}

}
