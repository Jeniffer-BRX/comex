package br.com.comex.main;

import br.com.comex.modelo.Cliente;

public class MainCliente {

	public static void main(String[] args) {

		Cliente teste = new Cliente(1, "Jeniffer G", 44444, "252222-0", "Abilio de mattos", 1735, "casa 239", "jd novo horizonte", "Dourados", "MS");

		
		System.out.println("Cliente : " + teste.nomeCliente);
	}

}
