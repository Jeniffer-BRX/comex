package br.com.comex.main;

import java.io.FileNotFoundException;
import java.util.List;

import br.com.comex.csv.LeitorPedidosCsv;
import br.com.comex.csv.PedidoCsv;
import br.com.comex.csv.TotalCategoriasDistintas;
import br.com.comex.csv.TotalProdutosVendidos;

public class MainLeitorPedidoCsv {

	public static void main(String[] args) throws FileNotFoundException {

		//leitor arquivo
		LeitorPedidosCsv leitor = new LeitorPedidosCsv();
		List<PedidoCsv> pedidoCsv = LeitorPedidosCsv.lerPedidosCsv();

		// total itens vendidos
		List<PedidoCsv> totais = LeitorPedidosCsv.lerPedidosCsv();
		TotalProdutosVendidos totalItem = new TotalProdutosVendidos();
		
		// categorias distintas
		List<PedidoCsv> categorias = LeitorPedidosCsv.lerPedidosCsv();
		TotalCategoriasDistintas catDistinta = new TotalCategoriasDistintas();

		
		// quantidade de pedidos
		System.out.println("\n-- Quantidades de pedidos -- ");
		System.out.println("Total de pedidos: " + pedidoCsv.size());
		
		// quantidade itens vendidos
		System.out.println("\n-- Quantidades de produtos vendidos -- ");
		System.out.println("Total de itens vendidos: " + totalItem.calcularProdutosVendidos(totais));
		
		//total categorias distintas
		System.out.println("\n-- Quantidades de categorias distintas -- ");
		System.out.println("Total de categorias distintas: " + catDistinta.calcularCategoriaDistinta(categorias));
	}

}

/*
 * //leitor arquivo System.out.println("\nCATEGORIA | PRODUTO | DATA "); for
 * (PedidoCsv pedido : pedidoCsv) { System.out.println(pedido.getCategoria() +
 * ": " + pedido.getProduto() + " - " + pedido.getData()); }
 */