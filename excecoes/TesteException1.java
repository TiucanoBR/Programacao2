package excecoes;

public class TesteException1 {
	
	public static void main(String[] args) {
		System.out.println("Início do metodo main");
		metodo1();
		System.out.println("Fim do método main");
	}

	private static void metodo1() {
		System.out.println("Início do método 1");
		metodo2();
		System.out.println("Fim do método 1");
		
	}

	private static void metodo2() {
		System.out.println("Início do metodo 2");
		//faz alguma coisa entre o inicio e o fim do método 2
		int array[];
		array = new int[10];
		try {
				for (int i = 0; i< 20; i++) {
				array[i] = i;
				System.out.println(i);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro pego (catched): "+e);
			
		}
		System.out.println("Fim do método 2");
	}
}
