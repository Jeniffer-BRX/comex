package br.com.comex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;

import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.StatusCategoria;

public class CategoriaDAO {
	
	public Connection conexao;

	public CategoriaDAO(Connection conexao) { // SUGESTAO BOAS PATRICAS, SOBRE CONEXAO
		this.conexao = conexao;
	}

	public void inserirCategoria(Categoria categoria) throws SQLException {
		String sql = "INSERT INTO COMEX.categoria (NOME, STATUS) VALUES (?,?)";

		PreparedStatement comando = conexao.prepareStatement(sql);
		comando.setString(1, categoria.getNome());
		comando.setString(2, categoria.getStatus().ATIVA.name()); //
		
		comando.execute(); 
		comando.close();
	}
	
	public void alterarCategoria(Categoria cat) throws SQLException {
		String sql = "UPDATE COMEX.CATEGORIA SET NOME = 'ELETRONICOS', STATUS = 'INATIVA' WHERE NOME = 'TESTE'";

		PreparedStatement ps = conexao.prepareStatement(sql); // fazer o popula categoria
		ps.setLong(1, cat.getId());
		ps.setString(2, cat.getNome());
		ps.setString(3, cat.getStatus().name());

		ps.execute();
	}

	public List<Categoria> listarCategorias() throws SQLException {
		String sql = "SELECT * FROM COMEX.CATEGORIA";
		
		PreparedStatement cp = conexao.prepareStatement(sql);
		
		List<Categoria> categorias = new ArrayList<>();
		
		ResultSet res = cp.executeQuery();
		
		while (res.next()) {
			Categoria cat = this.populaCategoria(res);
			categorias.add(cat);
		}			
		System.out.println(categorias);
		return categorias;
		
	}
		

	public void excluirCategoria(String nome) throws SQLException {
		String sql = "DELETE FROM COMEX.CATEGORIA WHERE NOME = ?";

		PreparedStatement ps = conexao.prepareStatement(sql);
		ps.setString(1, nome);
		ps.execute();

	}
	
	
	private Categoria populaCategoria (ResultSet res) throws SQLException {
		
		Categoria categ = new Categoria(res.getString("nome"), 
				StatusCategoria.valueOf(res.getString("status")));
		categ.setId(res.getLong("id"));
		return categ;
	}

}
