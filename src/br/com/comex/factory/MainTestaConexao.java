package br.com.comex.factory;

import java.sql.SQLException;

public class MainTestaConexao {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory con = new ConnectionFactory();

			
			System.out.println("Conectado com sucesso, ... \nFechando conexao!!");
			con.recuperarConexao().close();
			
	}

}
