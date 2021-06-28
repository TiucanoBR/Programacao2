package persistence;

import java.sql.Connection;
import java.sql.SQLException;

public class TesteConnectionFactory {

	public static void main(String[] args) {
		try {
			Connection con = ConnectionFactory.getConnection();
			System.out.println("Conectado com mysql");
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}