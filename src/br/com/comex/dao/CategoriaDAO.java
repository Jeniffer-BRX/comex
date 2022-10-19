package br.com.comex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.StatusCategoria;

public class CategoriaDAO {
	
	public Connection conexao;

	public CategoriaDAO(Connection conexao) { // SUGESTAO BOAS PATRICAS, SOBRE CONEXAO
		this.conexao = conexao;
	}

	public void inserir(Categoria categoria) throws SQLException {
		String sql = "INSERT INTO COMEX.categoria (NOME, STATUS) VALUES (?,?)";

		PreparedStatement comando = conexao.prepareStatement(sql);
		comando.setString(1, categoria.getCategoria());
		comando.setString(2, categoria.getStatus().ATIVA.name()); //
		
		comando.execute(); 
		comando.close();
	}
	public void alterar(Categoria cat) throws SQLException {
		String sql = "UPDATE COMEX.CATEGORIA SET NOME = 'ELETRONICOS', STATUS = 'INATIVA' WHERE NOME = 'TESTE'";

		PreparedStatement ps = conexao.prepareStatement(sql); // fazer o popula categoria
		ps.setLong(1, cat.getId());
		ps.setString(2, cat.getCategoria());
		ps.setString(3, cat.getStatus().name());

		ps.execute();
	}

	public List<Categoria> listarTodos() throws SQLException {
		String sql = "SELECT * FROM COMEX.CATEGORIA";

		PreparedStatement cp = conexao.prepareStatement(sql);
			
			List<Categoria> categoria = new ArrayList<>();
			
			ResultSet reg = cp.executeQuery();
			
			while (reg.next()) {
				Categoria cat = this.populaCat(reg);
				categoria.add(cat);
			}
			
			System.out.println(categoria);
			reg.close();
			conexao.close();

			return categoria;
	}
		

	public void excluir(String nome) throws SQLException {
		String sql = "DELETE FROM COMEX.CATEGORIA WHERE NOME = ?";

		PreparedStatement ps = conexao.prepareStatement(sql);
		ps.setString(1, nome);
		ps.execute();

	}
	
	
	private Categoria populaCat (final ResultSet res) throws SQLException {
		
		Categoria cat = new Categoria(res.getString("nome"), res.getString("status"));
		cat.setId(res.getLong("id"));
		return cat;
	}

}
