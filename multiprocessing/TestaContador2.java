package multiprocessing;

public class TestaContador2 {
	public static void main(String[] args) {
		Contador2 c1 = new Contador2();
		c1.setCont(1);
		Thread t1 = new Thread(c1);
		t1.start();
		
		Contador2 c2 = new Contador2();
		c2.setCont(2);
		Thread t2 = new Thread(c2);
		t2.start();
		
		Contador2 c3 = new Contador2();
		c3.setCont(3);
		Thread t3 = new Thread(c3);
		t3.start();
		
		Contador2 c4 = new Contador2();
		c4.setCont(4);
		Thread t4 = new Thread(c4);
		t4.start();
	}
}