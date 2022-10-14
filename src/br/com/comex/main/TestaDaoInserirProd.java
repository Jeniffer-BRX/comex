package br.com.comex.main;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.dao.ProdutosDAO;
import br.com.comex.factory.ConnectionFactory;
import br.com.comex.modelo.ProdutosCRUD; // fiz esse p diferenciar do antigo

public class TestaDaoInserirProd {

	public static void main(String[] args) throws SQLException {
		Connection conn = new ConnectionFactory().recuperarConexao();

		ProdutosCRUD prod1 = new ProdutosCRUD("Testeasda5adad", "teste de inserir", new BigDecimal("1000"), 1, 2, "NAO_ISENTO");
		
		System.out.println(prod1.toString());
		
		ProdutosDAO prodDao = new ProdutosDAO(conn);
		prodDao.inserir(prod1);
		
		conn.close();
	}
}