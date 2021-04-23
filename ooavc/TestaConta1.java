package ooavc;

public class TestaConta1 {

	public static void main(String[] args) {
		Conta c1 = new ContaPoupança();
		
		c1.numero = 001;
		c1.nome = "Jorge";
		c1.saldo = 2432.00;
		c1.limite = 100.0;
		
		System.out.println("Número da conta: "+c1.numero);
		System.out.println("Titular: "+c1.nome);
		System.out.println("Saldo atual: "+c1.saldo);
		System.out.println("Limite: "+c1.limite);
		
		c1.sacar(15000);
		System.out.println("Saldo atual: "+c1.saldo);

	}

}
