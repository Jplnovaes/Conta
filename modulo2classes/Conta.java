package modulo2classes;

public class Conta {
	
	private int numero;
	private double saldo;
	private String titular;
	
	
	public int getNumero() {
		return this.numero;

	}
	
	public void setNumero(int numero) {
	  this.numero = numero;
	}
	
	public double getSaldo() {
		return this.saldo;

	}
	
	public void setSaldo(double saldo) {
	  this.saldo = saldo;
	}
	
	public String getTitular() {
		return this.titular;

	}
	
	public void setTitular(String titular) {
	  this.titular = titular;
	}
	
	public double checarSaldo() {
		return this.saldo;
	}
	
	public void sacar(double sacar) {
		
				
		if(sacar <= saldo) {
		this.saldo = saldo - sacar;
		System.out.println("Saque realizado!");
		}else {
			
			System.out.println("Seu saldo é insuficiente!");
		}
	}
	
	public void transferir(double valor, Conta destino) {
		this.saldo = this.saldo - valor;
		destino.saldo = destino.saldo + valor;
		
}
	
}
