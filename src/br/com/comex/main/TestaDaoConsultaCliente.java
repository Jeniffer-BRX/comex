package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.comex.dao.ClienteDAO;
import br.com.comex.factory.ConnectionFactory;
import br.com.comex.modelo.Cliente;

public class TestaDaoConsultaCliente {

	public static void main(String[] args) throws SQLException {
		
		try {
			Connection conn = new ConnectionFactory().recuperarConexao();
			ClienteDAO cliDAO = new ClienteDAO(conn);
			
			List<Cliente> cli = cliDAO.listarClientes();
			
			for (Cliente cliente : cli) {
				System.out.println(cliente);				
			}
			conn.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
