package ooavc;

public class ContaPoupan�a extends Conta {
	void correcao(double taxa) {
		this.saldo += this.saldo * 1.3;
	}
}
