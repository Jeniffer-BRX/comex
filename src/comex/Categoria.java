package comex;

import java.lang.String;

public class Categoria {

	private int id_cat = 0;
	private String nome_cat;
	private comex.Categoria.statusC statusC;

	public static enum statusC {

		ATIVA, INATIVA;
	}

	public Categoria() {
	} // construtor

	public Categoria(int id_cat, String nome_cat) {
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

	public Categoria.statusC getStatusC() {
		return statusC;
	}

	public void setStatusC(Categoria.statusC ativa) {
		this.statusC = ativa;
	}


	

}
