package br.com.comex.main;

import java.lang.String;

import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.StatusCategoria;

public class MainCategoria {

	public static void main(String[] args) {
		try {
			System.out.println("-----------Teste Erros-----------");
			System.out.println("---------------------------------");
			System.out.println("ID   | NOME              | STATUS");
			System.out.println("---------------------------------");
			
			Categoria testeErro = new Categoria("INFORMATICA ", StatusCategoria.INATIVA);
			System.out.println(" " + testeErro.getId() + "  -  " + testeErro.getNome() + "      -  " + testeErro.getStatus());

			
			Categoria teste = new Categoria(3, "MOVEIS ", StatusCategoria.ATIVA);
			System.out.println(" " + teste.getId() + "  -  " + teste.getNome() + "           -  " + teste.getStatus());
			
			
			Categoria testeNOVO = new Categoria(4, "LIVROS ", StatusCategoria.ATIVA);
			System.out.println(" " + testeNOVO.getId() + "  -  " + testeNOVO.getNome() + "           -  " + testeNOVO.getStatus());
			
			
			Categoria teste1 = new Categoria ("teste", StatusCategoria.TESTE);
			System.out.println(" " + teste1.getId() + "  -  " + teste1.getNome() + "           -  " + teste1.getStatus());
			
		} catch (IllegalArgumentException erro) {
			System.out.println("** Erro:   " + erro.getMessage());
		}
	}

}
