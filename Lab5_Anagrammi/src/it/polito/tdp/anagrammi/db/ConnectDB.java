package it.polito.tdp.anagrammi.db;

import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;

public class ConnectDB {
	
	private static final String jdbcURL = "jdbc:mysql://localhost/mark?user=root&password=matteo";
	private static Connection conn;
	
	public static Connection getConnection() {
		try {
			if(conn == null || conn.isClosed()) {
				conn = (Connection) DriverManager.getConnection(jdbcURL);
			}
		} catch(SQLException e) {
			System.err.println("Errore di connessione al DB.\n");
			throw new RuntimeException(e);
		}
			
			return conn;
	}
}