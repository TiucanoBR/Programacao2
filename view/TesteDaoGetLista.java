package view;

import java.sql.SQLException;
import java.util.List;

import model.Contato;
import regrasdenegocios.ContatoDao;

public class TesteDaoGetLista {
	public static void main(String[] args) {
		ContatoDao cdao;
		try {
			cdao = new ContatoDao();
			List<Contato> contatos = cdao.getLista();
			
			for (Contato contato : contatos) {
				System.out.println("-------------------------");
				System.out.println("Nome: "+contato.getNome());
				System.out.println("Email: "+contato.getEmail());
				System.out.println("Endereco: "+contato.getEndereco());
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
