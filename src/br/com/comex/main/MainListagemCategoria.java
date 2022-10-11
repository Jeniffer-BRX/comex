package br.com.comex.main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.comex.factory.ConnectionFactory;

public class MainListagemCategoria {
	public static void main(String[] args) throws SQLException {
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.recuperarConexao();

		Statement stm = connection.createStatement();
		boolean resultado = stm.execute("SELECT * FROM comex.CATEGORIA");

		ResultSet rst = stm.getResultSet();
		while (rst.next()) {
			int id = rst.getInt("ID");
			String nome = rst.getString("NOME");
			String status = rst.getString("STATUS");
			System.out.println("Categoria: " + id + " " + nome + " " +status);


		}
	}

}
