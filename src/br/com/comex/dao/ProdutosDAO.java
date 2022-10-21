package br.com.comex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.modelo.Produto;

public class ProdutosDAO {

	public Connection conexao;

	public ProdutosDAO(Connection conexao) { // SUGESTAO BOAS PATRICAS, SOBRE CONEXAO
		this.conexao = conexao;
	}

	public void inserir(Produto produto) throws SQLException {
		String sql = "INSERT INTO COMEX.PRODUTO "
				+ "(NOME, DESCRICAO, PRECO_UNITARIO, QUANTIDADE_ESTOQUE, CATEGORIA_ID, TIPO)" + " VALUES"
				+ " (?,?,?,?,?,?)";

		PreparedStatement comando = conexao.prepareStatement(sql);
		comando.setString(1, produto.getNomeProd());
		comando.setString(2, produto.getDescricao());
		comando.setDouble(3, produto.getPrecoUnit());
		comando.setInt(4, produto.getQtdEstoque());
		comando.setInt(5, produto.getCategoria_id());
		comando.setString(6, produto.getTipo());

		comando.execute(); 

		comando.close();
	}
	// 
	public void alterar(Produto prod) throws SQLException {
		String sql = "UPDATE COMEX.PRODUTO " 
				+ " SET NOME = ?,  " 
				+ "       DESCRICAO  = ?,"
				+ "       PRECO_UNI = ?," 
				+ "       QUANTIDADE_ESTOQUE = ?," 
				+ "       TIPO = ?,"
				+ "       CATEGORIA_ID = ?," 
				+ " WHERE ID = ?";

		PreparedStatement ps = conexao.prepareStatement(sql);
		ps.setString(1, prod.getNomeProd());
		ps.setString(2, prod.getDescricao());
		ps.setDouble(3, prod.getPrecoUnit());
		ps.setInt(4, prod.getQtdEstoque());
		ps.setInt(5, prod.getCategoria_id());
		ps.setString(6, prod.getTipo());
		ps.setLong(7, prod.getId());

		ps.execute();
	}

	// add depoosi das duvidas da mentoria
	public Produto buscarId(long id) throws SQLException {
		String sql = "SELECT * FROM COMEX.PRODUTO WHERE ID = ?";

		try (PreparedStatement ps = this.conexao.prepareStatement(sql)) {
			ps.setLong(1, id);

			try (ResultSet regs = ps.executeQuery()) {
				Produto prodt = null;
				if (regs.next()) {
					prodt = this.populaProdutos(regs);
				}

				return prodt;
			}
		}
	}

	public List<Produto> listarProdutos() throws SQLException {
		String sql = "SELECT * FROM comex.produto";

		PreparedStatement cp = conexao.prepareStatement(sql);

		List<Produto> produtos = new ArrayList<>();
		
		ResultSet reg = cp.executeQuery();
		
		while (reg.next()) {
			Produto prod = this.populaProdutos(reg);
			
			produtos.add(prod);
		}
		System.out.println(produtos);
		//reg.close();
		//conexao.close();

		return produtos;
	}

	public void excluir(Long id) throws SQLException {
		String sql = "DELETE FROM COMEX.PRODUTO WHERE ID = ?";

		PreparedStatement ps = conexao.prepareStatement(sql);
		ps.setLong(1, id);
		ps.execute();

	}

// add depoosi das duvidas da mentoria 
	private Produto populaProdutos(ResultSet reg) throws SQLException {
		Produto prod = new Produto(reg.getString("nome"), 
				reg.getString("descricao"),
				reg.getDouble("preco_unitario"), 
				reg.getInt("quantidade_estoque"), 
				reg.getInt("categoria_id"),
				reg.getNString("tipo"));

		prod.setId(reg.getLong("id"));
		return prod;
	}

}