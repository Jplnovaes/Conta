package modulo2classes;

public class TestaConta {

	public static void main(String[] args) {
	
		Conta waldeck = new Conta();
		waldeck.setNumero(45644);
		waldeck.setSaldo(10000);
		waldeck.setTitular("Waldeck");
		
		Conta joao = new Conta();
		joao.setNumero(45655);
		joao.setSaldo(5000);
		joao.setTitular("João");
		
		System.out.println("==============================" );
		System.out.println("Titular: " + waldeck.getTitular() );
		System.out.println("Conta: " + waldeck.getNumero() );
		System.out.println("Saldo: " + waldeck.getSaldo() );
		System.out.println("==============================" );
		
		System.out.println("Checando saldo....");
		System.out.println("Seu saldo é de R$ -> " + waldeck.checarSaldo() );
		System.out.println("==============================" );
		System.out.println("Sacando 5000" );
		
		waldeck.sacar(5000); 
		
		System.out.println("Seu saldo é de R$ -> " + waldeck.checarSaldo() );
		
		System.out.println("==============================" );
		System.out.println("Transferindo 3000" );
		waldeck.transferir(3000, joao);
		
		System.out.println(waldeck.getTitular() + ", seu saldo é de R$ -> " + waldeck.checarSaldo() );
		System.out.println("Seu saldo é de R$ -> " + joao.checarSaldo() );
		
	}
}
	
