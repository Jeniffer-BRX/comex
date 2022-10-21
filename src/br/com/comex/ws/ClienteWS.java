package br.com.comex.ws;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.jws.WebService;

import br.com.comex.dao.ClienteDAO;
import br.com.comex.factory.ConnectionFactory;
import br.com.comex.modelo.Cliente;

@WebService
public class ClienteWS {
	
	Connection conn = new ConnectionFactory().recuperarConexao();
	
	ClienteDAO cliDao = new ClienteDAO(conn);

	public List<Cliente> getClientes () throws SQLException{
		System.out.println("Chamando clientes: ");
		return cliDao.listarClientes();
		
	}
	
	
	
}
