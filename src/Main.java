public class Main {

	public static void main(String[] args) {

				
		Cliente willie = new Cliente();
		willie.setNome("Willie");

		Conta cc = new ContaCorrente(willie);
		Conta poupanca = new ContaPoupanca(willie);

		cc.depositar(500);
		cc.depositar(100);
		cc.transferir(100, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
