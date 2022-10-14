package br.com.comex.modelo;

import java.math.BigDecimal;

// nomeado como crud para diferenciar do que ja havia sido feito

public class ProdutosCRUD {
	private Long id;
	private String nome;
	private String descricao;
	private BigDecimal preco_uni ;
	private int qtd_estoque;
	private String tipo;
	private int categoria_id;
	
	public ProdutosCRUD (String nome, String descricao, BigDecimal preco_uni, int qtd_estoque, int categoria_id, String tipo) {
		this.nome = nome;
		this.descricao = descricao;
		this.preco_uni = preco_uni;
		this.qtd_estoque = qtd_estoque;
		this.tipo = tipo;
		this.categoria_id = categoria_id;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public BigDecimal getPreco_uni() {
		return preco_uni;
	}
	public int getQtd_estoque() {
		return qtd_estoque;
	}
	public String getTipo() {
		return tipo;
	}
	public int getCategoria_id() {
		return categoria_id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setPreco_uni(BigDecimal preco_uni) {
		this.preco_uni = preco_uni;
	}
	public void setQtd_estoque(int qtd_estoque) {
		this.qtd_estoque = qtd_estoque;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setCategoria_id(int categoria_id) {
		this.categoria_id = categoria_id;
	}

	@Override
	public String toString() {
		return "ProdutosCRUD [id=" + getId() + ", nome=" + getNome() + ", descricao=" + getDescricao() + ", preco_uni=" + getPreco_uni()
				+ ", qtd_estoque=" + getQtd_estoque() + ", tipo=" + getTipo() + ", categoria_id=" + getCategoria_id() + "]";
	}
	
	
	
}
