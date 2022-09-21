package comex;

import java.lang.String;

public class Categoria {

	private int id_cat = 0;
	private String nome_cat;
	private char statusC;

	public static enum statusC {

		ATIVA, INATIVA;
	}

	public Categoria() {
	} // construtor

	public Categoria(int id_cat, String nome_cat, String statusC) {
		super();
		this.id_cat = id_cat;
		this.nome_cat = nome_cat;

	}

	public int getId_cat() {
		return id_cat;
	}

	public void setId_cat(int id_cat) {
		this.id_cat = id_cat;
	}

	public String getNome_cat() {
		return nome_cat;
	}

	public void setNome_cat(String nome_cat) {
		this.nome_cat = nome_cat;
	}

	public char getStatusC() {
		return statusC;
	}

	public void setStatusC(char ativa) {
		this.statusC = ativa;
	}

	public void setStatusC(comex.Categoria.statusC inativa) {
		// TODO Auto-generated method stub

	}

}
