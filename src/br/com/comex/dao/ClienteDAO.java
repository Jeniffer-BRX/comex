package br.com.comex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.modelo.Cliente;

public class ClienteDAO {

	public Connection conexao;

	public ClienteDAO (Connection conexao) { // SUGESTAO BOAS PATRICAS, SOBRE CONEXAO
		this.conexao = conexao;
	}
	
	public void inserir(Cliente cliente) throws SQLException {
		String sql = "INSERT INTO COMEX.CLIENTE "
				+ "(NOME, CPF, TELEFONE, RUA, NUMERO, COMPLEMENTO, BAIRRO, CIDADE, UF)" 
				+ " VALUES"
				+ " (?,?,?,?,?,?,?,?,?)";

		PreparedStatement comando = conexao.prepareStatement(sql);
		comando.setString(1, cliente.getNomeCliente());
		comando.setInt(2, cliente.getCpf());
		comando.setString(3, cliente.getTelefone());
		comando.setString(4, cliente.getRua());
		comando.setInt(5, cliente.getNumero());
		comando.setString(6, cliente.getComplemento());
		comando.setString(7, cliente.getBairro());
		comando.setString(8, cliente.getCidade());
		comando.setString(9, cliente.getUf());

		comando.execute(); 

		comando.close();
	}
	
	public void alterar(Cliente cliente) throws SQLException {
		String sql = "UPDATE COMEX.CLIENTE "
				+ "(NOME, CPF, TELEFONE, RUA, NUMERO, COMPLEMENTO, BAIRRO, CIDADE, UF)" 
				+ " VALUES"
				+ " (?,?,?,?,?,?,?,?,?)";

		PreparedStatement comando = conexao.prepareStatement(sql);
		comando.setString(1, cliente.getNomeCliente());
		comando.setInt(2, cliente.getCpf());
		comando.setString(3, cliente.getTelefone());
		comando.setString(4, cliente.getRua());
		comando.setInt(5, cliente.getNumero());
		comando.setString(6, cliente.getComplemento());
		comando.setString(7, cliente.getBairro());
		comando.setString(8, cliente.getCidade());
		comando.setString(9, cliente.getUf());

		comando.execute(); 

	}
	
	public void excluir(Long id) throws SQLException {
		String sql = "DELETE FROM COMEX.CLIENTE WHERE ID = ?";

		PreparedStatement ps = conexao.prepareStatement(sql);
		ps.setLong(1, id);
		ps.execute();

	}
	
	private Cliente populaCliente (final ResultSet res) throws SQLException {
		Cliente clie = new Cliente(res.getString("nome"),
									  res.getInt("cpf"),
									  res.getString("telefone"),
									  res.getString("rua"),
									  res.getInt("numero"),
									  res.getString("complemento"),
									  res.getString("bairro"),
									  res.getString("cidade"),
									  res.getString("uf"));
		clie.setId(res.getLong("id"));
		return clie;
	}
	
	public List<Cliente> listarClientes() throws SQLException {
		String sql = "SELECT * FROM comex.cliente";

		PreparedStatement cp = conexao.prepareStatement(sql);

		List<Cliente> clientes = new ArrayList<>();
		
		ResultSet reg = cp.executeQuery();
		
		while (reg.next()) {
			Cliente cli = this.populaCliente(reg);
			clientes.add(cli);
		}

		return clientes;
	}
	
	public Cliente buscarId(long id) throws SQLException {
		String sql = "SELECT * FROM COMEX.cliente WHERE ID = ?";

		try (PreparedStatement ps = this.conexao.prepareStatement(sql)) {
			ps.setLong(1, id);

			try (ResultSet regs = ps.executeQuery()) {
				Cliente cli = null;
				if (regs.next()) {
					cli = this.populaCliente(regs);
				}

				return cli;
			}
		}
	}
	
}
