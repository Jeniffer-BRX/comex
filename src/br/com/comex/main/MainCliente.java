package br.com.comex.main;

import br.com.comex.modelo.Cliente;

public class MainCliente {

	public static void main(String[] args) {
		
		try {
			
			Cliente teste = new Cliente((long) 3, "jeniffer", 22222222, "151516", "Abilio de mattos", 123, "casa 239", "jd novo horizonte", "Ds", "MS");

			
			System.out.println("Cliente : " +teste.getNomeCliente()+ " \n" 
			+ teste.getCpf()+ " \n" 
			+ teste.getTelefone()+ " \n" 
			+ teste.getRua()+ " - " 
			+ teste.getNumero() + " \n" 
			+ teste.getComplemento() + " \n"
			+ teste.getBairro() + " \n" 
			+ teste.getCidade() + " "
			+ teste.getUf()+ " ");
			
		}catch (IllegalArgumentException erro) {
			System.out.println("** Erro:   " + erro.getMessage());
			}

	}
}	
	
