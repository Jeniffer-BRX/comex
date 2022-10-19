package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.dao.ProdutosDAO;
import br.com.comex.factory.ConnectionFactory;
import br.com.comex.modelo.Produto;

public class TestaDaoAlterarProd {

	public static void main(String[] args) throws SQLException {
		
		Connection conn = new ConnectionFactory().recuperarConexao();
		ProdutosDAO prodDao = new ProdutosDAO(conn);
		
		Produto pt = prodDao.buscarId(2L);
		pt.setNomeProd("Teste");
		pt.setPrecoUnit(200);
		
		prodDao.alterar(pt);
		
		conn.close();
		System.out.println("Alteracao Feita!");
		
	}
}
