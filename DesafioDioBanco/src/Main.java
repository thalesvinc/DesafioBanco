public class Main {
    public static void main(String[] args) {
        Cliente Thales = new Cliente();
        Conta cc = new ContaCorrente(Thales);
        Conta poupanca = new ContaPoupanca(Thales);

        cc.depositar(100);
        cc.transferir(100,poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
