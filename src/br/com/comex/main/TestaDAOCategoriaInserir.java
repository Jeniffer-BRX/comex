package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.dao.CategoriaDAO;
import br.com.comex.factory.ConnectionFactory;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.StatusCategoria;

public class TestaDAOCategoriaInserir {

	public static void main(String[] args) throws SQLException {
		
			Connection conn = new ConnectionFactory().recuperarConexao();
			
			Categoria caT = new Categoria("Eletronicos", StatusCategoria.ATIVA);
			System.out.println(caT.toString());
			
			CategoriaDAO categorias = new CategoriaDAO(conn);
			categorias.inserirCategoria(caT);
			
			conn.close();
	
	}

}
