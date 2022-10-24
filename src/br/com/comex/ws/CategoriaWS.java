package br.com.comex.ws;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import br.com.comex.dao.CategoriaDAO;
import br.com.comex.factory.ConnectionFactory;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.StatusCategoria;

@WebService
public class CategoriaWS {

		Connection conn = new ConnectionFactory().recuperarConexao();
		CategoriaDAO catDAO = new CategoriaDAO(conn);
	
		private CategoriaDAO dao = new CategoriaDAO(conn);

		@WebMethod(operationName = "listarCategorias")
		public List<Categoria> getCategorias() throws SQLException {
			System.out.println("Chamando Categorias: ");
			return dao.listarCategorias();
		}
		
		//TODO ver, não terminado
		@WebMethod(operationName = "adicionarCategorias")
		public void adicionarCategoria() throws SQLException {
			Categoria caT = new Categoria("Eletronicoos", StatusCategoria.ATIVA);
			System.out.println(caT.toString());
			
			CategoriaDAO categorias = new CategoriaDAO(conn);
			categorias.inserirCategoria(caT);
			System.out.println(categorias);
			
		}
}
