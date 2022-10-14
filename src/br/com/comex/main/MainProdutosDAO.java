package br.com.comex.main;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.comex.dao.ProdutosDAO;
import br.com.comex.factory.ConnectionFactory;
import br.com.comex.modelo.ProdutosCRUD; // fiz esse p diferenciar do antigo

public class MainProdutosDAO {

	public static void main(String[] args) throws SQLException {
		Connection conn = new ConnectionFactory().recuperarConexao();
		
		// inserir
		ProdutosCRUD prod1 = new ProdutosCRUD("Teste novo", "teste de inserir", new BigDecimal("1000"), 1, 2, "NAO_ISENTO");
		
		ProdutosDAO prodDao = new ProdutosDAO(conn);
		prodDao.inserir(prod1);
		
		conn.close();
		
		//buscar
		List<ProdutosCRUD> prods = prodDao.listarTodos();
		
		for (ProdutosCRUD produtos : prods) {
			System.out.println(produtos);
		}
		conn.close();		

		//excluir
		prodDao.excluir(2L);
		
		prodDao.listarTodos();
		
		conn.close();
		
		//alterar com a busca por id
		ProdutosCRUD pt = prodDao.buscarId(1L);
		pt.setNome("Teste");
		pt.setPreco_uni(new BigDecimal(200));
		
		prodDao.alterar(pt);
		
		conn.close();
		System.out.println("Alteracao Feita!");
		
	
	}
}
