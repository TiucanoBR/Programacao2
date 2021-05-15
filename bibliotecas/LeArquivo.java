package bibliotecas;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LeArquivo {
	public static void main(String[] args) {
		// System.out.println("Digite uma mensagem: ");
		// InputStream is = System.in;//InputStream: classe que sabe capturar um byte
//nesse caso, recebendo-o da entrada padr�o do system
		try {
			InputStream is = new FileInputStream("teste2.txt");
			InputStreamReader isr = new InputStreamReader(is);
			// ISR sabe receber um byte e transforma-lo em char
			BufferedReader br = new BufferedReader(isr);
			// br sabe receber varios char e armazerna-los num buffer,
			// transformando-os em string.
			// char c;

			String s;
			// try {
			// c= (char) isr.read();
			s = br.readLine();//readLine s� sabe ler uma unica linha.
			//System.out.println("Voc� digitou a mensagem: " + s);
			System.out.println(s);
			while(s != null) {
				System.out.println(s);
				s = br.readLine();
			}
			br.close();
			isr.close();
			is.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
