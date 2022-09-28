package br.com.comex.main;

import java.lang.String;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.StatusCategoria;

public class MainCategoria {

	public static void main(String[] args) {
		try {
			System.out.println("-------Teste Erros------");

			System.out.println("ID   | NOME              | STATUS");
			Categoria testeErro = new Categoria("INFORMATICA ", StatusCategoria.INATIVA);
			System.out.println(" " + testeErro.getId_cat() + "  -  " + testeErro.getNome_cat() + "      -  " + testeErro.getStatus());

			
			Categoria teste = new Categoria(3, "MOVEIS ", StatusCategoria.ATIVA);
			System.out.println(" " + teste.getId_cat() + "  -  " + teste.getNome_cat() + "           -  " + teste.getStatus());
			
			
			Categoria testeNOVO = new Categoria(4, "LIVROS ", StatusCategoria.ATIVA);
			System.out.println(" " + testeNOVO.getId_cat() + "  -  " + testeNOVO.getNome_cat() + "           -  " + testeNOVO.getStatus());
			
			Categoria teste1 = new Categoria ("teste", StatusCategoria.TESTE);
			System.out.println(" " + teste1.getId_cat() + "  -  " + teste1.getNome_cat() + "           -  " + teste1.getStatus());
			
		} catch (IllegalArgumentException erro) {
			System.out.println("** Erro:   " + erro.getMessage());
		}
	}

}
