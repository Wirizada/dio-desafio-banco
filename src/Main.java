
public class Main {
	public static void main(String arg[]) {
		Cliente vanilton = new Cliente();
		vanilton.setNome("Vanilton");
		
		Conta cc = new ContaCorrente(vanilton);
		Conta poupanca = new ContaPoupanca(vanilton);
		
		cc.despositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
