package br.com.comex.ws;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import br.com.comex.dao.CategoriaDAO;
import br.com.comex.dao.ClienteDAO;
import br.com.comex.dao.ProdutosDAO;
import br.com.comex.factory.ConnectionFactory;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.Produto;

@WebService
public class ComexWS {

	Connection conn = new ConnectionFactory().recuperarConexao();
	
	CategoriaDAO cDAO = new CategoriaDAO(conn);
	ProdutosDAO ptDAO = new ProdutosDAO(conn);
	ClienteDAO cliDao = new ClienteDAO(conn);
	
	Categoria categoria = new Categoria();
	
	
	@WebMethod(operationName = "listarCategorias")
	public List<Categoria> getCategorias() throws SQLException {
		System.out.println("Chamando Categorias: ");
		List<Categoria> cat = cDAO.listarCategorias();
		return cat;
	}
	
	@WebMethod(operationName = "listarProdutos")
	public List<Produto> getProdutos () throws SQLException{
		System.out.println("Chamando produtos: ");
		return ptDAO.listarProdutos();
	}
	
	@WebMethod(operationName = "listarClientes")
	public List<Cliente> getClientes () throws SQLException{
		System.out.println("Chamando clientes: ");
		return cliDao.listarClientes();
		
	}
	// TODO fazer , nao terminado
	@WebMethod(operationName = "adicionarCategorias")
	public void adicionarCategoria () {
		System.out.println("Inserindo Categorias: ");
		return;
	}
	
	
}
