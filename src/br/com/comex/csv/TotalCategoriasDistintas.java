package br.com.comex.csv;

import java.util.ArrayList;
import java.util.List;


public class TotalCategoriasDistintas {
	
	public int calcularCategoriaDistinta(List<PedidoCsv> categoria) {
		List<String> categoriaDistinta = new ArrayList<>();
		
		for (PedidoCsv categoriaCsv : categoria) {
			String cat = categoriaCsv.getCategoria();
			if (!categoriaDistinta.contains(cat)) {
				categoriaDistinta.add(cat);
			}
			
		}
		return categoriaDistinta.size();
	}

}