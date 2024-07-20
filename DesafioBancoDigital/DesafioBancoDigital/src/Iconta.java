public interface Iconta {
    //criada uma interface com os metodos de saque, deposito
    //e transferencia;
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, Iconta contaDestino);

}
