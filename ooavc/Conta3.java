package ooavc;

public class Conta3 {
	private static int contadorContas;
	int numero;
//	String nome;
	Cliente cliente;
	// Cliente cliente = new Cliente();
	double saldo;
	double limite;

	public Conta3(int numero, String nome, double saldo, double limite) {
		this.numero = numero;
		this.cliente = new Cliente();
		this.cliente.nome = nome;
		this.saldo = saldo;
		this.limite = limite;
		contadorContas++;
	}

	public Conta3() {

	}

	public int getcontadorContas() {
		return Conta3.contadorContas;
	}

	boolean sacar(double valor) {
//		double saldoAlteradp = saldo-valor;
// 		saldo = saldoAlterado
		if (valor > saldo + limite) {
			return false;
		} else {
			saldo = saldo - valor;
			return true;
		}
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
		
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		saldo = saldo + valor;
	}



}
