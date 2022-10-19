package br.com.comex.ws;

import java.sql.SQLException;

import java.util.List;
import javax.jws.WebService;

import br.com.comex.dao.CategoriaDAO;
import br.com.comex.modelo.Categoria;

@WebService
public class CategoriaWS {

		private CategoriaDAO dao = new CategoriaDAO(null);

		public List<Categoria> getCategorias() throws SQLException {
			System.out.println("Chamando Categorias");
			return dao.listarTodos();
		}
}
