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
		stm.execute("UPDATE CATEGORIA SET NOME = 'LIVROS TECNICOS' WHERE NOME = 'LIVROS';)" , 
				Statement.RETURN_GENERATED_KEYS);
		
		
		Integer linhasModificadas = stm.getUpdateCount();

		System.out.println("Quantidade de linhas que foram modificadas: " + linhasModificadas);
		stm.close();
		connection.close();
	}

}


//update comex.categoria set nome = 'LIVROS' where nome = 'LIVROS TECNICOS';