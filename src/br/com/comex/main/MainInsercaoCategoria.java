package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.comex.factory.ConnectionFactory;

public class MainInsercaoCategoria {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.recuperarConexao();
		String[] coluna = { "ID" };
		
		String sql = "INSERT INTO COMEX.CATEGORIA (NOME, STATUS) VALUES (?, ?)";
		
		PreparedStatement stm = connection.prepareStatement(sql);
		PreparedStatement comando = connection.prepareStatement(sql, coluna);
		
		adicionarVariavel("MOVEIiS", "INATIVA", stm);
		adicionarVariavel("INFORMATICA", "ATIVA", stm);
		adicionarVariavel("LIVROS", "ATIVA", stm);
		adicionarVariavel("testsVee", "ATIVA", stm);
		
		
		System.out.println(" iNSERIDO! ");
		//produto.setId(rs.getLong(1));
		stm.close();
		comando.close();
		connection.close();

	}

	private static void adicionarVariavel(String nome, String status, PreparedStatement stm) throws SQLException {
		stm.setNString(1, nome);
		stm.setString(2, status);

		stm.execute();
		
		ResultSet rs = stm.getGeneratedKeys();
		rs.next();


		
	}
}
