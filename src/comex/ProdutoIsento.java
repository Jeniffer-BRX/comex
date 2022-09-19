package comex;

public class ProdutoIsento {

		private int id_produto = 0;
		private char descricao;
		private char nome_prod;
		private float preco_uni;
		private int qtd_estoque;
		private char categoria;

		public ProdutoIsento () {}
		
		
		public void calcTotalEstoque () { //multiplica a quantidade em estoque pelo preço unitário
			return;
		}
		
		public void calculaImposto () { //	na main fazer o id 2 ficar isento
			return;
		}

		public int getId_produto() {
			return id_produto;
		}

		public void setId_produto(int id_produto) {
			this.id_produto = id_produto;
		}

		public char getDescricao() {
			return descricao;
		}

		public void setDescricao(char descricao) {
			this.descricao = descricao;
		}

		public char getNome_prod() {
			return nome_prod;
		}

		public void setNome_prod(char nome_prod) {
			this.nome_prod = nome_prod;
		}

		public float getPreco_uni() {
			return preco_uni;
		}

		public void setPreco_uni(float preco_uni) {
			this.preco_uni = preco_uni;
		}

		public int getQtd_estoque() {
			return qtd_estoque;
		}

		public void setQtd_estoque(int qtd_estoque) {
			this.qtd_estoque = qtd_estoque;
		}

		public char getCategoria() {
			return categoria;
		}

		public void setCategoria(char categoria) {
			this.categoria = categoria;
		}
		
		
		
		
	}
