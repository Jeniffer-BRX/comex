package br.com.comex.csv;

import java.util.List;

public class MontanteTotalVendas {

	public double calcularMontanteTotalVendas (List<PedidoCsv> mTotalVenda) {
		PedidoCsv ped = new PedidoCsv();
		double total = 0;

		for (PedidoCsv totais : mTotalVenda) {
			
			 total = total + ped.getValorTotal(); //sugestao de alteracao cacio
		
		}return total;	
	}

}