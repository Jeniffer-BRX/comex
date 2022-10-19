package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.comex.factory.ConnectionFactory;

public class MainAlterarCategoria {
	
	public static void main(String[] args) throws SQLException {
		ConnectionFactory factory = new ConnectionFactory();
		Connection conn = factory.recuperarConexao();
		
		try {
			String sql = "UPDATE COMEX.CATEGORIA SET NOME = 'LIVROS TECNICOS' WHERE NOME = 'LIVROS'";
			
			PreparedStatement stm = conn.prepareStatement(sql);
			stm.executeUpdate();
		
			Integer linhas= stm.getUpdateCount();
			System.out.println("Quantidade de linhas que foram modificadas: " + linhas);
			
			
			stm.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
