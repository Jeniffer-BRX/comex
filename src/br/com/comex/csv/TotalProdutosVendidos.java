package br.com.comex.csv;

import java.util.List;

public class TotalProdutosVendidos {
	
	public int calcularProdutosVendidos (List<PedidoCsv> totais) {
		
		int totalItem = 0;
		for (PedidoCsv pedido : totais) {
			totalItem = totalItem + Integer.parseInt(pedido.getQuantidade());
		}
		return totalItem;
	}
}