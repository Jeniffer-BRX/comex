package comex;

public class ProdutoIsento extends Produto{

		

		public ProdutoIsento () {} //construtor
		
		
		@Override
		public double calculaImposto () { //isento
			setImpostoT(0);
			return 0;
		}
		
		
		
		
	}
