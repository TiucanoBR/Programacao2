package excecoes;

import java.io.FileNotFoundException;


public class TesteException5 {
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws FileNotFoundException {
		TesteException4 t1 = new TesteException4();
			t1.metodo1();

	}

}
