package br.com.comex.ws;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.jws.WebService;

import br.com.comex.dao.CategoriaDAO;
import br.com.comex.dao.ProdutosDAO;
import br.com.comex.factory.ConnectionFactory;
import br.com.comex.modelo.Produto;

@WebService
public class ProdutoWS {

	Connection conn = new ConnectionFactory().recuperarConexao();
	
	private ProdutosDAO pDao = new ProdutosDAO(conn);
	
	public List<Produto> getProdutos () throws SQLException{
		System.out.println("Chamando produtos: ");
		return pDao.listarTodos();
	}
	
}
