package br.com.comex.main;

import br.com.comex.modelo.Produto;

public class MainProduto {

	public static void main(String[] args) {

		try {
			
			Produto produto1 = new Produto(5,"Notebook Samsung",3520,1, "Informatica");

			Produto produto2 = new Produto(10,"Clean Architecture", 102.90,2, "Livros");

			Produto produto3 = new Produto(4, "Monitor Dell 27",1889,3,"Informatica");

			System.out.println("Produto: " + produto1.getIdProduto() + "\nNome: " + produto1.getNomeProd() + "\nDescricao: " + produto1.getDescricao() + "\nPreco Unitario: "
					+ produto1.getPrecoUnit() + "\nQtd Estoque: " + produto1.getQtdEstoque() + "\nCategoria: " + produto1.getCategoria());
			System.out.println("\n --**--**-- \n");
			System.out.println("Produto: " + produto2.getIdProduto() + "\nNome:  " + produto2.getNomeProd()+ "\nDescricao: " + produto2.getDescricao() + "\nPreco Unitario: "
					+ produto2.getPrecoUnit() + "\nQtd Estoque: " + produto2.getQtdEstoque() + "\nCategoria: " + produto2.getCategoria());
			System.out.println("\n --**--**-- \n");
			System.out.println("Produto: " + produto3.getIdProduto() + "\nNome:  " + produto3.getNomeProd()+ "\nDescricao: " + produto3.getDescricao() + "\nPreco Unitario: "
					+ produto3.getPrecoUnit() + "\nQtd Estoque: " + produto3.getQtdEstoque() + "\nCategoria: " + produto3.getCategoria());

			
			System.out.println("\n --**--**-- \n");
			
			System.out.println("\n-- TOTAL DE ESTOQUE POR PRODUTO:  ");
			System.out.println("* Valor total do estoque: " + produto1.calcTotalEstoque() + " do produto: " + produto1.getIdProduto()+ " " + produto1.getNomeProd());
			System.out.println("* Valor total do estoque: " + produto2.calcTotalEstoque() + "  do produto: " + produto2.getIdProduto()+ " " + produto2.getNomeProd());
			System.out.println("* Valor total do estoque: " + produto3.calcTotalEstoque() + " do produto: " + produto3.getIdProduto()+ " " + produto3.getNomeProd());
			
			System.out.println("\n-- TOTAL DE IMPOSTO UNITARIO POR PRODUTO:  ");
			System.out.println("* Valor total do imposto: " + produto1.calculaImposto() + " - do produto: " + produto1.getIdProduto()+ " " + produto1.getNomeProd());
			System.out.println("* Valor total do imposto: " + produto2.calculaImposto() + "    - do produto: " + produto2.getIdProduto()+ " " + produto2.getNomeProd());
			System.out.println("* Valor total do imposto: " + produto3.calculaImposto() + "  - do produto: " + produto3.getIdProduto()+ " " + produto3.getNomeProd());
			
			
			
	} catch (IllegalArgumentException erro) {
			System.out.println("** Erro:   " + erro.getMessage());
		}


		
	}

	
}

/*
 * id 1, nome Notebook Samsung, preço unitário 3523.00, quantidade em estoque 1,
 * categoria Informática id 2, nome Clean Architecture, preço unitário 102.90,
 * quantidade em estoque 2, categoria Livros id 3, nome Monitor Dell 27, preço
 * unitário 1889.00, quantidade em estoque 3, categoria Informática Em seguida,
 * imprima todas as informações do produto, incluindo o nome da categoria. 
 * 
 * Não deixe de imprimir também o valor total em estoque e o imposto. Invente uma
 * formatação bacana para a saída!
 */