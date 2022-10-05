package br.com.comex.main;

import java.io.FileNotFoundException;
import java.util.List;

import br.com.comex.csv.LeitorPedidosCsv;
import br.com.comex.csv.PedidoCsv;

public class MainPedidoCsv {

	public static void main(String[] args) throws FileNotFoundException {

		LeitorPedidosCsv leitorPedidosCsv = new LeitorPedidosCsv();
		List<PedidoCsv> pedidoCsv = LeitorPedidosCsv.lerPedidosCsv();

//		for (int i = 0; i < pedidoCsv.size(); i++) {
//		PedidoCsv pedido = pedidoCsv.get(i);
//			System.out.println(pedido.getCategoria() + ": " + pedido.getProduto() + " " + pedido.getData());
//		}

		System.out.println("Total de pedidos: " + pedidoCsv.size());
		System.out.println("\n-- Listagem de pedidos: -- \n");

		System.out.println("\nCATEGORIA | PRODUTO | DATA ");
		for (PedidoCsv pedido : pedidoCsv) {
			System.out.println(pedido.getCategoria() + ": " + pedido.getProduto() + " - " +  pedido.getData());
		}
	}

}
