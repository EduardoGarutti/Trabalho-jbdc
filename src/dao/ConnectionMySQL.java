package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMySQL {

	private static Connection conn = null; 
	
	  
	public static Connection getConnection() {
		
		String url = "jdbc:mysql://localhost:3306/SerasaGames?useSSL=false&allowPublicKeyRetrieval=true";
		String user = "root";
		String password = "root";
			try {
				conn = DriverManager.getConnection(url, user, password);
				if (conn != null) {
					System.out.println("STATUS--->Conectado com sucesso!");
				} else {
					System.out.println("STATUS--->Não foi possivel realizar conexão");
				}
				return conn;
			} catch (SQLException e) {
				System.out.println("Nao foi possivel conectar ao Banco de Dados.");
				return null;
			}
		
		}
	
	public static void closeConnection() {
		if(conn != null) {
			try {
				conn.close();
				conn = null;
			} 
			catch(SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
