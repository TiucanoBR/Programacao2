package regrasdenegocios;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import persistence.ConnectionFactory;

public class JdbcInsere {
	public static void main(String[] args) {
		try {
			Connection con = ConnectionFactory.getConnection();
			
			String sql = "insert into contatos (nome, email, endereco) values (?,?,?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			
			Scanner s = new Scanner(System.in);
			
			System.out.println("Informe um nome: ");
			stmt.setString(1, s.nextLine());
			
			System.out.println("Informe um email: ");
			stmt.setString(2, s.nextLine());
			
			System.out.println("Informe um endereco: ");
			stmt.setString(3, s.nextLine());
			
			stmt.execute();
			stmt.close();
			
			System.out.println("Tá no banco fi");
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}