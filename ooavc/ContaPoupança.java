package ooavc;

public class ContaPoupança extends Conta {
	void correcao(double taxa) {
		this.saldo += this.saldo * 1.3;
	}
}
