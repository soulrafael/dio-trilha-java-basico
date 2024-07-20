
public class BancoDigital {

	
	public static void main(String[] args) {
		Clientes novocliente = new Clientes();
		novocliente.setClientes("ggg");
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca contaP = new ContaPoupanca();
		
		
	cc.conta();
	contaP.conta();
	cc.ContaCorrente();
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