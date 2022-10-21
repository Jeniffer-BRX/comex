package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.dao.ProdutosDAO;
import br.com.comex.factory.ConnectionFactory;

public class TestaDaoExcluirProd {

	public static void main(String[] args) throws SQLException {

		Connection conn = new ConnectionFactory().recuperarConexao();
		ProdutosDAO prodDao = new ProdutosDAO(conn);
		
		prodDao.excluir(7L);
		
		prodDao.listarProdutos();
		
		conn.close();
		
	}

}
