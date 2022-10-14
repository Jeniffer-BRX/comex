package br.com.comex.main;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.dao.ProdutosDAO;
import br.com.comex.factory.ConnectionFactory;
import br.com.comex.modelo.ProdutosCRUD;

public class TestaDaoAlterarProd {

	public static void main(String[] args) throws SQLException {
		
		Connection conn = new ConnectionFactory().recuperarConexao();
		ProdutosDAO prodDao = new ProdutosDAO(conn);
		
		ProdutosCRUD pt = prodDao.buscarId(2L);
		pt.setNome("Teste");
		pt.setPreco_uni(new BigDecimal(200));
		
		prodDao.alterar(pt);
		
		conn.close();
		System.out.println("Alteracao Feita!");
		
	}
}
