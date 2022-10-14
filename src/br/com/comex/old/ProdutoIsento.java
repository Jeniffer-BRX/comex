package br.com.comex.old;

public class ProdutoIsento extends Produto {

	public ProdutoIsento() {
		
	} 

	public double calculaIsento() { // isento

		if (getIdProduto() == 10) {
			setImpostoT(0);
		}
		return 0;

	}

}
