package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.dao.ClienteDAO;
import br.com.comex.factory.ConnectionFactory;
import br.com.comex.modelo.Cliente;

public class TestaDAOClienteInserir {

	public static void main(String[] args) throws SQLException {
		Connection conn = new ConnectionFactory().recuperarConexao();

		Cliente cli = new Cliente("jenifferGteste", 125487888, "88562621", "natal", 1020, "casa", "centro","dourados","ms");
		
		System.out.println(cli.toString());
		
		ClienteDAO clienteDAO = new ClienteDAO(conn);
		clienteDAO.inserir(cli);
		
		conn.close();
	}
	
}
