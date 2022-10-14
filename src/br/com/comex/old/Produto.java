package br.com.comex.old;

public class Produto {

	private static long proxID = 1;

	private long idProduto;
	private String descricao;
	private String nomeProd;
	protected double precoUnit;
	private int qtdEstoque;
	private String categoria;
	private double totalEstoque;
	protected double vImposto = 0;
	private double tImposto;

	
	public Produto () {
		
	}
	
	public Produto(long idProduto, String nomeProd, double precoUnit, int qtdEstoque, String categoria) {
		if (idProduto == proxID) {
			throw new IllegalArgumentException("O ID ESTA IGUAL AO CONTADOR");
		}

		if (idProduto == 0) {
			throw new IllegalArgumentException("O ID NULO, VERIFIQUE!");
		}
		
		this.idProduto = idProduto;
		this.nomeProd = nomeProd;
		this.precoUnit = precoUnit;
		this.qtdEstoque = qtdEstoque;
		this.categoria = categoria;
		proxID++;
	}

	public Produto(String nomeProd, double precoUnit, int qtdEstoque, String categoria) {

		this.idProduto = proxID;
		this.nomeProd = nomeProd;
		this.precoUnit = precoUnit;
		this.qtdEstoque = qtdEstoque;
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

		totalEstoque = qtdEstoque * precoUnit;
		return totalEstoque;

	}

	public double calculaImposto() { // 40 % do preço unitário
		// timposto = vimposto + preco_uni;

		vImposto = precoUnit * 0.4;
		if (idProduto == 10) {
			return 0;
		} else
			return vImposto;
	}

	public long getIdProduto() {
		return idProduto;
	}

	public void setId_produto(int id_produto) {
		this.idProduto = id_produto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNomeProd() {
		return nomeProd;
	}

	public String setNomeProd(String nome_prod) {
		return this.nomeProd = nome_prod;
	}

	public double getPrecoUnit() {
		return precoUnit;
	}

	public void setPrecoUnit(double d) {
		this.precoUnit = d;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtd_estoque) {
		this.qtdEstoque = qtd_estoque;
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

}
