package ooavc;

public class ContaPoupanša extends Conta {
	void correcao(double taxa) {
		this.saldo += this.saldo * 1.3;
	}
}
