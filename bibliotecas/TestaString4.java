package bibliotecas;

public class TestaString4 {

	public static void main(String[] args) {
		//testaString4: substring, trim, indexOF, lastIndexOf
		
		String a = "Java ADS na veia";
		
		//Substring se usado somente um valor ele retorna todos os chars vindos depois do valor escolhido,
		//se usado dois valores retorna os chars de numero a até numero b, zero based
		System.out.println(a.substring(7));
		System.out.println(a.substring(7, 14));
		
		//no documento diz que .trim serve para retirar espaços de variaveis, não entendi muito bem
		System.out.println(a.trim());
		
		//Retorna a posição da primeira vez que uma palavra ou letra aparece no string
		System.out.println(a.indexOf("v"));
		System.out.println(a.indexOf("veia"));
		
		//retorna a ultima vez que uma palavra ou letra aparece no string
		System.out.println(a.lastIndexOf("v"));
		System.out.println(a.lastIndexOf("va"));		
	}

}
