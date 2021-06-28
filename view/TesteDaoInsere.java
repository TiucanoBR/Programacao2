package view;

import java.sql.SQLException;

import model.Contato;
import regrasdenegocios.ContatoDao;

public class TesteDaoInsere {
	public static void main(String[] args) {
		try {
			Contato contato = new Contato();
			contato.setNome("Julia");
			contato.setEmail("Ju@gmail.com");
			contato.setEndereco("Casa do caralho, 1000");

			ContatoDao dao = new ContatoDao();
			dao.adiciona(contato);
			
			System.out.println("Contato salvo!");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
