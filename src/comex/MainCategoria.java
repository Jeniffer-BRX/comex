package comex;

import java.lang.String;
import comex.Categoria.statusC;

public class MainCategoria {

	public static void main(String[] args) {

		Categoria categoria1 = new Categoria();
		categoria1.setId_cat(1);
		categoria1.setNome_cat("INFORMATICA");
		categoria1.setStatusC(statusC.ATIVA);

		Categoria categoria2 = new Categoria();
		categoria2.setId_cat(2);
		categoria2.setNome_cat("MOVEIS");
		categoria2.setStatusC(statusC.INATIVA);

		Categoria categoria3 = new Categoria();
		categoria3.setId_cat(1);
		categoria3.setNome_cat("LIVROS");
		categoria3.setStatusC(statusC.ATIVA);

		System.out.println("CATEGORIA: " + categoria1.getNome_cat() + "( " + categoria1.getId_cat() + " - "
				+ categoria1.getStatusC() + " )");
		System.out.println("CATEGORIA: " + categoria2.getNome_cat() + "( " + categoria2.getId_cat() + " - "
				+ categoria2.getStatusC() + " )");
		System.out.println("CATEGORIA: " + categoria3.getNome_cat() + "( " + categoria3.getId_cat() + " - "
				+ categoria3.getStatusC() + " )");

	}

}
