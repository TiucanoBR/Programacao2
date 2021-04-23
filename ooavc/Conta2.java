package ooavc;

public class Conta2 {
	int numero;
//	String nome;
	Cliente cliente;
	//Cliente cliente = new Cliente();
	double saldo;
	double limite;
	
	Conta2(int numero, Cliente cliente, double saldo, double limite) {
		this.numero = numero;
		this.cliente = new Cliente();
		this.saldo = saldo;
		this.limite = limite;
	}

	boolean sacar(double valor) {
//		double saldoAlteradp = saldo-valor;
// 		saldo = saldoAlterado
		if(valor > saldo + limite) {
			return false;
		}else {
			saldo = saldo - valor;
			return true;
		}
	}
	
	public int getNumero() {
		return numero;
	}
	
	void depositar(double valor) {
		saldo = saldo + valor;
	}

}
