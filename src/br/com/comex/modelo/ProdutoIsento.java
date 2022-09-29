package br.com.comex.modelo;

public class ProdutoIsento extends Produto {

	public ProdutoIsento() {
		
	} 

	public double calculaIsento() { // isento

		if (getIdProduto() == 2) {
			setImpostoT(0);
		}
		return 0;

	}

}
