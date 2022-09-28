package br.com.comex.modelo;

import java.lang.String;

public class Categoria {

	private static long proximoID = 1;

	private long idCategoria;
	private String nomeCategoria;
	private StatusCategoria status;

	public Categoria(long id, String nome_cat, StatusCategoria status) {
		if (id == proximoID) {
			throw new IllegalArgumentException("O ID ESTA IGUAL AO CONTADOR");
		}
		
		if (id == 0) {
			throw new IllegalArgumentException("O ID NULO, VERFIQUE!");
		}

		this.idCategoria = id;
		this.nomeCategoria = nome_cat;
		this.status = status;
		proximoID++;

	}

	public Categoria(String nome_cat, StatusCategoria status) {
		
		this.idCategoria = proximoID;
		this.nomeCategoria = nome_cat;
		this.status = status;

		if (nome_cat == null) { //validar nome
			throw new IllegalArgumentException("NOME EH OBRIGATORIO! VERIFIQUE ");
		}

		if (nome_cat.length() <= 3) { //validar tamanho nome 
			throw new IllegalArgumentException("NOME DA CATEGORIA INVALIDO! DEVE SER MAIOR QUE 3 CHAR");
		}

		if (status != StatusCategoria.ATIVA && status != StatusCategoria.INATIVA) { //validacao status 
		  throw new IllegalArgumentException("CATEGORIA DEVE SER ATIVA OU INATIVA");
		}
		
}
	/**/

	public long getId_cat() {
		return idCategoria;
	}

	public void setId_cat(int id_cat) {
		this.idCategoria = id_cat;
	}

	public String getNome_cat() {
		return nomeCategoria;
	}

	public void setNome_cat(String nome_cat) {
		this.nomeCategoria = nome_cat;
	}

	public StatusCategoria getStatus() {
		return status;
	}

	public void setStatus(StatusCategoria status) {
		this.status = status;
	}

}
