package bancoDigital;

public class Main {

	//@SuppressWarnings("null")
	public static void main(String[] args) {
	
		cliente arisgerr = new cliente();
		arisgerr.setNome("arisgerr");
		
		
		conta cc = new contaCorrente(arisgerr);
		contaPoupanca poupanca = new contaPoupanca(arisgerr);
		

		cc.depositar(500);
		cc.transferir(500, poupanca);
		
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();		
		
	}

}