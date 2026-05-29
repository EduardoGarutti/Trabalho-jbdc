package main;

import java.sql.Connection;
import db.ConnectionMySQL;

public class main {

	public static void main(String[] args) {
		Connection conn = ConnectionMySQL.getConnection();
		ConnectionMySQL.closeConnection();
	}

}
