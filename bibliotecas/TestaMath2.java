package bibliotecas;

public class TestaMath2 {
	public static void main(String[] args) {
		int i = -10;
		int j = Math.abs(i);
		double d1 = 4.49;
		double d2 = 4.0;
		double d3 = Math.round(d1);
		
		//Math.exp calcula com numero de euler (nunca vi isso na minha vida, ou não lembro)
		System.out.println(Math.exp(1));
		
		//Math.log retorna o logaritmo da base.
		System.out.println(Math.log(d2));
		
		//Math.pow retorna a base elevada ao expoente.
		System.out.println(Math.pow(j, d2));
		
		//Math.sqrt retorna raiz quadrada de numero.
		System.out.println(Math.sqrt(d3));
		
		//Log de a na base b
		double d4 = Math.log(16) / Math.log(2);
		System.out.println(d4);
		
		}
}
