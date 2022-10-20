package br.com.comex.main;

import java.sql.Connection;

import br.com.comex.factory.ConnectionFactory;

public class MainComexWS {

	public static void main(String[] args) {

		Connection conn = new ConnectionFactory().recuperarConexao();
		
		
		
	}

}
