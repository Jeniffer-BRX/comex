package br.com.comex.main;

import java.sql.SQLException;
import br.com.comex.factory.ConnectionFactory;

public class MainTestaConexao {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory con = new ConnectionFactory();

			
			System.out.println("Conectado com sucesso, ... \nFechando conexao!!");
			con.recuperarConexao().close();
			
	}

}
