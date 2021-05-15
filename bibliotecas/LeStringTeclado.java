package bibliotecas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LeStringTeclado {

	public static void main(String[] args) {
		System.out.println("Digite uma mensagem: ");
		InputStream is = System.in;//InputStream: classe que sabe capturar um byte
//nesse caso, recebendo-o da entrada padrão do system.
		InputStreamReader isr = new InputStreamReader(is);
		//ISR sabe receber um byte e transforma-lo em char
		BufferedReader br = new BufferedReader(isr);
		//br sabe receber varios char e armazerna-los num buffer,
		//transformando-os em string.
		//char c;
		
		String s;
		try {
			//c= (char) isr.read();
			s = br.readLine();
			System.out.println("Você digitou a mensagem: "+s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
