package ooavc;

public class Gerente extends Funcionario implements AcessoBancoInterno{
	int senha;

	public boolean verifica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso autorizado");
			return true;
		} else {
			System.out.println("Acesso negado");
			return false;
		}
	}

	double getBonus() {
		return this.salario * 0.05 + 5000;
	}
}
