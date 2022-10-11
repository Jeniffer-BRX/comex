package br.com.comex.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
	
	public Connection recuperarConexao() throws SQLException {
		return DriverManager
				.getConnection
				("jdbc:oracle:thin:@//localhost:1522/xe","system", "ora123");
	}
	
	
	//link - jdbc:oracle:thin:@localhost:1522:xe, system, ora123
}
