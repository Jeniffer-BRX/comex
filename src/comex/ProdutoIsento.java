package comex;

public class ProdutoIsento extends Produto{

		

		public ProdutoIsento () {} //construtor
		
	
		public double calculaIsento() { //isento
			
			if (getId_produto() == 2) {
				setImpostoT(0);
			}
			return 0;
			
		}
		
		
		
		
	}
