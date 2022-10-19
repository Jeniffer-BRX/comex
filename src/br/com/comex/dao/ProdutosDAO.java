package br.com.comex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.modelo.ProdutosCRUD;

public class ProdutosDAO {

	public Connection conexao;

	public ProdutosDAO(Connection conexao) { // SUGESTAO BOAS PATRICAS, SOBRE CONEXAO
		this.conexao = conexao;
	}

	public void inserir(ProdutosCRUD produto) throws SQLException {
		String sql = "INSERT INTO COMEX.PRODUTO "
				+ "(NOME, DESCRICAO, PRECO_UNITARIO, QUANTIDADE_ESTOQUE, CATEGORIA_ID, TIPO)" + " VALUES"
				+ " (?,?,?,?,?,?)";

		PreparedStatement comando = conexao.prepareStatement(sql);
		comando.setString(1, produto.getNome());
		comando.setString(2, produto.getDescricao());
		comando.setBigDecimal(3, produto.getPreco_uni());
		comando.setInt(4, produto.getQtd_estoque());
		comando.setInt(5, produto.getCategoria_id());
		comando.setString(6, produto.getTipo());

		comando.execute(); 

		comando.close();
	}
	// TODO com erro ainda, verificar
	public void alterar(ProdutosCRUD prod) throws SQLException {
		String sql = "UPDATE COMEX.PRODUTO " 
				+ " SET NOME = ?  " 
				+ "       DESCRICAO  = ?"
				+ "       PRECO_UNI = ?" 
				+ "       QUANTIDADE_ESTOQUE = ?" 
				+ "       TIPO = ?"
				+ "       CATEGORIA_ID = ?" 
				+ " WHERE ID = ?";

		PreparedStatement ps = conexao.prepareStatement(sql);
		ps.setString(1, prod.getNome());
		ps.setString(2, prod.getDescricao());
		ps.setBigDecimal(3, prod.getPreco_uni());
		ps.setInt(4, prod.getQtd_estoque());
		ps.setInt(5, prod.getCategoria_id());
		ps.setString(6, prod.getTipo());
		ps.setLong(7, prod.getId());

		ps.execute();
	}

	// add depoosi das duvidas da mentoria
	public ProdutosCRUD buscarId(long id) throws SQLException {
		String sql = "SELECT * FROM COMEX.PRODUTO WHERE ID = ?";

		try (PreparedStatement ps = this.conexao.prepareStatement(sql)) {
			ps.setLong(1, id);

			try (ResultSet regs = ps.executeQuery()) {
				ProdutosCRUD prodt = null;
				if (regs.next()) {
					prodt = this.populaProdutos(regs);
				}

				return prodt;
			}
		}
	}

	public List<ProdutosCRUD> listarTodos() throws SQLException {
		String sql = "SELECT * FROM comex.produto";

		PreparedStatement cp = conexao.prepareStatement(sql);

		List<ProdutosCRUD> produtos = new ArrayList<>();
		
		ResultSet reg = cp.executeQuery();
		
		while (reg.next()) {
			ProdutosCRUD prod = this.populaProdutos(reg);
			//prod.setId(reg.getLong("id"));
			
			produtos.add(prod);
		}
		System.out.println(produtos);
		reg.close();
		conexao.close();

		return produtos;
	}

	public void excluir(Long id) throws SQLException {
		String sql = "DELETE FROM COMEX.PRODUTO WHERE ID = ?";

		PreparedStatement ps = conexao.prepareStatement(sql);
		ps.setLong(1, id);
		ps.execute();

	}

// add depoosi das duvidas da mentoria 
	private ProdutosCRUD populaProdutos(ResultSet reg) throws SQLException {
		ProdutosCRUD prod = new ProdutosCRUD(reg.getString("nome"), 
				reg.getString("descricao"),
				reg.getBigDecimal("preco_unitario"), 
				reg.getInt("quantidade_estoque"), 
				reg.getInt("categoria_id"),
				reg.getNString("tipo"));

		prod.setId(reg.getLong("id"));
		return prod;
	}

}