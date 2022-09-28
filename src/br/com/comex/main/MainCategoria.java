package br.com.comex.main;
import java.lang.String;

import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.StatusCategoria;


public class MainCategoria {

	public static void main(String[] args) {
		try {			
			Categoria categoria1 = new Categoria(5, "INFORMATICA", StatusCategoria.ATIVA);
			System.out.println("CATEGORIA: " + categoria1.getNome_cat() + "( " + categoria1.getId_cat() + " - "
					+ categoria1.getStatus().name().toLowerCase() + " )");

			Categoria categoria2 = new Categoria(1, "MOVEIS", StatusCategoria.INATIVA);
			System.out.println("CATEGORIA: " + categoria2.getNome_cat() + "( " + categoria2.getId_cat() + " - "
					+ categoria2.getStatus().name().toLowerCase() + " )");

			Categoria categoria3 = new Categoria(2, "LIVROS", StatusCategoria.ATIVA);
			System.out.println("CATEGORIA: " + categoria3.getNome_cat() + "( " + categoria3.getId_cat() + " - "
					+ categoria3.getStatus().name().toLowerCase() + " )");
			
			
			System.out.println("\n\n-------Teste Erros------");
			Categoria testeErro = new Categoria (0, "EC", StatusCategoria.ATIVA);

			System.out.println("Categoria: " +testeErro.getId_cat() + "-  " + testeErro.getNome_cat() + "- " + testeErro.getStatus());
			
		}catch (IllegalArgumentException erro) {
			System.out.println("Erro!! Verifique!  " + erro.getMessage());
			System.out.println("----------------");
		}
	}
	
}	
