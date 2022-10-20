package br.com.comex.modelo;

import java.lang.String;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Categoria {

	private static long proximoID = 1;

	private long id;
	private String categoria;
	private StatusCategoria status;

	public Categoria() {
		super();
	}
	
	public Categoria(String nome) {
	}

	public Categoria(String nome, String status) {
	}
	
	public Categoria(long id, String categoria, StatusCategoria status) {
		if (id == 0) {
			throw new IllegalArgumentException("O ID NULO, VERFIQUE!");
		}

		this.id = id;
		this.categoria = categoria;
		this.status = status;
		proximoID++;

	}

	public Categoria(String categoria, StatusCategoria status) {
		
		this.id = proximoID;
		this.categoria = categoria;
		this.status = status;

		if (categoria == null) { //validar nome
			throw new IllegalArgumentException("NOME EH OBRIGATORIO! VERIFIQUE ");
		}

		if (categoria.length() <= 3) { //validar tamanho nome 
			throw new IllegalArgumentException("NOME DA CATEGORIA INVALIDO! DEVE SER MAIOR QUE 3 CHAR");
		}

		if (status != StatusCategoria.ATIVA && status != StatusCategoria.INATIVA) { //validacao status 
		  throw new IllegalArgumentException("CATEGORIA DEVE SER ATIVA OU INATIVA");
		}
		
}

	public long getId() {
		return id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public StatusCategoria getStatus() {
		return status;
	}

	public void setStatus(StatusCategoria status) {
		this.status = status;
	}

	public static long getProximoID() {
		return proximoID;
	}

	public static void setProximoID(long proximoID) {
		Categoria.proximoID = proximoID;
	}
	
	
	@Override
	public String toString() {
		return "Categoria [id=" + id + ", categoria=" + categoria + ", status=" + status + "]";
	}

	
	
}
