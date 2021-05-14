package bibliotecas;

public class TestaString5 {

	public static void main(String[] args) {
		//testaString5: isEmpty, contains, replace
		String a = "Java ADS na veia";
		String b = "";
		
		//.isEmpty verifica se a string está vazia
		System.out.println(a.isEmpty());
		System.out.println(b.isEmpty());
		
		//.contains verifica se na string existe o char especificado (tem diferença letra mauscula e minuscula)
		System.out.println(a.contains("S"));
		System.out.println(a.contains("s"));
		
		//.replace substitui todos os chars por outro char, também pode substituir palavras
		System.out.println(a.replace("a", "A"));
		System.out.println(a.replace("veia", "VEIA"));
	}

}
