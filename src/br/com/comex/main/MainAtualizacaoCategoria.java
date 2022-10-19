package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.comex.factory.ConnectionFactory;

public class MainAtualizacaoCategoria {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.recuperarConexao();
		
		Statement stm = connection.createStatement();
		stm.execute("UPDATE COMEX.CATEGORIA SET NOME = 'LIVROS TECNICOS' WHERE NOME = 'LIVROS'");
		
		Integer linhasModificadas = stm.getUpdateCount();
		System.out.println("Quantidade de linhas que foram modificadas: " + linhasModificadas);
		stm.close();
		connection.close();
	}
}
