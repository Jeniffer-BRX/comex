package br.com.comex.ws;

import java.sql.Connection;
import java.sql.SQLException;

import java.util.List;
import javax.jws.WebService;

import br.com.comex.dao.CategoriaDAO;
import br.com.comex.factory.ConnectionFactory;
import br.com.comex.modelo.Categoria;

@WebService
public class CategoriaWS {

		Connection conn = new ConnectionFactory().recuperarConexao();
		CategoriaDAO catDAO = new CategoriaDAO(conn);
	
		private CategoriaDAO dao = new CategoriaDAO(conn);

		public List<Categoria> getCategorias() throws SQLException {
			System.out.println("Chamando Categorias: ");
			return dao.listarCategorias();
		}
}
