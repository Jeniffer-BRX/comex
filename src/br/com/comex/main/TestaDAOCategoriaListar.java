package br.com.comex.main;

import java.sql.Connection;
import java.util.List;

import br.com.comex.dao.CategoriaDAO;
import br.com.comex.dao.ProdutosDAO;
import br.com.comex.factory.ConnectionFactory;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Produto;

public class TestaDAOCategoriaListar {
	
	public static void main(String[] args) {
		
		try {
			Connection conn = new ConnectionFactory().recuperarConexao();
			CategoriaDAO catDAO = new CategoriaDAO(conn);
			
			List<Categoria> cat = catDAO.listarTodos();
			
			for (Categoria categoria : cat) {
				System.out.println(categoria);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
