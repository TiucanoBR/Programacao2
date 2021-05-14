package bibliotecas;

public class TestaMath1 {
	public static void main(String[] args) {
		int i = -10;
		System.out.println(i);
		int j = Math.abs(i);
		System.out.println(j);
		System.out.println(Math.abs(i));
		
		double d1 = 4.49;
		System.out.println(d1);
		double d2 = 4.0;
		System.out.println(d2);
		double d3 = Math.round(d1);
		System.out.println(d3);
		
		//max compara dois valores e pega o maior valor????
		double d4 = Math.max(d1, d2);
		System.out.println(d4);
		
		//min compara dois valores e pega o menor valor???
		double d5 = Math.min(d1, d2);
		System.out.println(d5);
		
		//arredonda pra cima
		System.out.println(Math.ceil(d1));
		
		//arredonda para baixo
		System.out.println(Math.floor(d1));
		
		//implementar testamath2 e testar math exp,
		//math.log, math.pow, math.sqrt, log de a na base b
		//implementar testamath3 e ver a diferença de math.sin
		//e math.todegrees, math.toradians
		
		//calcula com numero de euler (nunca vi isso na minha vida, ou não lembro)
		System.out.println(Math.exp(1));	
		//retorna o logaritmo da base
		System.out.println(Math.log(d2));
		//
		System.out.println(Math.pow(j, d2));
		System.out.println(Math.sqrt(d2));
		System.out.println(Math.sin(j));
		System.out.println(Math.toDegrees(j));
		}
}
