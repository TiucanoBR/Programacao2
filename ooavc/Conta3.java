package ooavc;

public class Conta3 {
	private static int contadorContas;
	int numero;
//	String nome;
	Cliente cliente;
	// Cliente cliente = new Cliente();
	double saldo;
	double limite;

	Conta3(int numero, String nome, double saldo, double limite) {
		this.numero = numero;
		this.cliente = new Cliente();
		this.cliente.nome = nome;
		this.saldo = saldo;
		this.limite = limite;
		contadorContas++;
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

	public int getNumero() {
		return numero;
	}

	void depositar(double valor) {
		saldo = saldo + valor;
	}

}
