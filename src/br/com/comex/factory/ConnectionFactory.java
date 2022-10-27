package br.com.comex.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection recuperarConexao(){
		
		try {
			return DriverManager.getConnection
					("jdbc:oracle:thin:@//0.0.0.0:1522/xe","system", "admin");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
		
}
//link - jdbc:oracle:thin:@localhost:1522:xe, system, ora123
