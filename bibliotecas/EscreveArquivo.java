package bibliotecas;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class EscreveArquivo {
	public static void main(String[] args) {
		// System.out.println("Digite uma mensagem: ");
		// InputStream is = System.in;//InputStream: classe que sabe capturar um byte
//nesse caso, recebendo-o da entrada padr�o do system
		try {
			OutputStream os = new FileOutputStream("teste3.txt");
			// InputStreamReader isr = new InputStreamReader(is);
			OutputStreamWriter osr = new OutputStreamWriter(os);
			// ISR sabe receber um byte e transforma-lo em char
			BufferedWriter bw = new BufferedWriter(osr);
			bw.write("A turma de ADS ama Java!");
			bw.close();
			osr.close();
			os.close();
			System.out.println("Escrita realizada com sucesso");
			// br sabe receber varios char e armazerna-los num buffer,
			// transformando-os em string.
			// char c;

			// String s;
			// try {
			// c= (char) isr.read();
			// s = br.readLine();// readLine s� sabe ler uma unica linha.
			// System.out.println("Voc� digitou a mensagem: " + s);
//			System.out.println(s);
//			while(s != null) {
//				System.out.println(s);
//				s = br.readLine();
//			}
//			br.close();
//			isr.close();
//			is.close();
			// } catch (IOException e) {
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
