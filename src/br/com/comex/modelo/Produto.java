package br.com.comex.modelo;

public class Produto {

	private int id_produto = 0;
	private String descricao;
	private String nome_prod;
	protected double preco_uni;
	private int qtd_estoque;
	private String categoria;
	private double total_estoque;
	protected double vimposto=0;
	private double timposto;

	public Produto () {} // construtor 
	
	
	public double calcTotalEstoque () { // multiplica a quantidade em estoque pelo preço unitário
		
		total_estoque = qtd_estoque*preco_uni;
		return total_estoque;
		
	}
	
	public double calculaImposto () { //40 % do preço unitário
		//timposto = vimposto + preco_uni;
		
		vimposto = preco_uni * 0.4;
		if (id_produto == 2) {
			return 0;
		} else return vimposto;
	}

	public int getId_produto() {
		return id_produto;
	}

	public void setId_produto(int id_produto) {
		this.id_produto = id_produto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNome_prod() {
		return nome_prod;
	}
	
	public String setNome_prod(String nome_prod) {
		return this.nome_prod = nome_prod;
	}	

	public double getPreco_uni() {
		return preco_uni;
	}

	public void setPreco_uni(double d) {
		this.preco_uni = d;
	}

	public int getQtd_estoque() {
		return qtd_estoque;
	}

	public void setQtd_estoque(int qtd_estoque) {
		this.qtd_estoque = qtd_estoque;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String string) {
		this.categoria = string;
	}

	public double getTotal_estoque() {
		return total_estoque;
	}

	public void setTotal_estoque(float total_estoque) {
		this.total_estoque = total_estoque;
	}

	public double getImposto() {
		return vimposto;
	}

	public void setImposto(float imposto) {
		this.vimposto = imposto;
	}
	
	public double getImpostoT() {
		return timposto;
	}

	public void setImpostoT(float timposto) {
		this.vimposto = timposto;
	}

	
}
