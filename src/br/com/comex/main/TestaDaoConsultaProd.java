package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.comex.dao.ProdutosDAO;
import br.com.comex.factory.ConnectionFactory;
import br.com.comex.modelo.Produto;

public class TestaDaoConsultaProd {

	public static void main(String[] args) throws SQLException {
		
		try {
			Connection conn = new ConnectionFactory().recuperarConexao();
			ProdutosDAO prodDao = new ProdutosDAO(conn);
			
			List<Produto> prods = prodDao.listarTodos();
			
			for (Produto produtos : prods) {
				System.out.println(produtos);
							}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
