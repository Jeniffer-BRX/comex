package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.dao.ProdutosDAO;
import br.com.comex.factory.ConnectionFactory;
import br.com.comex.modelo.Produto;

public class TestaDaoInserirProd {

	public static void main(String[] args) throws SQLException {
		Connection conn = new ConnectionFactory().recuperarConexao();

		Produto prod1 = new Produto("Testeasda5adad", "teste de inserir", 1000, 1, 2, "NAO_ISENTO");
		
		System.out.println(prod1.toString());
		
		ProdutosDAO prodDao = new ProdutosDAO(conn);
		prodDao.inserir(prod1);
		
		conn.close();
	}
}