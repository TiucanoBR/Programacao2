package bibliotecas;

public class TestaString1 {

	public static void main(String[] args) {
		//String a = new String("Java ADS na veia");
		String a = "Java ADS na veia";
		String b = "Java ADS na veia";
		//int a = 2;
		//int b = 2;
		if(a==b) {
			System.out.println("A e B são iguais");
		}else {
			System.out.println("A e B são diferentes");
		}

		if(a.equals(b)) {
			System.out.println("A e B são iguais");
		}else {
			System.out.println("A e B são diferentes");
		}
	}

}
