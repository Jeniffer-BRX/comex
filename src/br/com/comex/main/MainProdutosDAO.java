package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.comex.dao.ProdutosDAO;
import br.com.comex.factory.ConnectionFactory;
import br.com.comex.modelo.Produto;

public class MainProdutosDAO {

	public static void main(String[] args) throws SQLException {
		Connection conn = new ConnectionFactory().recuperarConexao();
		
		// inserir
		Produto prod1 = new Produto("Teste novo", "teste de inserir",  1000, 1, 2, "NAO_ISENTO");
		
		ProdutosDAO prodDao = new ProdutosDAO(conn);
		prodDao.inserir(prod1);
		
		conn.close();
		
		//buscar
		List<Produto> prods = prodDao.listarProdutos();
		
		for (Produto produtos : prods) {
			System.out.println(produtos);
		}
		conn.close();		

		//excluir
		prodDao.excluir(2L);
		
		prodDao.listarProdutos();
		
		conn.close();
		
		//alterar com a busca por id
		Produto pt = prodDao.buscarId(1L);
		pt.setNomeProd("Teste");
		pt.setPrecoUnit(200);
		
		prodDao.alterar(pt);
		
		conn.close();
		System.out.println("Alteracao Feita!");
		
	
	}
}
