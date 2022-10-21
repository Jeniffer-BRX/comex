package br.com.comex.modelo;

import java.lang.String;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Categoria {

	private static long proximoID = 1;

	private long id;
	private String nome;
	private StatusCategoria status = StatusCategoria.ATIVA;

	public Categoria () {
	}
	
	public Categoria(String nome) {
	}

	public Categoria(long id, String nome, StatusCategoria status) {
		if (id == 0) {
			throw new IllegalArgumentException("O ID NULO, VERFIQUE!");
		}

		this.id = id;
		this.nome = nome;
		this.status = status;
		proximoID++;

	}

	public Categoria(String nome, StatusCategoria status) {
		
		this.id = proximoID;
		this.nome = nome;
		this.status = status;

		if (nome == null) { //validar nome
			throw new IllegalArgumentException("NOME EH OBRIGATORIO! VERIFIQUE ");
		}

		if (nome.length() <= 3) { //validar tamanho nome 
			throw new IllegalArgumentException("NOME DA CATEGORIA INVALIDO! DEVE SER MAIOR QUE 3 CHAR");
		}

		if (status != StatusCategoria.ATIVA && status != StatusCategoria.INATIVA) { //validacao status 
		  throw new IllegalArgumentException("CATEGORIA DEVE SER ATIVA OU INATIVA");
		}
}

	public long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
		return "Categoria [id=" + id + ", nome=" + nome + ", status=" + status + "]";
	}

	
	
}
