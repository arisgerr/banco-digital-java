package bancoDigital;

public class contaPoupanca extends conta {	
	
	public contaPoupanca(cliente cliente) {
		super(cliente);
		
	}
	@Override
	public void imprimirExtrato() {
		System.out.println("== Extrato conta Poupança ==");
		super.imprimirInfosComuns();
	
	}
		
	}