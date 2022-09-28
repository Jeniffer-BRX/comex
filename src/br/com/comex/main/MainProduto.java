package br.com.comex.main;

import br.com.comex.modelo.Produto;

public class MainProduto {

	public static void main(String[] args) {

		Produto produto1 = new Produto();
		produto1.setId_produto(1);
		produto1.setNome_prod("Notebook Samsung");
		produto1.setDescricao("Intel Core I5, 4GB, 500HD");
		produto1.setPreco_uni(3520);
		produto1.setQtd_estoque(1);
		produto1.setCategoria("Informatica");

		Produto produto2 = new Produto();
		produto2.setId_produto(2);
		produto2.setNome_prod("Clean Architecture");
		produto2.setDescricao("432 paginas, Idioma-Ingles, 10/09/2017");
		produto2.setPreco_uni(102.90);
		produto2.setQtd_estoque(2);
		produto2.setCategoria("Livros");
		produto2.setImposto(0);

		Produto produto3 = new Produto();
		produto3.setId_produto(3);
		produto3.setNome_prod("Monitor Dell 27");
		produto3.setDescricao("LED SE22222H HDMI/VGA");
		produto3.setPreco_uni(1889);
		produto3.setQtd_estoque(3);
		produto3.setCategoria("Informatica");


		System.out.println("Produto: " + produto1.getId_produto() + "\nNome: " + produto1.getNome_prod() + "\nDescricao: " + produto1.getDescricao() + "\nPreco Unitario: "
				+ produto1.getPreco_uni() + "\nQtd Estoque: " + produto1.getQtd_estoque() + "\nCategoria: " + produto1.getCategoria());
		System.out.println("\n --**--**-- \n");
		System.out.println("Produto: " + produto2.getId_produto() + "\nNome:  " + produto2.getNome_prod()+ "\nDescricao: " + produto2.getDescricao() + "\nPreco Unitario: "
				+ produto2.getPreco_uni() + "\nQtd Estoque: " + produto2.getQtd_estoque() + "\nCategoria: " + produto2.getCategoria());
		System.out.println("\n --**--**-- \n");
		System.out.println("Produto: " + produto3.getId_produto() + "\nNome:  " + produto3.getNome_prod()+ "\nDescricao: " + produto3.getDescricao() + "\nPreco Unitario: "
				+ produto3.getPreco_uni() + "\nQtd Estoque: " + produto3.getQtd_estoque() + "\nCategoria: " + produto3.getCategoria());

		System.out.println("\n --**--**-- \n");
		
		System.out.println("\n-- TOTAL DE ESTOQUE POR PRODUTO:  ");
		System.out.println("* Valor total do estoque: " + produto1.calcTotalEstoque() + " do produto: " + produto1.getId_produto()+ " " + produto1.getNome_prod());
		System.out.println("* Valor total do estoque: " + produto2.calcTotalEstoque() + "  do produto: " + produto2.getId_produto()+ " " + produto2.getNome_prod());
		System.out.println("* Valor total do estoque: " + produto3.calcTotalEstoque() + " do produto: " + produto3.getId_produto()+ " " + produto3.getNome_prod());
		
		System.out.println("\n-- TOTAL DE IMPOSTO UNITARIO POR PRODUTO:  ");
		System.out.println("* Valor total do imposto: " + produto1.calculaImposto() + " - do produto: " + produto1.getId_produto()+ " " + produto1.getNome_prod());
		System.out.println("* Valor total do imposto: " + produto2.calculaImposto() + "    - do produto: " + produto2.getId_produto()+ " " + produto2.getNome_prod());
		System.out.println("* Valor total do imposto: " + produto3.calculaImposto() + "  - do produto: " + produto3.getId_produto()+ " " + produto3.getNome_prod());
		
		
		
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