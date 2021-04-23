package ooavc;

public class Conta {
	int numero;
	String nome;
	double saldo;
	double limite;

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
