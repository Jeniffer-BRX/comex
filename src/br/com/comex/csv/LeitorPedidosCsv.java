package br.com.comex.csv;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeitorPedidosCsv {

	public static List<PedidoCsv> lerPedidosCsv() throws FileNotFoundException {
		List<PedidoCsv> pedidos = new ArrayList<PedidoCsv>();

		InputStream fis = new FileInputStream("pedido.csv"); 
		Scanner scan = new Scanner(fis);

		scan.nextLine(); // pula linha 

		while (scan.hasNextLine()) {
			String linha = scan.nextLine();

			String[] valores = linha.split(",");
			
			String categoria = valores[0];
			String produto = valores[1];
			String preco = valores[2];
			String quantidade = valores[3];
			String data = valores[4];
			String cliente = valores[5];
			
			PedidoCsv pedido = new PedidoCsv(categoria, produto, cliente, preco, quantidade, data);

			pedidos.add(pedido);
			
		}
		scan.close();
		return pedidos;

	}

}
