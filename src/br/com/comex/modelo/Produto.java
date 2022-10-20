package br.com.comex.modelo;

import java.math.BigDecimal;

public class Produto {

	private static long proxID = 1;

	private long id;
	private String descricao;
	private String nome;
	private double preco_uni;
	private int qtd_estoque;
	private String categoria;
	private int categoria_id;
	private String tipo;
	private double totalEstoque;
	protected double vImposto = 0;
	private double tImposto;

	
	public Produto () {
		
	}
	public Produto (String nome, String descricao, double preco_uni, int qtd_estoque, int categoria_id, String tipo) {
		this.nome = nome;
		this.descricao = descricao;
		this.preco_uni = preco_uni;
		this.qtd_estoque = qtd_estoque;
		this.tipo = tipo;
		this.categoria_id = categoria_id;
	}
	
	
	public Produto(long id, String nomeProd, double precoUnit, int qtdEstoque, String categoria) {
		if (id == proxID) {
			throw new IllegalArgumentException("O ID ESTA IGUAL AO CONTADOR");
		}

		if (id == 0) {
			throw new IllegalArgumentException("O ID NULO, VERIFIQUE!");
		}
		
		this.setId(id);
		this.nome = nomeProd;
		this.preco_uni = precoUnit;
		this.qtd_estoque = qtdEstoque;
		this.categoria = categoria;
		proxID++;
	}

	public Produto(String nomeProd, double precoUnit, int qtdEstoque, String categoria) {

		this.setId(proxID);
		this.nome = nomeProd;
		this.preco_uni = precoUnit;
		this.qtd_estoque = qtdEstoque;
		this.categoria = categoria;

		if (nomeProd == null) {
			throw new IllegalArgumentException("NOME EH OBRIGATORIO! VERIFIQUE ");
		}

		if (nomeProd.length() <= 5) {
			throw new IllegalArgumentException("NOME DO PRODUTO INVALIDO! DEVE SER MAIOR QUE 5 CHAR");
		}

		if (precoUnit == 0) {
			throw new IllegalArgumentException("PRECO INVALIDO, DEVE SER MAIOR QUE ZERO");
		}

		if (qtdEstoque == 0) {
			throw new IllegalArgumentException("QUANTIDADE INVALIDA, DEVE SER MAIOR QUE ZERO");
		}

		if (categoria == null) {
			throw new IllegalArgumentException("CATEGORIA INVALIDA, DEVE SER SER INFORMADA");
		}
	}

	public double calcTotalEstoque() { // multiplica a quantidade em estoque pelo preço unitário

		totalEstoque = qtd_estoque * preco_uni;
		return totalEstoque;

	}

	public double calculaImposto() { // 40 % do preço unitário
		// timposto = vimposto + preco_uni;

		vImposto = preco_uni * 0.4;
		if (getId() == 10) {
			return 0;
		} else
			return vImposto;
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNomeProd() {
		return nome;
	}

	public String setNomeProd(String nome_prod) {
		return this.nome = nome_prod;
	}

	public double getPrecoUnit() {
		return preco_uni;
	}

	public void setPrecoUnit(double d) {
		this.preco_uni = d;
	}

	public int getQtdEstoque() {
		return qtd_estoque;
	}

	public void setQtdEstoque(int qtd_estoque) {
		this.qtd_estoque = qtd_estoque;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String string) {
		this.categoria = string;
	}

	public double getTotalEstoque() {
		return totalEstoque;
	}

	public void setTotal_estoque(float total_estoque) {
		this.totalEstoque = total_estoque;
	}

	public double getImposto() {
		return vImposto;
	}

	public void setImposto(float imposto) {
		this.vImposto = imposto;
	}

	public double getImpostoT() {
		return tImposto;
	}

	public void setImpostoT(float timposto) {
		this.vImposto = timposto;
	}
	
	public int getCategoria_id() {
		return categoria_id;
	}

	public void setCategoria_id(int categoria_id) {
		this.categoria_id = categoria_id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

	public static void setProxID(long proxID) {
		Produto.proxID = proxID;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setPreco_uni(double preco_uni) {
		this.preco_uni = preco_uni;
	}
	public void setQtd_estoque(int qtd_estoque) {
		this.qtd_estoque = qtd_estoque;
	}
	public void setTotalEstoque(double totalEstoque) {
		this.totalEstoque = totalEstoque;
	}
	public void setvImposto(double vImposto) {
		this.vImposto = vImposto;
	}
	public void settImposto(double tImposto) {
		this.tImposto = tImposto;
	}
	@Override
	public String toString() {
		return "ProdutosCRUD [id=" + getId() + ", nome=" + getNomeProd() + ", descricao=" + getDescricao() + ", preco_uni=" + getPrecoUnit()
				+ ", qtd_estoque=" + getQtdEstoque() + ", tipo=" + getTipo() + ", categoria_id=" + getCategoria_id() + "]";
	}


}
