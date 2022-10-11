package br.com.comex.main;

import java.sql.Connection;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.comex.factory.ConnectionFactory;

public class MainInsercaoCategoria {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.recuperarConexao();

		Statement stm = connection.createStatement();
		stm.execute("INSERT INTO comex.CATEGORIA (ID, NOME, STATUS) VALUES (1,'INFORMATICA', 'ATIVA')"
				, Statement.RETURN_GENERATED_KEYS);
		
		stm.execute("INSERT INTO comex.CATEGORIA (ID, NOME, STATUS) VALUES (2,'MOVEIS', 'INATIVA')"
				, Statement.RETURN_GENERATED_KEYS);
		
		stm.execute("INSERT INTO comex.CATEGORIA (ID, NOME, STATUS) VALUES (3,'LIVROS', 'ATIVA')"
				, Statement.RETURN_GENERATED_KEYS);

		// TODO AJUSTAR O ID AUTO INCREMENT 
//		ResultSet rst = stm.getGeneratedKeys();
//		while(rst.next()) {
//			 Integer id = rst.getInt("ID");
//			System.out.println("O id criado foi: " + id);
//		}
		
		System.out.println(" iNSERIDO! ");
		//rst.close();
		stm.close();
		connection.close();

	}
}

/*
 * 
 * nome INFORMÁTICA, status ativa
nome MÓVEIS, status inativa
nome LIVROS, status ativa
 */
