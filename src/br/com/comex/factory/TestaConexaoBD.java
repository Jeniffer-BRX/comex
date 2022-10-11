package br.com.comex.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestaConexaoBD {
	public static void main(String[] args) throws SQLException {

		Connection connection = DriverManager
			.getConnection("jdbc:oracle:thin:@//localhost:1522/xe","system", "ora123");

		System.out.println("Fechando conexao!!");
		
		connection.close();
	}
}
