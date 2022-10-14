package br.com.comex.old;

public class MainCliente {

	public static void main(String[] args) {
		
		try {
			
			Cliente teste = new Cliente(3, "jeniffer", 22222222, "151516", "Abilio de mattos", 123, "casa 239", "jd novo horizonte", "Ds", "MS");

			
			System.out.println("Cliente : " +teste.getNomeCliente()+ " \n" 
			+ teste.getCpf()+ " \n" 
			+ teste.getTelefone()+ " \n" 
			+ teste.getRua()+ " - " 
			+ teste.getNumeroCasa() + " \n" 
			+ teste.getComplemento() + " \n"
			+ teste.getBairro() + " \n" 
			+ teste.getCidade() + " "
			+ teste.getEstado()+ " ");
			
		}catch (IllegalArgumentException erro) {
			System.out.println("** Erro:   " + erro.getMessage());
			}

	}
}	
	
