package br.com.comex.csv;

import java.util.List;

public class MontanteTotalVendas {

	public double calcularMontanteTotalVendas (List<PedidoCsv> mTotalVenda) {
		double total = 0;

		for (PedidoCsv totais : mTotalVenda) {
			total = total + Double.parseDouble(totais.getPreco()) * Double.parseDouble(totais.getQuantidade());		
		
		}return total;	
	}

}