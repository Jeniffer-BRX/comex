package br.com.comex.main;

import java.io.FileNotFoundException;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.spi.CurrencyNameProvider;

import br.com.comex.csv.LeitorPedidosCsv;
import br.com.comex.csv.MontanteTotalVendas;
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
		
		//montante de vendas
		List<PedidoCsv> mTotalVendas = LeitorPedidosCsv.lerPedidosCsv();
		MontanteTotalVendas montanteVendas = new MontanteTotalVendas();
	
		Locale localeBR = new Locale("pt","BR");
		NumberFormat montanteFormatado = NumberFormat.getCurrencyInstance(localeBR); 
		double valorReal = 291933.1233;
		
	
		
		// quantidade de pedidos
		System.out.println("\n-- Quantidades de pedidos -- ");
		System.out.println("Total de pedidos: " + pedidoCsv.size());
		
		// quantidade itens vendidos
		System.out.println("\n-- Quantidades de produtos vendidos -- ");
		System.out.println("Total de itens vendidos: " + totalItem.calcularProdutosVendidos(totais));
		
		//total categorias distintas
		System.out.println("\n-- Quantidades de categorias distintas -- ");
		System.out.println("Total de categorias distintas: " + catDistinta.calcularCategoriaDistinta(categorias));
		
		//montante total de vendas
		System.out.println("\n-- Montante Total de Vendas -- ");
		System.out.print("Valor do montante de vendas: " + montanteVendas.calcularMontanteTotalVendas(mTotalVendas));
		//System.out.println(" \n" + montanteFormatado.format(montanteVendas));
		
	}

}

/*
 * //leitor arquivo System.out.println("\nCATEGORIA | PRODUTO | DATA "); for
 * (PedidoCsv pedido : pedidoCsv) { System.out.println(pedido.getCategoria() +
 * ": " + pedido.getProduto() + " - " + pedido.getData()); }
 */